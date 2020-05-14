package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.SituacaoTributariaPISCOFINS;
import br.com.scve.modelo.servico.ServicoSituacaoTributariaPISCOFINS;
import br.com.scve.msn.FacesMessageUtil;

@Named
@RequestScoped
public class BeanSituacaoTributariaPISCOFINS implements Serializable{
	private static final long serialVersionUID = 1L;

	private SituacaoTributariaPISCOFINS situacaotributariapiscofins = new SituacaoTributariaPISCOFINS();
	@Inject
	private ServicoSituacaoTributariaPISCOFINS servico;
	private List<SituacaoTributariaPISCOFINS> lista;

	
	
	public String salvar(){
		try{
		servico.salvar(situacaotributariapiscofins);
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro já existente! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-situacaotributariapiscofins";
	}

	public SituacaoTributariaPISCOFINS getSituacaoTributariaPISCOFINS() {
		return situacaotributariapiscofins;
	}

	public void setSituacaoTributariaPISCOFINS(SituacaoTributariaPISCOFINS situacaotributariapiscofins) {
		this.situacaotributariapiscofins = situacaotributariapiscofins;
	}

	public List<SituacaoTributariaPISCOFINS> getLista() {
		return lista;
	}

	public void setLista(List<SituacaoTributariaPISCOFINS> lista) {
		this.lista = lista;
	}
		

}
