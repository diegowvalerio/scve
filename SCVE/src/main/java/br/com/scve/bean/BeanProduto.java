package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.com.scve.entidades.Produto;
import br.com.scve.modelo.servico.ServicoProduto;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanProduto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Produto produto = new Produto();
	@Inject
	private ServicoProduto servico;
	
	private List<Produto> lista;
	
	//filtros de relatorio
		private String filtro_situacao;
		private String filtro_produto;
		private String filtro_produto1;
		private String filtro_descricao ;
		private String filtro_descabreviada ;
		private String filtro_ean ;

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

	/* RELATORIOS */
	/*gets e seters*/
	
	public String getFiltro_situacao() {
		return filtro_situacao;
	}

	public void setFiltro_situacao(String filtro_situacao) {
		this.filtro_situacao = filtro_situacao;
	}

	public String getFiltro_produto() {
		return filtro_produto;
	}

	public void setFiltro_produto(String filtro_produto) {
		this.filtro_produto = filtro_produto;
	}

	public String getFiltro_produto1() {
		return filtro_produto1;
	}

	public void setFiltro_produto1(String filtro_produto1) {
		this.filtro_produto1 = filtro_produto1;
	}

	public String getFiltro_descricao() {
		return filtro_descricao;
	}

	public void setFiltro_descricao(String filtro_descricao) {
		this.filtro_descricao = filtro_descricao;
	}

	public String getFiltro_descabreviada() {
		return filtro_descabreviada;
	}

	public void setFiltro_descabreviada(String filtro_descabreviada) {
		this.filtro_descabreviada = filtro_descabreviada;
	}

	public String getFiltro_ean() {
		return filtro_ean;
	}

	public void setFiltro_ean(String filtro_ean) {
		this.filtro_ean = filtro_ean;
	}

	/*get e set*/
	
	public void rel_produtos_lista() {
		Relatorio<Produto> report = new Relatorio<Produto>();
		if (lista.size() > 0) {
			report.rel_produtos_lista(filtro_situacao,filtro_descabreviada,filtro_descricao,filtro_ean,filtro_produto,
					filtro_produto1);
		}else{
			FacesMessageUtil.addMensagemWarn("Não há registros!");
		}
	}
}
