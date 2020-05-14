package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Ncm;
import br.com.scve.entidades.RegraImposto;
import br.com.scve.entidades.Vendedor;
import br.com.scve.modelo.servico.ServicoNcm;
import br.com.scve.modelo.servico.ServicoRegraImposto;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanNcm implements Serializable{
	private static final long serialVersionUID = 1L;

	private Ncm ncm = new Ncm();
	@Inject
	private ServicoNcm servico;
	@Inject
	private ServicoRegraImposto servicoRegraImposto;
	private List<Ncm> lista;

	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
		
		this.ncm = this.getNcm();
	}
	
	public String salvar(){
		try{
		servico.salvar(ncm);
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro já existente! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-ncm";
	}

	public String excluir() {
		try{
		servico.excluir(ncm.getIdncm());
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro utilizado em outro local! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();

		return "lista-ncm";
	}
	
	public Ncm getNcm() {
		return ncm;
	}

	public void setNcm(Ncm ncm) {
		this.ncm = ncm;
	}

	public List<Ncm> getLista() {
		return lista;
	}

	public void setLista(List<Ncm> lista) {
		this.lista = lista;
	}
		
	public List<RegraImposto> getRegraImposto() {
		return servicoRegraImposto.consultar();
	}
}
