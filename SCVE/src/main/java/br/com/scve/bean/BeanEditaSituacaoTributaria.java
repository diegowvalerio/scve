package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.SituacaoTributaria;
import br.com.scve.modelo.servico.ServicoSituacaoTributaria;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanEditaSituacaoTributaria implements Serializable{

	private static final long serialVersionUID = 1L;
	private SituacaoTributaria situacaotributaria = new SituacaoTributaria();
	@Inject
	private ServicoSituacaoTributaria servico;
	private List<SituacaoTributaria> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
	}
	
	public SituacaoTributaria getSituacaoTributaria() {
		return situacaotributaria;
	}

	public void setSituacaoTributaria(SituacaoTributaria situacaotributaria) {
		this.situacaotributaria = situacaotributaria;
	}

	public List<SituacaoTributaria> getLista() {
		return lista;
	}

	public void setLista(List<SituacaoTributaria> lista) {
		this.lista = lista;
	}

	public void excluir(){
		try{
		servico.excluir(situacaotributaria.getIdsituacaotributaria());
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro utilizado em outro local! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
		}
	}
		lista = servico.consultar();
	}

	public void salvar(){
		servico.salvar(situacaotributaria);
	}
}
