package br.com.scve.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name="tbpessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer idpessoa;
	@Column(nullable=false,columnDefinition="varchar(250)")
	private String nome;
	@Column(nullable=false) 
	@Temporal(TemporalType.DATE)
	private Date dtcadastro;
	@Column(nullable=false, columnDefinition= "BOOLEAN DEFAULT TRUE")
	private Boolean situacao;
	@Column(nullable=false)
	private String tipojf;
	@ManyToOne
	private Pessoa vendresp;
	
	@OneToMany(mappedBy="pessoa", cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE },orphanRemoval = true,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
    private List<Contato> contatos = new ArrayList<Contato>();
	
	@OneToMany(mappedBy="pessoa", cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE },orphanRemoval = true,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
    private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	public Pessoa() {
		super();
	}   
	
	public Pessoa(String nome,Date dtcadastro, Boolean situacao, String tipojf,Pessoa vendresp){
		this.nome = nome;
		this.dtcadastro = dtcadastro;
		this.situacao = situacao;
		this.tipojf = tipojf;
		this.vendresp = vendresp;
	}
	
	public Integer getIdpessoa() {
		return idpessoa;
	}


	public void setIdpessoa(Integer idpessoa) {
		this.idpessoa = idpessoa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDtcadastro() {
		return dtcadastro;
	}


	public void setDtcadastro(Date dtcadastro) {
		this.dtcadastro = dtcadastro;
	}

	public Boolean getSituacao() {
		return situacao;
	}


	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}


	public String getTipojf() {
		return tipojf;
	}


	public void setTipojf(String tipojf) {
		this.tipojf = tipojf;
	}


	public Pessoa getVendresp() {
		return vendresp;
	}


	public void setVendresp(Pessoa vendresp) {
		this.vendresp = vendresp;
	}


	public List<Contato> getContatos() {
		return contatos;
	}


	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}


	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public int hashCode(){
		return this.nome.charAt(0);
	}
	
	public boolean equals(Object obj){
		Pessoa clienteAcomparar = (Pessoa) obj;
		if(clienteAcomparar.getIdpessoa() != null && clienteAcomparar.getIdpessoa() != 0 && clienteAcomparar.getIdpessoa() == this.idpessoa)
			return true;
		else
			return false;
	}
   
}
