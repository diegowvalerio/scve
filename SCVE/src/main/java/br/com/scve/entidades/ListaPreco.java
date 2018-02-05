package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="tblistapreco")
public class ListaPreco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer idlista;
	@Column(nullable=false,columnDefinition="varchar(150)")
	private String nome;
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dtcadastro;
	

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
   
}
