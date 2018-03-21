package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.CondPgto;
import br.com.scve.modelo.servico.ServicoCondicaoPagto;

@Named
@ViewScoped
public class BeanCondicaoPagto implements Serializable{
	private static final long serialVersionUID = 1L;

	private CondPgto condicaopagto = new CondPgto();
	@Inject
	private ServicoCondicaoPagto servico;
	
	private List<CondPgto> lista;

	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
		
		this.condicaopagto = this.getCondicaopagto();
	}
	
	public CondPgto getCondicaopagto() {
		return condicaopagto;
	}

	public void setCondicaopagto(CondPgto condicaopagto) {
		this.condicaopagto = condicaopagto;
	}

	public List<CondPgto> getLista() {
		return lista;
	}

	public void setLista(List<CondPgto> lista) {
		this.lista = lista;
	}

	public String salvar(){
		servico.salvar(condicaopagto);
		lista = servico.consultar();
		
		return "lista-condicaopagto";
	}

	public String excluir() {
		servico.excluir(condicaopagto.getIdcondpgto());

		lista = servico.consultar();

		return "lista-condicaopagto";
	}

}
