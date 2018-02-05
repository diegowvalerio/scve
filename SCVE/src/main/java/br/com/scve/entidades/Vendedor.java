package br.com.scve.entidades;

import br.com.scve.entidades.Pessoa;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tbvendedor")
@PrimaryKeyJoinColumn(name="idpessoa")
public class Vendedor extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="idpessoa", insertable=false,updatable=false)
	private Integer idpessoa;
	
	@Column(nullable=false, columnDefinition="numeric(3,2)")
	private double perc_comissao;
	

	public Vendedor() {
		super();
	}   
	public double getPerc_comissao() {
		return this.perc_comissao;
	}

	public void setPerc_comissao(double perc_comissao) {
		this.perc_comissao = perc_comissao;
	}
   
}
