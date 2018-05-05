package br.com.scve.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import com.sun.xml.internal.bind.CycleRecoverable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name="tbpessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@XmlElement
	private Integer idpessoa;
	@XmlElement
	@Column(nullable=false,columnDefinition="varchar(250)")
	private String nome;
	@Column(nullable=false) 
	@XmlElement
	@Temporal(TemporalType.DATE)
	private Date dtcadastro;
	@XmlElement
	@Column(nullable=false, columnDefinition= "BOOLEAN DEFAULT TRUE")
	private Boolean situacao;
	@XmlElement
	@Column(nullable=false)
	private String tipojf;
	@XmlElement
	@ManyToOne
	@JoinColumn(nullable = true)
	private Vendedor vendresp;
	
	@XmlElementWrapper(name="contato")
	@XmlElement(name="contato")
	@OneToMany(mappedBy="pessoa", cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE },orphanRemoval = true,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
    private List<Contato> contatos = new ArrayList<>();
	
	@XmlElementWrapper(name="endereco")
	@XmlElement(name="endereco")
	@OneToMany(mappedBy="pessoa", cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE },orphanRemoval = true,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
    private List<Endereco> enderecos = new ArrayList<>();
	
	public Pessoa() {
		super();
	}  
	/*
	public Pessoa(Integer idpessoa, String nome, Date dtcadastro, Boolean situacao, String tipojf, Vendedor vendresp,
			List<Contato> contatos, List<Endereco> enderecos) {
		super();
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.dtcadastro = dtcadastro;
		this.situacao = situacao;
		this.tipojf = tipojf;
		this.vendresp = vendresp;
		this.contatos = contatos;
		this.enderecos = enderecos;
	}

	public Object onCycleDetected(CycleRecoverable.Context context) {
		Pessoa obj = new Pessoa(this.idpessoa, nome, dtcadastro, situacao, nome, vendresp, contatos, enderecos);
		return obj;
		}
	*/
	/*public Pessoa(String nome,Date dtcadastro, Boolean situacao, String tipojf){
		this.nome = nome;
		this.dtcadastro = dtcadastro;
		this.situacao = situacao;
		this.tipojf = tipojf;
	}
	*/
	 @XmlAttribute    
	 @XmlID               // should be unique across all entities.<br>    private String uuid; 
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


	public void setVendresp(Vendedor vendresp) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Pessoa other = (Pessoa) obj;
		if (idpessoa == null) {
			if (other.idpessoa != null)
				return false;
		} else if (!idpessoa.equals(other.idpessoa))
			return false;
		return true;
	}

   
}
