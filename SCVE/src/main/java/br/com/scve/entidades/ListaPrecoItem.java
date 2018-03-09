package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Double;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="tblistaprecoitem")
public class ListaPrecoItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private scvePkListaPrecoItem id;
	
	@AttributeOverrides( {
		@AttributeOverride(name = "idlista", column = @Column(name = "IDLISTA", nullable = false)),
		@AttributeOverride(name = "idproduto", column = @Column(name = "IDPRODUTO", nullable = false)) })
	
	@Column(nullable=false, columnDefinition="numeric(6,2)")
	private double valor;
	@Column(nullable=false) 
	@Temporal(TemporalType.DATE)
	private Date dtultimaalt;
	
	
	@ManyToOne
	@JoinColumn(name = "idlista", referencedColumnName="idlista",insertable =false,updatable=false)
	private ListaPreco listapreco;
	
	@ManyToOne
	@JoinColumn(name = "idproduto", referencedColumnName="idproduto",insertable =false,updatable=false)
	private Produto produto;

	public ListaPrecoItem() {
		super();
	}
	
	//Solução do problema
	@PrePersist
		  private void prePersiste() {
				this.id = new scvePkListaPrecoItem();
				this.id.setIdlista(listapreco.getIdlista());
				this.id.setIdproduto(produto.getIdproduto());		
				//this.produto = produto;
				//this.listapreco = listapreco;
			}
	
	@Embeddable
	public static class scvePkListaPrecoItem implements Serializable{

		private static final long serialVersionUID = 1L;		
		
		private Integer idlista;	
		private Integer idproduto;		
			
		public scvePkListaPrecoItem(){
			
		}

		public Integer getIdlista() {
			return idlista;
		}

		public void setIdlista(Integer idlista) {
			this.idlista = idlista;
		}

		public Integer getIdproduto() {
			return idproduto;
		}

		public void setIdproduto(Integer idproduto) {
			this.idproduto = idproduto;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idlista == null) ? 0 : idlista.hashCode());
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
			scvePkListaPrecoItem other = (scvePkListaPrecoItem) obj;
			if (idlista == null) {
				if (other.idlista != null)
					return false;
			} else if (!idlista.equals(other.idlista))
				return false;
			if (idproduto == null) {
				if (other.idproduto != null)
					return false;
			} else if (!idproduto.equals(other.idproduto))
				return false;
			return true;
		}
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
	
	public scvePkListaPrecoItem getId() {
		return id;
	}

	public void setId(scvePkListaPrecoItem id) {
		this.id = id;
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
