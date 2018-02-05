package br.com.scve.entidades;

import java.io.Serializable;
import javax.persistence.*;

import br.com.scve.entidades.pfk.scvePkVendLista;


@Entity
@Table(name="tbvendlista")
public class VendLista implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private scvePkVendLista scvePkVendLista;
	
	@ManyToOne
	@JoinColumn(name = "idpessoa", referencedColumnName="idpessoa",insertable =false,updatable=false)
	private Vendedor vendedor;
	
	@ManyToOne
	@JoinColumn(name = "idlista", referencedColumnName="idlista",insertable =false,updatable=false)
	private ListaPreco listapreco;
	
	@ManyToOne
	@JoinColumn(name = "idmv", referencedColumnName="idmv",insertable =false,updatable=false)
	private TipoMv tipomv;
	
	public VendLista() {
		super();
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public ListaPreco getListapreco() {
		return listapreco;
	}

	public void setListapreco(ListaPreco listapreco) {
		this.listapreco = listapreco;
	}

	public TipoMv getTipomv() {
		return tipomv;
	}

	public void setTipomv(TipoMv tipomv) {
		this.tipomv = tipomv;
	}

	public scvePkVendLista getScvePkVendLista() {
		return scvePkVendLista;
	}

	public void setScvePkVendLista(scvePkVendLista scvePkVendLista) {
		this.scvePkVendLista = scvePkVendLista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((scvePkVendLista == null) ? 0 : scvePkVendLista.hashCode());
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
		VendLista other = (VendLista) obj;
		if (scvePkVendLista == null) {
			if (other.scvePkVendLista != null)
				return false;
		} else if (!scvePkVendLista.equals(other.scvePkVendLista))
			return false;
		return true;
	}
   
}
