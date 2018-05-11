package br.com.scve.entidades;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.Expose;



@Entity
@Table(name="tbtipomv_vend")
@XmlRootElement
public class TipoMvVend implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private scvePkVendLista id;
	
	@AttributeOverrides( {
		@AttributeOverride(name = "idpessoa", column = @Column(name = "IDPESSOA", nullable = false)),
		@AttributeOverride(name = "idmv", column = @Column(name = "IDMV", nullable = false)) })
	@Expose
	@ManyToOne
	@JoinColumn(name = "idpessoa", referencedColumnName="idpessoa",insertable =false,updatable=false)
	private Vendedor vendedor;
	@Expose	
	@ManyToOne
	@JoinColumn(name = "idmv", referencedColumnName="idmv",insertable =false,updatable=false)
	private TipoMv tipomv;
	@Expose
	@ManyToOne
	private ListaPreco listapreco;
	@Expose
	@ManyToOne
	@JoinColumn(nullable = true)
	private ListaPreco listaprecopromocao;
	
	public TipoMvVend() {
		super();
	}
	
	//Solução do problema
		@PrePersist
			  private void prePersiste() {
					this.id = new scvePkVendLista();
					this.id.setIdmv(tipomv.getIdmv());
					this.id.setIdpessoa(vendedor.getIdpessoa());	
					//this.vendedor = vendedor;
					//this.tipomv = tipomv;
				}
		
	@Embeddable
	public static class scvePkVendLista implements Serializable {
		private static final long serialVersionUID = 1L;

		private Integer idmv;	
		private Integer idpessoa;
		
		
		public scvePkVendLista() {
			super();
		}

		public Integer getIdmv() {
			return idmv;
		}


		public void setIdmv(Integer idmv) {
			this.idmv = idmv;
		}


		public Integer getIdpessoa() {
			return idpessoa;
		}


		public void setIdpessoa(Integer idpessoa) {
			this.idpessoa = idpessoa;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idmv == null) ? 0 : idmv.hashCode());
			result = prime * result + ((idpessoa == null) ? 0 : idpessoa.hashCode());
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
			scvePkVendLista other = (scvePkVendLista) obj;
			if (idmv == null) {
				if (other.idmv != null)
					return false;
			} else if (!idmv.equals(other.idmv))
				return false;
			if (idpessoa == null) {
				if (other.idpessoa != null)
					return false;
			} else if (!idpessoa.equals(other.idpessoa))
				return false;
			return true;
		}
	   
	}
	
	
	
	
	
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	
	public TipoMv getTipomv() {
		return tipomv;
	}

	public void setTipomv(TipoMv tipomv) {
		this.tipomv = tipomv;
	}

	public scvePkVendLista getId() {
		return id;
	}

	public void setId(scvePkVendLista id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tipomv == null) ? 0 : tipomv.hashCode());
		result = prime * result + ((vendedor == null) ? 0 : vendedor.hashCode());
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
		TipoMvVend other = (TipoMvVend) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipomv == null) {
			if (other.tipomv != null)
				return false;
		} else if (!tipomv.equals(other.tipomv))
			return false;
		if (vendedor == null) {
			if (other.vendedor != null)
				return false;
		} else if (!vendedor.equals(other.vendedor))
			return false;
		return true;
	}

	

	
   
}
