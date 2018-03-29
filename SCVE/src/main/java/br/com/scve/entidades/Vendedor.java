package br.com.scve.entidades;

import br.com.scve.entidades.Pessoa;
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="tbvendedor")
@PrimaryKeyJoinColumn(name="idpessoa")
@XmlRootElement
public class Vendedor extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, columnDefinition="numeric(5,2)")
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
