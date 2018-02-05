package br.com.scve.entidades.pfk;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class scvePkListaPrecoItem implements Serializable{

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
