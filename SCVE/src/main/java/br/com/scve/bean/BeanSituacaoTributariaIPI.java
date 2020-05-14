package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.SituacaoTributariaIPI;
import br.com.scve.modelo.servico.ServicoSituacaoTributariaIPI;
import br.com.scve.msn.FacesMessageUtil;

@Named
@RequestScoped
public class BeanSituacaoTributariaIPI implements Serializable{
	private static final long serialVersionUID = 1L;

	private SituacaoTributariaIPI situacaotributariaipi = new SituacaoTributariaIPI();
	@Inject
	private ServicoSituacaoTributariaIPI servico;
	private List<SituacaoTributariaIPI> lista;

	
	
	public String salvar(){
		try{
		servico.salvar(situacaotributariaipi);
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro j� existente! N�o foi poss�vel realizar a opera��o.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-situacaotributariaipi";
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
		

}
