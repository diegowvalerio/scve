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
import br.com.scve.entidades.ListaPrecoItem;
import br.com.scve.entidades.Movimento;
import br.com.scve.entidades.Produto;
import br.com.scve.entidades.TipoMv;
import br.com.scve.modelo.servico.ServicoCliente;
import br.com.scve.modelo.servico.ServicoCondicaoPagto;
import br.com.scve.modelo.servico.ServicoFormaPag;
import br.com.scve.modelo.servico.ServicoListaPreco;
import br.com.scve.modelo.servico.ServicoMovimento;
import br.com.scve.modelo.servico.ServicoProduto;
import br.com.scve.modelo.servico.ServicoTipoMv;


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
	
	private List<Movimento> lista;
	private List<ItemMov> items = new ArrayList<>();

	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
			
		/*this.cliente = this.getCliente();
		this.opcao = this.cliente.getTipojf();
		this.enderecos = this.cliente.getEnderecos();
		this.contatos = this.cliente.getContatos();*/
	}
	
	public List<ListaPrecoItem> listasprecos(){
		List<ListaPrecoItem> listaprecoi;
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
		return servicoCliente.buscaclientenome(nome);
	}
	
	public List<FormaPag> getFormaPags(){
		return servicoFormapag.consultarAtivos();
	}
	
	public List<CondPgto> getCondipagtos(){
		return servicoCondpagto.consultarAtivos();
	}
	
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
		return servicoProd.consultaprodutopelonome(descricao);
	}
	
	public void editarsalvarProduto() {
		
		if(item.getProduto() == null){
			throw new IllegalArgumentException("Produto nao pode ser nulo");	
	    }
		int index = items.indexOf(item);
		if (index > -1) {
			items.remove(index);
			item.setMovimento(movimento);
			items.add(index, item);
		}else{
			item.setMovimento(movimento);
			items.add(item);
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
