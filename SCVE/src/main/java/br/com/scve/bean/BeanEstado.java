package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Estado;
import br.com.scve.modelo.servico.ServicoEstado;

@Named
@RequestScoped
public class BeanEstado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Estado estado = new Estado();
	@Inject
	private ServicoEstado servico;
	private List<Estado> lista;
	
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
		
	public String salvar(){
		servico.salvar(estado);
		lista = servico.consultar();
		return "lista-estado";
	}

	public void excluir(){
		servico.excluir(estado.getIdestado());
		lista = servico.consultar();
	}
	

	public List<Estado> getLista() {
		return lista;
	}


	public void setLista(List<Estado> lista) {
		this.lista = lista;
	}
	

}
