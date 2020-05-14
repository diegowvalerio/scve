package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Cfop;
import br.com.scve.entidades.SituacaoTributariaIPI;
import br.com.scve.entidades.SituacaoTributariaPISCOFINS;
import br.com.scve.modelo.servico.ServicoCfop;
import br.com.scve.modelo.servico.ServicoSituacaoTributariaIPI;
import br.com.scve.modelo.servico.ServicoSituacaoTributariaPISCOFINS;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanCfop implements Serializable{
	private static final long serialVersionUID = 1L;

	private Cfop cfop = new Cfop();
	@Inject
	private ServicoCfop servico;
	
	@Inject
	private ServicoSituacaoTributariaPISCOFINS servicoSituacaoTributariaPISCOFINS;
	@Inject
	private ServicoSituacaoTributariaIPI servicoSituacaoTributariaIPI;
	
	private List<Cfop> lista;

	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
		
		this.cfop = this.getCfop();
	}
	
	public String salvar(){
		try{
		servico.salvar(cfop);
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro já existente! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-cfop";
	}

	public String excluir() {
		try{
		servico.excluir(cfop.getIdcfop());
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro utilizado em outro local! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();

		return "lista-cfop";
	}
	
	public Cfop getCfop() {
		return cfop;
	}

	public void setCfop(Cfop cfop) {
		this.cfop = cfop;
	}

	public List<Cfop> getLista() {
		return lista;
	}

	public void setLista(List<Cfop> lista) {
		this.lista = lista;
	}
	
	public List<SituacaoTributariaPISCOFINS> getSituacaoTributariaPISCOFINS(){
		return servicoSituacaoTributariaPISCOFINS.consultar();
	}
	
	public List<SituacaoTributariaIPI> getSituacaoTributariaIPI(){
		return servicoSituacaoTributariaIPI.consultar();
	}

}
