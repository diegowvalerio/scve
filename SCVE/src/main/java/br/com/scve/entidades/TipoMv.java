package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

@Entity
@Table(name="tbtipomv")
public class TipoMv implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer idmv;
	@Column(nullable=false,columnDefinition="varchar(150)")
	private String nome;
	@Column(nullable=false, columnDefinition= "BOOLEAN DEFAULT TRUE")
	private Boolean situacao;
	
	@ManyToOne
	private ListaPreco listapreco;
	
	@ManyToOne
	private ListaPreco listaprecopromocao;

	public TipoMv() {
		super();
	}   
	public Integer getIdmv() {
		return this.idmv;
	}

	public void setIdmv(Integer idmv) {
		this.idmv = idmv;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public Boolean getSituacao() {
		return this.situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}
	public ListaPreco getListapreco() {
		return listapreco;
	}
	public void setListapreco(ListaPreco listapreco) {
		this.listapreco = listapreco;
	}
	public ListaPreco getListaprecopromocao() {
		return listaprecopromocao;
	}
	public void setListaprecopromocao(ListaPreco listaprecopromocao) {
		this.listaprecopromocao = listaprecopromocao;
	}
   
}
