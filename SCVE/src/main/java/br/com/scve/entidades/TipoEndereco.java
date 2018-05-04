package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tbtipoendereco")
@XmlRootElement
public class TipoEndereco implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer idtipoend;
	@Column(nullable=false,columnDefinition="varchar(40)")
	private String nome;
	

	public TipoEndereco() {
		super();
	}   
	public Integer getIdtipoend() {
		return this.idtipoend;
	}

	public void setIdtipoend(Integer idtipoend) {
		this.idtipoend = idtipoend;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idtipoend == null) ? 0 : idtipoend.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		TipoEndereco other = (TipoEndereco) obj;
		if (idtipoend == null) {
			if (other.idtipoend != null)
				return false;
		} else if (!idtipoend.equals(other.idtipoend))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
   
}
