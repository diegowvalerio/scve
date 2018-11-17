package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import br.com.scve.entidades.Cliente;
import br.com.scve.entidades.CondPgto;
import br.com.scve.entidades.FormaPag;
import br.com.scve.entidades.ItemMov;
import br.com.scve.entidades.ListaPreco;
import br.com.scve.entidades.ListaPrecoItem;
import br.com.scve.entidades.Movimento;
import br.com.scve.entidades.Produto;
import br.com.scve.entidades.TipoMv;
import br.com.scve.entidades.TipoMvVend;
import br.com.scve.entidades.Vendedor;
import br.com.scve.modelo.servico.ServicoCliente;
import br.com.scve.modelo.servico.ServicoCondicaoPagto;
import br.com.scve.modelo.servico.ServicoFormaPag;
import br.com.scve.modelo.servico.ServicoListaPreco;
import br.com.scve.modelo.servico.ServicoMovimento;
import br.com.scve.modelo.servico.ServicoTipoMv;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanMovimento implements Serializable {
	private static final long serialVersionUID = 1L;

	private Movimento movimento = new Movimento();
	private ItemMov item = new ItemMov();
	@Inject
	private ServicoMovimento servico;
	@Inject
	private ServicoCliente servicoCliente;
	@Inject
	private ServicoTipoMv servicoTipomv;
	@Inject
	private ServicoFormaPag servicoFormapag;
	@Inject
	private ServicoCondicaoPagto servicoCondpagto;
	@Inject
	private ServicoListaPreco servicoListapreco;

	private List<Movimento> lista = new ArrayList<>();
	private List<ItemMov> items = new ArrayList<>();

	private List<ListaPrecoItem> listaprecoi = new ArrayList<>();
	private List<ListaPrecoItem> listaprecoip = new ArrayList<>();

	private Date dt = new Date();
	private double totalvenda = 0.0;

	/* filtro relatorio */
	private String filtro_tipo;
	private String filtro_vendedor;
	private String filtro_vendedor1;
	private String filtro_cliente;
	private String filtro_cliente1;
	private Date filtro_data = new Date();
	private Date filtro_data1 = new Date();

	@PostConstruct
	public void carregar() {
		lista = servico.consultar();
		this.movimento.setDtvenda(dt);
		this.movimento.setTotalvenda(0.00);

		this.movimento = this.getMovimento();
		this.items = this.movimento.getItems();

	}

	public void calcularItem() {
		if (item.getQtde() == null) {
			item.setQtde(0);
		}
		if (item.getDesconto() == null) {
			item.setDesconto(0.0);
		}
		if (item.getValor() == null) {
			item.setValor(0.0);
		}
		item.setSubtotal((item.getQtde() * item.getValor()) - item.getDesconto());
	}

	public void calcularItem_total() {
		if (item.getQtde() != null || item.getValor() != null) {
			// item.setSubtotal((item.getQtde()*
			// item.getValor())-item.getDesconto());
			item.setDesconto((item.getQtde() * item.getValor()) - item.getSubtotal());
		}
	}

	public List<ListaPrecoItem> listasprecos() {

		/*
		 * if (item.getProduto() != null){ Integer idtipo =
		 * Integer.parseInt(movimento.getTipomv().toString()); Integer idvend =
		 * Integer.parseInt(movimento.getVendresp().toString()); Integer idprod
		 * = Integer.parseInt(item.getProduto().toString());
		 * 
		 * listaprecoi = servicoListapreco.buscapreco(idtipo, idvend, idprod);
		 * }else{ listaprecoi =null; }
		 */

		List<ListaPrecoItem> precos = new ArrayList<>();

		if (item.getProduto() != null) {
			for (ListaPrecoItem list : listaprecoi) {
				if (list.getProduto().equals(item.getProduto())) {
					precos.add(list);
				}
			}
			for (ListaPrecoItem listp : listaprecoip) {
				if (listp.getProduto().equals(item.getProduto())) {
					precos.add(listp);
				}
			}
		}

		return precos;
	}

	public String salvar() {
		try {
			if (movimento.getVendresp() != null) {
				movimento.setPerc_comissao(movimento.getVendresp().getPerc_comissao());
			}
			movimento.setTotalvenda(totalvenda);
			servico.salvar(movimento);
			lista = servico.consultar();

			return "lista-movimentacao";
		} catch (Exception e) {
			FacesMessageUtil.addMensagemError(e.getCause().toString());
			return null;
		}
	}

	public String excluir() {
		try {
			servico.excluir(movimento.getIdmov());
		} catch (Exception e) {
			if (e.getCause().toString().contains("ConstraintViolationException")) {
				FacesMessageUtil
						.addMensagemError("Registro utilizado em outro local! Não foi possível realizar a operação.");
			} else {
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();

		return "lista-movimentacao";
	}

	public ItemMov getItem() {
		return item;
	}

	public double getTotalvenda() {
		return totalvenda;
	}

	public void setTotalvenda(double totalvenda) {
		this.totalvenda = totalvenda;
	}

	public void setItem(ItemMov item) {
		this.item = item;
	}

	public Movimento getMovimento() {
		return movimento;
	}

	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}

	public List<Movimento> getLista() {
		return lista;
	}

	public void setLista(List<Movimento> lista) {
		this.lista = lista;
	}

	public List<ItemMov> getItems() {
		return items;
	}

	public void setItems(List<ItemMov> items) {
		this.items = items;
	}

	/* cabeçalho da movimentacao */
	public List<TipoMv> getTipoMvs() {
		return servicoTipomv.consultarAtivos();
	}

	public List<Cliente> completaCliente(String nome) {

		Integer v = 0;
		v = getMovimento().getVendresp().getIdpessoa();

		// System.out.println(v);
		// return servicoCliente.buscaclientenome(nome);
		return servicoCliente.buscaclientenomeevendedor(nome, v);
	}

	public List<Cliente> getClientesAtivos() {
		return servicoCliente.consultarAtivos();
	}

	public List<FormaPag> getFormaPags() {
		return servicoFormapag.consultarAtivos();
	}

	public List<Vendedor> vendedores() {

		// Integer idtipo =0;
		List<Vendedor> vendedores = new ArrayList<>();
		List<TipoMvVend> tipomvvends = new ArrayList<>();
		if (getMovimento().getTipomv() != null) {
			tipomvvends.addAll(getMovimento().getTipomv().getTipomvvends());

			for (TipoMvVend tipomvvend : tipomvvends) {
				Vendedor ve = new Vendedor();
				ve = tipomvvend.getVendedor();
				vendedores.add(ve);
			}
		}
		// return servicoVendedor.consultarAtivos();
		return vendedores;
	}

	public List<CondPgto> getCondipagtos() {
		return servicoCondpagto.consultarAtivos();
	}

	// public void filtracliente(){
	// Vendedor vend = (Vendedor) movimento.getVendresp();
	// System.out.println("Formapag: "+getMovimento().getVendresp());

	// }

	/* fim cabecalho da movimentacao */

	/* produtos */
	public void addNovoProduto() {
		if (this.movimento.getTipomv() == null) {
			throw new RuntimeException("O Tipo de Movimento não pode ser nulo");
		} else {
			item = new ItemMov();
			item.setMovimento(movimento);
			item.setQtde(0);

		}
	}

	public void removerProduto() {
		int index = items.indexOf(item);
		if (index > -1) {
			this.items.remove(index);
		}
	}

	public List<Produto> completaProduto(String descricao) {

		Integer v, t, l, lp = 0;
		v = getMovimento().getVendresp().getIdpessoa();
		t = getMovimento().getTipomv().getIdmv();
		/* busca lista d epreco principal */
		ListaPreco li = new ListaPreco();
		List<TipoMvVend> tipomvvs = servicoTipomv.buscalistapreco(t, v);
		for (TipoMvVend ti : tipomvvs) {
			li = ti.getListapreco();
		}
		l = Integer.parseInt(li.getIdlista().toString());
		/* fim */

		/* busca lista d epreco promoção */
		ListaPreco lip = new ListaPreco();
		// List<TipoMvVend> tipomvvs = servicoTipomv.buscalistapreco(t,v);
		for (TipoMvVend tip : tipomvvs) {
			if (tip.getListaprecopromocao() != null) {
				lip = tip.getListaprecopromocao();
				lp = Integer.parseInt(lip.getIdlista().toString());
			}
		}

		/* busca itens da lista principal */
		// List<ListaPrecoItem> listaprecoitens = new ArrayList<>();
		listaprecoi = servicoListapreco.buscaitens(l, descricao);

		List<Produto> produtos = new ArrayList<>();
		if (getMovimento().getTipomv() != null && getMovimento().getVendresp() != null) {
			for (ListaPrecoItem list : listaprecoi) {
				Produto ve = new Produto();
				ve = list.getProduto();
				produtos.add(ve);
			}
		}
		/* fim e retorna os itens */

		/* busca itens da lista promoção */
		if (lp != null) {
			listaprecoip = servicoListapreco.buscaitens(lp, descricao);
		}
		/* fim */

		/* retorna itens da principal */
		return produtos;

		// return servicoProd.consultaprodutopelonome(descricao);
	}

	public void editarsalvarProduto() {

		if (item.getProduto() == null || item.getQtde() == 0 || item.getSubtotal() == 0 ) {
			FacesMessageUtil.addMensagemError("Preencha os dados corretamente");
		} else {
			try {
				int index = items.indexOf(item);
				if (index > -1) {
					items.remove(index);
					item.setMovimento(movimento);
					items.add(index, item);
				} else {
					item.setMovimento(movimento);
					items.add(item);
				}
				totalvenda = 0.0;
				for (ItemMov itm : items) {
					totalvenda = totalvenda + itm.getSubtotal();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			item = new ItemMov();
		}
	}
	/* fim produtos */

	/* editar movimento */
	public String encaminha() {
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
		session.setAttribute("movimentoAux", this.movimento);

		return "edita-movimentacao";
	}

	/* relatorios */

	public String getFiltro_tipo() {
		return filtro_tipo;
	}

	public void setFiltro_tipo(String filtro_tipo) {
		this.filtro_tipo = filtro_tipo;
	}

	public String getFiltro_vendedor() {
		return filtro_vendedor;
	}

	public void setFiltro_vendedor(String filtro_vendedor) {
		this.filtro_vendedor = filtro_vendedor;
	}

	public String getFiltro_vendedor1() {
		return filtro_vendedor1;
	}

	public void setFiltro_vendedor1(String filtro_vendedor1) {
		this.filtro_vendedor1 = filtro_vendedor1;
	}

	public String getFiltro_cliente() {
		return filtro_cliente;
	}

	public void setFiltro_cliente(String filtro_cliente) {
		this.filtro_cliente = filtro_cliente;
	}

	public String getFiltro_cliente1() {
		return filtro_cliente1;
	}

	public void setFiltro_cliente1(String filtro_cliente1) {
		this.filtro_cliente1 = filtro_cliente1;
	}

	public Date getFiltro_data() {
		return filtro_data;
	}

	public void setFiltro_data(Date filtro_data) {
		this.filtro_data = filtro_data;
	}

	public Date getFiltro_data1() {
		return filtro_data1;
	}

	public void setFiltro_data1(Date filtro_data1) {
		this.filtro_data1 = filtro_data1;
	}

	public void rel_movimentacoes_lista() {
		Relatorio<Movimento> report = new Relatorio<Movimento>();
		if (lista.size() > 0) {
			report.rel_movimentacoes_lista(filtro_tipo, filtro_vendedor, filtro_vendedor1, filtro_cliente,
					filtro_cliente1, filtro_data, filtro_data1);
		} else {
			FacesMessageUtil.addMensagemWarn("Não há registros!");
		}
	}

	public void rel_comissao_lista() {
		Relatorio<Movimento> report = new Relatorio<Movimento>();
		if (lista.size() > 0) {
			report.rel_comissao_lista(filtro_tipo, filtro_vendedor, filtro_vendedor1, filtro_cliente, filtro_cliente1,
					filtro_data, filtro_data1);
		} else {
			FacesMessageUtil.addMensagemWarn("Não há registros!");
		}
	}

	/* frim relatorios */

}
