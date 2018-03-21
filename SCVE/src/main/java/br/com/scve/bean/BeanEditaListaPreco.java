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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.entidades.ListaPrecoItem;
import br.com.scve.entidades.Produto;
import br.com.scve.modelo.servico.ServicoListaPreco;
import br.com.scve.modelo.servico.ServicoProduto;

@Named
@ViewScoped
public class BeanEditaListaPreco implements Serializable{
	private static final long serialVersionUID = 1L;

	private ListaPreco listapreco = new ListaPreco();
	private ListaPrecoItem listaprecoitem = new ListaPrecoItem();
	
	@Inject
	private ServicoListaPreco servico;
	@Inject
	private ServicoProduto servicoProd;
	private List<ListaPreco> lista;
	private List<ListaPrecoItem> listaprecoitems = new ArrayList<>();

	private Date dt = new Date();
	
	@PostConstruct
	public void carregar(){
		
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpSession session = (HttpSession) request.getSession();
		this.listapreco = (ListaPreco) session.getAttribute("listaprecoAux");
		session.removeAttribute("listaprecoAux");
		
		this.listapreco = this.getListapreco();
		this.dt = this.listapreco.getDtcadastro();
		this.listapreco.setDtcadastro(dt);
		this.listaprecoitems = this.listapreco.getListaprecoitens();
		
		
	}
	
	public String salvar(){
			
		servico.salvar(listapreco);
		lista = servico.consultar();
		
		return "lista-listapreco";
	}
	
	public String excluir() {
		servico.excluir(listapreco.getIdlista());

		lista = servico.consultar();

		return "lista-listapreco";
	}
	
	public List<Produto> getProdutos(){
		return servicoProd.consultar();
	}

	public ListaPreco getListapreco() {
		return listapreco;
	}

	public void setListapreco(ListaPreco listapreco) {
		this.listapreco = listapreco;
	}

	public List<ListaPreco> getLista() {
		return lista;
	}

	public void setLista(List<ListaPreco> lista) {
		this.lista = lista;
	}

	public ListaPrecoItem getListaprecoitem() {
		return listaprecoitem;
	}

	public void setListaprecoitem(ListaPrecoItem listaprecoitem) {
		this.listaprecoitem = listaprecoitem;
	}

	public List<ListaPrecoItem> getListaprecoitems() {
		return listaprecoitems;
	}

	public void setListaprecoitems(List<ListaPrecoItem> listaprecoitems) {
		this.listaprecoitems = listaprecoitems;
	}
	
	/*listaprecoitem*/

	
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public void novoitem(){
		 this.listaprecoitem = new ListaPrecoItem();
		
	}
	
	public void additem(){
		if(listaprecoitem == null){
			throw new IllegalArgumentException("Lista nao pode ser nulo");
	    }
		int index = listaprecoitems.indexOf(listaprecoitem);
		if (index > -1) {
			listaprecoitems.remove(index);
			listaprecoitem.setListapreco(listapreco);
			listaprecoitem.setDtultimaalt(dt);
			listaprecoitems.add(index, listaprecoitem);
		}else{
			listaprecoitem.setListapreco(listapreco);
			listaprecoitem.setDtultimaalt(dt);
			listaprecoitems.add(listaprecoitem);
		}
		listaprecoitem = new ListaPrecoItem();
				
	}
	
	public void excluiritem(){
		this.listaprecoitems.remove(listaprecoitem);
	}
	
	public List<Produto> completaProduto(String descricao){
		return servicoProd.consultaprodutopelonome(descricao);
	}
	


}
