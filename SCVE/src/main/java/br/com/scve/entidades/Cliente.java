package br.com.scve.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tbcliente")
@PrimaryKeyJoinColumn(name="idpessoa")
public class Cliente extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(nullable = true)
	private Cnae cnae;
	
	public Cliente() {
		super();
	}

	public Cnae getCnae() {
		return cnae;
	}

	public void setCnae(Cnae cnae) {
		this.cnae = cnae;
	}

	
   
}
