package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.entidades.ListaPrecoItem;
import br.com.scve.entidades.Produto;
import br.com.scve.modelo.servico.ServicoListaPreco;
import br.com.scve.modelo.servico.ServicoProduto;

@Named
@ViewScoped
public class BeanListaPreco implements Serializable{
	private static final long serialVersionUID = 1L;

	private ListaPreco listapreco = new ListaPreco();
	private ListaPrecoItem listaprecoitem = new ListaPrecoItem();
	
	@Inject
	private ServicoListaPreco servico;
	@Inject
	private ServicoProduto servicoProd;
	private List<ListaPreco> lista;
	private List<ListaPrecoItem> listaprecoitems = new ArrayList<>();

	
	
	public String salvar(){
		servico.salvar(listapreco);
		lista = servico.consultar();
		return "listaCidade";
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
			listaprecoitems.add(index, listaprecoitem);
		}else{
			listaprecoitem.setListapreco(listapreco);
			listaprecoitems.add(listaprecoitem);
		}
		listaprecoitem = new ListaPrecoItem();
				
	}
	
	public void excluiritem(){
		this.listaprecoitems.remove(listaprecoitem);
	}

}
