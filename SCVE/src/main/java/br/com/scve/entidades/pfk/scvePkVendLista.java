package br.com.scve.entidades.pfk;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class scvePkVendLista implements Serializable {
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
