package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.SituacaoTributariaPISCOFINS;
import br.com.scve.modelo.servico.ServicoSituacaoTributariaPISCOFINS;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanEditaSituacaoTributariaPISCOFINS implements Serializable{

	private static final long serialVersionUID = 1L;
	private SituacaoTributariaPISCOFINS situacaotributariapiscofins = new SituacaoTributariaPISCOFINS();
	@Inject
	private ServicoSituacaoTributariaPISCOFINS servico;
	private List<SituacaoTributariaPISCOFINS> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
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

	public void excluir(){
		try{
		servico.excluir(situacaotributariapiscofins.getIdsituacaotributariapiscofins());
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
		servico.salvar(situacaotributariapiscofins);
	}
}
