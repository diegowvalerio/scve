package br.com.scve.entidades.pfk;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class scvePkEnde implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	private Integer idtipoend;	
	private Integer idpessoa;
	
	public scvePkEnde(){
		
	}


	public Integer getIdtipoend() {
		return idtipoend;
	}


	public void setIdtipoend(Integer idtipoend) {
		this.idtipoend = idtipoend;
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
		result = prime * result + ((idpessoa == null) ? 0 : idpessoa.hashCode());
		result = prime * result + ((idtipoend == null) ? 0 : idtipoend.hashCode());
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
		scvePkEnde other = (scvePkEnde) obj;
		if (idpessoa == null) {
			if (other.idpessoa != null)
				return false;
		} else if (!idpessoa.equals(other.idpessoa))
			return false;
		if (idtipoend == null) {
			if (other.idtipoend != null)
				return false;
		} else if (!idtipoend.equals(other.idtipoend))
			return false;
		return true;
	}
	
}
