package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.SituacaoTributariaIPI;
import br.com.scve.modelo.servico.ServicoSituacaoTributariaIPI;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanEditaSituacaoTributariaIPI implements Serializable{

	private static final long serialVersionUID = 1L;
	private SituacaoTributariaIPI situacaotributariaipi = new SituacaoTributariaIPI();
	@Inject
	private ServicoSituacaoTributariaIPI servico;
	private List<SituacaoTributariaIPI> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
	}
	
	public SituacaoTributariaIPI getSituacaoTributariaIPI() {
		return situacaotributariaipi;
	}

	public void setSituacaoTributariaIPI(SituacaoTributariaIPI situacaotributariaipi) {
		this.situacaotributariaipi = situacaotributariaipi;
	}

	public List<SituacaoTributariaIPI> getLista() {
		return lista;
	}

	public void setLista(List<SituacaoTributariaIPI> lista) {
		this.lista = lista;
	}

	public void excluir(){
		try{
		servico.excluir(situacaotributariaipi.getIdsituacaotributariaipi());
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
		servico.salvar(situacaotributariaipi);
	}
}
