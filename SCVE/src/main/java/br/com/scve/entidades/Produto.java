package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="tbproduto")
public class Produto implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	private Integer idproduto;
	@Column(nullable=false,columnDefinition="varchar(300)")
	@Expose
	private String descricao;
	@Column(nullable=false,columnDefinition="varchar(100)")
	@Expose
	private String descabreviada;
	@Column(nullable=false,columnDefinition="varchar(13)")
	@Expose
	private String ean;
	@Column(nullable=false, columnDefinition= "BOOLEAN DEFAULT TRUE")
	@Expose
	private Boolean situacao;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(nullable = true)
	private Cest cest;
	@ManyToOne
	@JoinColumn(nullable = true)
	private Ncm ncm;

	public Produto() {
		super();
	}   
	public Integer getIdproduto() {
		return this.idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}   
	public Ncm getNcm() {
		return ncm;
	}
	public void setNcm(Ncm ncm) {
		this.ncm = ncm;
	}
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}   
	public String getDescabreviada() {
		return this.descabreviada;
	}

	public void setDescabreviada(String descabreviada) {
		this.descabreviada = descabreviada;
	}   
	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}   
	public Boolean getSituacao() {
		return this.situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}
	public Cest getCest() {
		return cest;
	}
	public void setCest(Cest cest) {
		this.cest = cest;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idproduto == null) ? 0 : idproduto.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (idproduto == null) {
			if (other.idproduto != null)
				return false;
		} else if (!idproduto.equals(other.idproduto))
			return false;
		return true;
	}
   
}
