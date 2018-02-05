package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="tbmovimento")
public class Movimento implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer idmov;
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dtvenda;
	@Column(nullable=false,columnDefinition="varchar(250)")
	private String observacao;
	@Column(nullable=false, columnDefinition="numeric(6,2)")
	private Double totalvenda;
	@Column(nullable=false)
	private Integer vendresp;
	@ManyToOne
	private TipoMv tipomv;
	@ManyToOne
	private CondPgto condpgto;
	@ManyToOne
	private FormaPag formapag;
	@ManyToOne
	private Cliente cliente;

	public Movimento() {
		super();
	}   
	public Integer getIdmov() {
		return this.idmov;
	}

	public void setIdmov(Integer idmov) {
		this.idmov = idmov;
	}   
	public Date getDtvenda() {
		return this.dtvenda;
	}

	public void setDtvenda(Date dtvenda) {
		this.dtvenda = dtvenda;
	}   
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}   
	public Double getTotalvenda() {
		return this.totalvenda;
	}

	public void setTotalvenda(Double totalvenda) {
		this.totalvenda = totalvenda;
	}   
	public Integer getVendresp() {
		return this.vendresp;
	}

	public void setVendresp(Integer vendresp) {
		this.vendresp = vendresp;
	}
	public TipoMv getTipomv() {
		return tipomv;
	}
	public void setTipomv(TipoMv tipomv) {
		this.tipomv = tipomv;
	}
	public CondPgto getCondpgto() {
		return condpgto;
	}
	public void setCondpgto(CondPgto condpgto) {
		this.condpgto = condpgto;
	}
	public FormaPag getFormapag() {
		return formapag;
	}
	public void setFormapag(FormaPag formapag) {
		this.formapag = formapag;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
   
}
