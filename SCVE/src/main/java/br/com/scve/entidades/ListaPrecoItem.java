package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Double;
import java.util.Date;

import javax.persistence.*;

import br.com.scve.entidades.pfk.scvePkListaPrecoItem;


@Entity
@Table(name="tblistaprecoitem")
public class ListaPrecoItem implements Serializable {

	@EmbeddedId
	private scvePkListaPrecoItem scvePkListaPrecoItem;
	
	@Column(nullable=false, columnDefinition="numeric(6,2)")
	private Double valor;
	@Column(nullable=false) 
	@Temporal(TemporalType.DATE)
	private Date dtultimaalt;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "idlista", referencedColumnName="idlista",insertable =false,updatable=false)
	private ListaPreco listapreco;
	
	@ManyToOne
	@JoinColumn(name = "idproduto", referencedColumnName="idproduto",insertable =false,updatable=false)
	private Produto produto;

	public ListaPrecoItem() {
		super();
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((scvePkListaPrecoItem == null) ? 0 : scvePkListaPrecoItem.hashCode());
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
		ListaPrecoItem other = (ListaPrecoItem) obj;
		if (scvePkListaPrecoItem == null) {
			if (other.scvePkListaPrecoItem != null)
				return false;
		} else if (!scvePkListaPrecoItem.equals(other.scvePkListaPrecoItem))
			return false;
		return true;
	}



	public ListaPreco getListapreco() {
		return listapreco;
	}



	public void setListapreco(ListaPreco listapreco) {
		this.listapreco = listapreco;
	}



	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	public scvePkListaPrecoItem getScvePkListaPrecoItem() {
		return scvePkListaPrecoItem;
	}



	public void setScvePkListaPrecoItem(scvePkListaPrecoItem scvePkListaPrecoItem) {
		this.scvePkListaPrecoItem = scvePkListaPrecoItem;
	}



	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}   
	public Date getDtultimaalt() {
		return this.dtultimaalt;
	}

	public void setDtultimaalt(Date dtultimaalt) {
		this.dtultimaalt = dtultimaalt;
	}
   
}
