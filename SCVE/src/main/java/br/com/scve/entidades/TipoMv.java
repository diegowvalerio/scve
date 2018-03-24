package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="tbtipomv")
public class TipoMv implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer idmv;
	@Column(nullable=false,columnDefinition="varchar(150)")
	private String nome;
	@Column(nullable=false, columnDefinition= "BOOLEAN DEFAULT TRUE")
	private Boolean situacao;
	

	
	@OneToMany(mappedBy="tipomv", cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE },orphanRemoval = true,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
    private List<TipoMvVend> tipomvvends = new ArrayList<>();

	public TipoMv() {
		super();
	}   
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
