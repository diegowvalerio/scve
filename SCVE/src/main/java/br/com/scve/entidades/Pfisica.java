package br.com.scve.entidades;


import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="tbfisica")
//@PrimaryKeyJoinColumn(name="idpessoa")
public class Pfisica implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne
	@JoinColumn(name = "idpessoa", referencedColumnName = "idpessoa")
	@Expose
	private Pessoa pessoa;
	
	@Column(nullable=false, columnDefinition="varchar(14)", unique=true)
	@Expose
	private String cpf;
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	@Expose
	private Date dtnasc;
	@Column(nullable=false, columnDefinition="varchar(14)")
	@Expose
	private String rg;
	
	
	public Pfisica() {
		super();
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public Date getDtnasc() {
		return this.dtnasc;
	}

	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
   
}
