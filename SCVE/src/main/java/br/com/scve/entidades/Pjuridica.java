package br.com.scve.entidades;

import br.com.scve.entidades.Pessoa;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="tbjuridica")
public class Pjuridica  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne
	@JoinColumn(name = "idpessoa", referencedColumnName = "idpessoa")
	@Expose
	private Pessoa pessoa;
	
	@Column(nullable=false, columnDefinition="varchar(18)")
	@Expose
	private String cnpj;
	@Column(nullable=false, columnDefinition="varchar(14)")
	@Expose
	private String insc_estadual;
	@Column(nullable=false, columnDefinition="varchar(250)")
	@Expose
	private String razao_social;
	@Column(nullable=true, columnDefinition="varchar(14)")
	@Expose
	private String insc_suframa;
	

	public Pjuridica() {
		super();
	}   
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}   
	public String getInsc_estadual() {
		return this.insc_estadual;
	}

	public void setInsc_estadual(String insc_estadual) {
		this.insc_estadual = insc_estadual;
	}   
	public String getRazao_social() {
		return this.razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}   
	public String getInsc_suframa() {
		return this.insc_suframa;
	}

	public void setInsc_suframa(String insc_suframa) {
		this.insc_suframa = insc_suframa;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
   
}
