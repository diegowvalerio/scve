package br.com.scve.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="tbempresa")
@PrimaryKeyJoinColumn(name="idpessoa")
public class Empresa extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=true)
	private byte[] certificadobyte;
	@Column(nullable=true)
	private String senhacertificado;
	
	@Column(nullable=true) 
	@Temporal(TemporalType.DATE)
	private Date dtvencimentocertificado;
		
	public Empresa() {
		super();
	}

	public byte[] getCertificadobyte() {
		return certificadobyte;
	}

	public void setCertificadobyte(byte[] certificadobyte) {
		this.certificadobyte = certificadobyte;
	}

	public Date getDtvencimentocertificado() {
		return dtvencimentocertificado;
	}

	public void setDtvencimentocertificado(Date dtvencimentocertificado) {
		this.dtvencimentocertificado = dtvencimentocertificado;
	}

	public String getSenhacertificado() {
		return senhacertificado;
	}

	public void setSenhacertificado(String senhacertificado) {
		this.senhacertificado = senhacertificado;
	}
   
}
