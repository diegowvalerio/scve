package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.TipoEndereco;
import br.com.scve.modelo.servico.ServicoTipoEndereco;

@Named
@RequestScoped
public class BeanTipoEndereco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private TipoEndereco tipoendereco= new TipoEndereco();
	@Inject
	private ServicoTipoEndereco servico;
	private List<TipoEndereco> lista;
	
	public String salvar(){
		servico.salvar(tipoendereco);
		lista = servico.consultar();
		return "lista-tipoEndereco";
		
	}
		
	public TipoEndereco getTipoendereco() {
		return tipoendereco;
	}
	public void setTipoendereco(TipoEndereco tipoendereco) {
		this.tipoendereco = tipoendereco;
	}
	public List<TipoEndereco> getLista() {
		return lista;
	}
	public void setLista(List<TipoEndereco> lista) {
		this.lista = lista;
	}
	
	

}
