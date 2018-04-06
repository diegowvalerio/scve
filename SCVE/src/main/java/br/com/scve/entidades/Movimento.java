package br.com.scve.entidades;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
	@Column(nullable=true,columnDefinition="varchar(250)")
	private String observacao;
	@Column(nullable=false, columnDefinition="numeric(6,2)")
	private Double totalvenda;
	@ManyToOne
	private Vendedor vendresp;
	@ManyToOne
	private TipoMv tipomv;
	@ManyToOne
	private CondPgto condpgto;
	@ManyToOne
	private FormaPag formapag;
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany(mappedBy="movimento", cascade ={CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE },orphanRemoval = true,fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
    private List<ItemMov> items = new ArrayList<>();

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
	
	public Vendedor getVendresp() {
		return vendresp;
	}
	public void setVendresp(Vendedor vendresp) {
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
	public List<ItemMov> getItems() {
		return items;
	}
	public void setItems(List<ItemMov> items) {
		this.items = items;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((condpgto == null) ? 0 : condpgto.hashCode());
		result = prime * result + ((dtvenda == null) ? 0 : dtvenda.hashCode());
		result = prime * result + ((formapag == null) ? 0 : formapag.hashCode());
		result = prime * result + ((idmov == null) ? 0 : idmov.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((tipomv == null) ? 0 : tipomv.hashCode());
		result = prime * result + ((totalvenda == null) ? 0 : totalvenda.hashCode());
		result = prime * result + ((vendresp == null) ? 0 : vendresp.hashCode());
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
		Movimento other = (Movimento) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (condpgto == null) {
			if (other.condpgto != null)
				return false;
		} else if (!condpgto.equals(other.condpgto))
			return false;
		if (dtvenda == null) {
			if (other.dtvenda != null)
				return false;
		} else if (!dtvenda.equals(other.dtvenda))
			return false;
		if (formapag == null) {
			if (other.formapag != null)
				return false;
		} else if (!formapag.equals(other.formapag))
			return false;
		if (idmov == null) {
			if (other.idmov != null)
				return false;
		} else if (!idmov.equals(other.idmov))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (tipomv == null) {
			if (other.tipomv != null)
				return false;
		} else if (!tipomv.equals(other.tipomv))
			return false;
		if (totalvenda == null) {
			if (other.totalvenda != null)
				return false;
		} else if (!totalvenda.equals(other.totalvenda))
			return false;
		if (vendresp == null) {
			if (other.vendresp != null)
				return false;
		} else if (!vendresp.equals(other.vendresp))
			return false;
		return true;
	}
   
	
}
