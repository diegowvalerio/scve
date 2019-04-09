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
@Table(name="ws_vendedor")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WsVendedor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@XmlElement
	private Integer idpessoa;
	@XmlElement
	@Column(nullable=true, columnDefinition="numeric(5,2)")
	private double perc_comissao;
	@XmlElement
	@Column(nullable=false,columnDefinition="varchar(250)")
	private String nome;
	@XmlElement
	@Column(nullable=false, columnDefinition= "BOOLEAN DEFAULT TRUE")
	private Boolean situacao;
	@XmlElement
	@Column(nullable=false)
	private String tipojf;
	@XmlElement
	@Column(nullable=false, columnDefinition="varchar(18)")
	private String cpf_cnpj;
	
	public WsVendedor() {
		super();
	}  
	
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
   
}
