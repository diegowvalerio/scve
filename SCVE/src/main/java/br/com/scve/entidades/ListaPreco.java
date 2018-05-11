package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="tblistapreco")
public class ListaPreco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Expose
	private Integer idlista;
	@Column(nullable=false,columnDefinition="varchar(150)")
	@Expose
	private String nome;
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	@Expose
	private Date dtcadastro;
	
	@Expose
	@OneToMany(mappedBy="listapreco", cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE },orphanRemoval = true,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
    private List<ListaPrecoItem> listaprecoitens = new ArrayList<>();

	public ListaPreco() {
		super();
	} 

	public Integer getIdlista() {
		return this.idlista;
	}

	public void setIdlista(Integer idlista) {
		this.idlista = idlista;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public Date getDtcadastro() {
		return this.dtcadastro;
	}

	public void setDtcadastro(Date dtcadastro) {
		this.dtcadastro = dtcadastro;
	}
	public List<ListaPrecoItem> getListaprecoitens() {
		return listaprecoitens;
	}
	public void setListaprecoitens(List<ListaPrecoItem> listaprecoitens) {
		this.listaprecoitens = listaprecoitens;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idlista == null) ? 0 : idlista.hashCode());
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
		ListaPreco other = (ListaPreco) obj;
		if (idlista == null) {
			if (other.idlista != null)
				return false;
		} else if (!idlista.equals(other.idlista))
			return false;
		return true;
	}
   
	
}
