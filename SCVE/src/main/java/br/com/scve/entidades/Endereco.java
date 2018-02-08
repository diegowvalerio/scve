package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import br.com.scve.entidades.pfk.scvePkEnde;

@Entity
@Table(name="tbendereco")

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;	
	
	@EmbeddedId
	private scvePkEnde id;
	@Column(nullable=false,columnDefinition="varchar(100)")
	private String logadouro;
	@Column(nullable=false,columnDefinition="varchar(10)")
	private String numero;
	@Column(nullable=false,columnDefinition="varchar(10)")
	private String cep;
	@Column(nullable=false,columnDefinition="varchar(40)")
	private String bairro;
	@Column(nullable=true,columnDefinition="varchar(150)")
	private String complemento;
	@ManyToOne
	private Cidade cidade;		
	
	@ManyToOne
	@JoinColumn(name = "idtipoend" , referencedColumnName="idtipoend" , insertable =false,updatable=false)
	private TipoEndereco tipoendereco;
	
	@ManyToOne
	@JoinColumn(name = "idpessoa", referencedColumnName="idpessoa",insertable =false,updatable=false)
	private Pessoa pessoa;
	

	public TipoEndereco getTipoendereco() {
		return tipoendereco;
	}
	public void setTipoendereco(TipoEndereco tipoendereco) {
		this.tipoendereco = tipoendereco;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public scvePkEnde getId() {
		return id;
	}
	public void setId(scvePkEnde id) {
		this.id = id;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Endereco() {
		super();
	}   
	public String getLogadouro() {
		return this.logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}   
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}   
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}   
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
	
   
}
