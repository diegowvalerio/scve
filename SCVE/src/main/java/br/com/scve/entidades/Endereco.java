package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;



@Entity
@Table(name="tbendereco")

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;	
	
	@EmbeddedId
	private scvePkEnder id;
	
	@AttributeOverrides( {
		@AttributeOverride(name = "idpessoa", column = @Column(name = "IDPESSOA", nullable = false)),
		@AttributeOverride(name = "idtipoend", column = @Column(name = "IDTIPOEND", nullable = false)) })
	
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
	
	//Solução do problema
	@PrePersist
	  private void prePersiste() {
			this.id = new scvePkEnder();
			this.id.setIdpessoa(pessoa.getIdpessoa());
			this.id.setIdtipoend(tipoendereco.getIdtipoend());		
			this.pessoa = pessoa;
			this.tipoendereco = tipoendereco;
		}
		
		@Embeddable
		public static class scvePkEnder implements Serializable{
			
			private static final long serialVersionUID = 1L;
			
			
			
			private Integer idtipoend;	
			private Integer idpessoa;
			
			public scvePkEnder(){
				
			}


			public Integer getIdtipoend() {
				return idtipoend;
			}


			public void setIdtipoend(Integer idtipoend) {
				this.idtipoend = idtipoend;
			}


			public Integer getIdpessoa() {
				return idpessoa;
			}


			public void setIdpessoa(Integer idpessoa) {
				this.idpessoa = idpessoa;
			}
			
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((idpessoa == null) ? 0 : idpessoa.hashCode());
				result = prime * result + ((idtipoend == null) ? 0 : idtipoend.hashCode());
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
				scvePkEnder other = (scvePkEnder) obj;
				if (idpessoa == null) {
					if (other.idpessoa != null)
						return false;
				} else if (!idpessoa.equals(other.idpessoa))
					return false;
				if (idtipoend == null) {
					if (other.idtipoend != null)
						return false;
				} else if (!idtipoend.equals(other.idtipoend))
					return false;
				return true;
			}
			
		}

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
	
	
	public scvePkEnder getId() {
		return id;
	}
	public void setId(scvePkEnder id) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime * result + ((tipoendereco == null) ? 0 : tipoendereco.hashCode());
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
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (tipoendereco == null) {
			if (other.tipoendereco != null)
				return false;
		} else if (!tipoendereco.equals(other.tipoendereco))
			return false;
		return true;
	}

	
	
   
}
