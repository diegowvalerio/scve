package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import br.com.scve.entidades.ListaPrecoItem.scvePkListaPrecoItem;


@Entity
@Table(name="tbitemmov")
public class ItemMov implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer iditemmov;
	
	@ManyToOne
	@JoinColumn(name = "idmov" , referencedColumnName="idmov" )
	private Movimento movimento;
	
	@ManyToOne
	private Produto produto;
	
	@Column(nullable=false, columnDefinition="numeric(6,2)")
	private Double valor;
	@Column(nullable=false)
	private Integer qtde;
	@Column(nullable=false, columnDefinition="numeric(6,2)")
	private Double desconto;
	@Column(nullable=true,columnDefinition="varchar(250)")
	private String itemobservacao;
	@Column(nullable=false, columnDefinition="numeric(6,2)")
	private Double subtotal;
	

	public ItemMov() {
		super();
	}   
	
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}   
	public Integer getQtde() {
		return this.qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}   
	public Double getDesconto() {
		return this.desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}   
	public String getItemobservacao() {
		return this.itemobservacao;
	}

	public void setItemobservacao(String itemobservacao) {
		this.itemobservacao = itemobservacao;
	}   
	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Movimento getMovimento() {
		return movimento;
	}
	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}

	public Integer getIditemmov() {
		return iditemmov;
	}

	public void setIditemmov(Integer iditemmov) {
		this.iditemmov = iditemmov;
	}

	
   
}
