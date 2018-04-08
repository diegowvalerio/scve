package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
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
import br.com.scve.modelo.servico.ServicoProduto;
import br.com.scve.modelo.servico.ServicoTipoMv;
import br.com.scve.modelo.servico.ServicoVendedor;


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
	private ServicoProduto servicoProd;
	@Inject
	private ServicoListaPreco servicoListapreco;
	@Inject
	private ServicoVendedor servicoVendedor;
	
	private List<Movimento> lista;
	private List<ItemMov> items = new ArrayList<>();

	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
			
		/*this.cliente = this.getCliente();
		this.opcao = this.cliente.getTipojf();
		this.enderecos = this.cliente.getEnderecos();
		this.contatos = this.cliente.getContatos();*/
		
		this.movimento = this.getMovimento();
		this.items = this.movimento.getItems();
	}
	
	public List<ListaPrecoItem> listasprecos(){
		List<ListaPrecoItem> listaprecoi = new ArrayList<>();
		if (item.getProduto() != null){
		Integer idtipo = Integer.parseInt(movimento.getTipomv().toString());
		Integer idvend = Integer.parseInt(movimento.getVendresp().toString());
		Integer idprod = Integer.parseInt(item.getProduto().toString());
		
		listaprecoi = servicoListapreco.buscapreco(idtipo, idvend, idprod);
		}else{
		listaprecoi =null;	
		}
		return listaprecoi;	
	}
	
	public String salvar() {
		movimento.setTotalvenda(0.0);
		servico.salvar(movimento);
		lista = servico.consultar();

		return "lista-movimentacao";
	}

	public String excluir() {

		servico.excluir(movimento.getIdmov());

		lista = servico.consultar();

		return "lista-movimentacao";
	}

	public ItemMov getItem() {
		return item;
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
	/*cabeçalho da movimentacao */
	public List<TipoMv> getTipoMvs(){
		return servicoTipomv.consultarAtivos();
	}
	
	public List<Cliente> completaCliente(String nome) {
		
		Integer v = 0;
		v = getMovimento().getVendresp().getIdpessoa();
		
		//System.out.println(v);
		//return servicoCliente.buscaclientenome(nome);
		return servicoCliente.buscaclientenomeevendedor(nome,v);
	}
	
	public List<Cliente> getClientesAtivos() {
		return servicoCliente.consultarAtivos();
	}
	
	public List<FormaPag> getFormaPags(){
		return servicoFormapag.consultarAtivos();
	}
	
	public List<Vendedor> vendedores(){
		
		//Integer idtipo =0;
		List<Vendedor> vendedores =new ArrayList<>();
		List<TipoMvVend> tipomvvends =new ArrayList<>();
		if(getMovimento().getTipomv() != null){
			tipomvvends.addAll( getMovimento().getTipomv().getTipomvvends());
		
		for (TipoMvVend tipomvvend : tipomvvends){
			Vendedor ve = new Vendedor();
			ve = tipomvvend.getVendedor();
			 vendedores.add(ve);
			}
		}
		//return servicoVendedor.consultarAtivos();
		return vendedores;
	}
	
	public List<CondPgto> getCondipagtos(){
		return servicoCondpagto.consultarAtivos();
	}
	
	//public void filtracliente(){
		//Vendedor vend = (Vendedor) movimento.getVendresp();	
		 //System.out.println("Formapag: "+getMovimento().getVendresp());
		
	//}
	
	
    /* fim cabecalho da movimentacao*/
	
	/*produtos*/
	public void addNovoProduto() {
		if (this.movimento.getTipomv() == null) {
			throw new RuntimeException("O Tipo de Movimento não pode ser nulo");
		} else {
			this.item = new ItemMov();
		}
	}
	
	public void removerProduto() {
		int index = items.indexOf(item);
		if (index > -1) {
		this.items.remove(index);
		}
}
	
	public List<Produto> completaProduto(String descricao) {
		
		Integer v,t,l= 0;
		 v = getMovimento().getVendresp().getIdpessoa();
		 t = getMovimento().getTipomv().getIdmv();
		 
		ListaPreco li = new ListaPreco();
		List<TipoMvVend>  tipomvvs = servicoTipomv.buscalistapreco(t,v);
		for (TipoMvVend ti : tipomvvs){
			li = ti.getListapreco();
			}
		l = Integer.parseInt(li.getIdlista().toString());
		
		List<ListaPrecoItem> listaprecoitens = new ArrayList<>();
		listaprecoitens = servicoListapreco.buscaitens( l, descricao);
		
		List<Produto> produtos = new ArrayList<>();
		if (getMovimento().getTipomv() != null && getMovimento().getVendresp() != null){
		for (ListaPrecoItem list : listaprecoitens){
			Produto ve = new Produto();
			ve = list.getProduto();
			produtos.add(ve);
			}
		}
		return produtos;
		//return servicoProd.consultaprodutopelonome(descricao);
	}
	
	public void editarsalvarProduto() {
		
		if(item.getProduto() == null){
			throw new IllegalArgumentException("Produto nao pode ser nulo");	
	    }
		try {
			int index = items.indexOf(item);
			if (index > -1) {
				items.remove(index);
				item.setMovimento(movimento);
				items.add(index, item);
			}else{
				item.setMovimento(movimento);
				items.add(item);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		item = new ItemMov();
	}
	/*fim produtos*/
	
	
	
	/*editar movimento*/
	 public String encaminha() {
		 FacesContext fc = FacesContext.getCurrentInstance();
		 HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
		 session.setAttribute("movimentoAux", this.movimento );
		 
		 return "edita-movimentacao";
	 }
	 
		
}
