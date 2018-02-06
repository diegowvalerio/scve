package br.com.scve.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tbcliente")
@PrimaryKeyJoinColumn(name="idpessoa")
public class Cliente extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//@Column(name="idpessoa", insertable=false,updatable=false)
	//private Integer idpessoa;
	
	public Cliente() {
		super();
	}

   
}
