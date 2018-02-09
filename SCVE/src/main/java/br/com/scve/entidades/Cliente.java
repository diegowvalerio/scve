package br.com.scve.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tbcliente")
@PrimaryKeyJoinColumn(name="idpessoa")
public class Cliente extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
		
	public Cliente() {
		super();
	}

   
}
