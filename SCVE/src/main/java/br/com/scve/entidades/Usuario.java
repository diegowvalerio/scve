package br.com.scve.entidades;

import br.com.scve.entidades.Pessoa;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
@Table(name="tbusuario")
@PrimaryKeyJoinColumn(name="idpessoa")
public class Usuario extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, columnDefinition="varchar(10)")
	private String login;
	@Column(nullable=false, columnDefinition="varchar(10)")
	private String senha;
		

	public Usuario() {
		super();
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

   
}
