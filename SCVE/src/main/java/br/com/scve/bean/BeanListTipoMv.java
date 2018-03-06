package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.TipoMv;
import br.com.scve.modelo.servico.ServicoTipoMv;

@Named
@ViewScoped
public class BeanListTipoMv implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private TipoMv tipomv = new TipoMv();
	@Inject
	private ServicoTipoMv servico;
	private List<TipoMv> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
	}
	
	public String salvar(){
		servico.salvar(tipomv);
		lista = servico.consultar();
		
		return "listaTipoMv";
		
	}
	
	public void excluir(){
		servico.excluir(tipomv.getIdmv());
		lista = servico.consultar();
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
