package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Estado;
import br.com.scve.modelo.servico.ServicoEstado;

@Named
@ViewScoped
public class BeanListEstado implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Estado estado = new Estado();
	@Inject
	private ServicoEstado servico;
	private List<Estado> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
	}


	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Estado> getLista() {
		return lista;
	}

	public void setLista(List<Estado> lista) {
		this.lista = lista;
	}


	public void excluir(){
		servico.excluir(estado.getIdestado());
		lista = servico.consultar();
	}

	public void salvar(){
		servico.salvar(estado);
	}
}
