package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.TipoMv;
import br.com.scve.modelo.servico.ServicoTipoMv;

@Named
@RequestScoped
public class BeanTipoMv implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private TipoMv tipomv = new TipoMv();
	@Inject
	private ServicoTipoMv servico;
	private List<TipoMv> lista;
	
	public String salvar(){
		servico.salvar(tipomv);
		lista = servico.consultar();
		
		return "listaTipoMv";
		
	}

	public TipoMv getTipomv() {
		return tipomv;
	}

	public void setTipomv(TipoMv tipomv) {
		this.tipomv = tipomv;
	}

	public List<TipoMv> getLista() {
		return lista;
	}

	public void setLista(List<TipoMv> lista) {
		this.lista = lista;
	}
		
	
	

}