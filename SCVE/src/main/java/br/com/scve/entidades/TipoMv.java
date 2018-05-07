package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="tbtipomv")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoMv implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@XmlElement
	private Integer idmv;
	@Column(nullable=false,columnDefinition="varchar(150)")
	@XmlElement
	private String nome;
	
	@Column(nullable=false, columnDefinition= "BOOLEAN DEFAULT TRUE")
	@XmlElement
	private Boolean situacao;
	

	//@XmlElementWrapper(name="tipomvvend")
	//@XmlElement(name="tipomvvend")
	@XmlTransient
	@OneToMany(mappedBy="tipomv", cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE ,CascadeType.REFRESH},orphanRemoval = true,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
    private List<TipoMvVend> tipomvvends = new ArrayList<>();

	public TipoMv() {
		super();
	} 
	
	@XmlAttribute    
	@XmlID
	public Integer getIdmv() {
		return this.idmv;
	}

	public void setIdmv(Integer idmv) {
		this.idmv = idmv;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public Boolean getSituacao() {
		return this.situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public List<TipoMvVend> getTipomvvends() {
		return tipomvvends;
	}
	public void setTipomvvends(List<TipoMvVend> tipomvvends) {
		this.tipomvvends = tipomvvends;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idmv == null) ? 0 : idmv.hashCode());
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
		TipoMv other = (TipoMv) obj;
		if (idmv == null) {
			if (other.idmv != null)
				return false;
		} else if (!idmv.equals(other.idmv))
			return false;
		return true;
	}
	
   
}
