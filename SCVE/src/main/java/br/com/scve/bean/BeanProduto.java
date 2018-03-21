package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Produto;
import br.com.scve.modelo.servico.ServicoProduto;

@Named
@ViewScoped
public class BeanProduto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Produto produto = new Produto();
	@Inject
	private ServicoProduto servico;
	
	private List<Produto> lista;

	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
		
		this.produto = this.getProduto();
	}
	
	public String salvar(){
		servico.salvar(produto);
		lista = servico.consultar();
		
		return "lista-produto";
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getLista() {
		return lista;
	}
	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}
	
	public String excluir() {
		servico.excluir(produto.getIdproduto());

		lista = servico.consultar();

		return "lista-produto";
	}

}
