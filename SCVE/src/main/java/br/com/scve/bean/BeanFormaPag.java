package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.RollbackException;

import br.com.scve.entidades.FormaPag;
import br.com.scve.modelo.servico.ServicoFormaPag;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanFormaPag implements Serializable{
	private static final long serialVersionUID = 1L;

	private FormaPag formapag = new FormaPag();
	@Inject
	private ServicoFormaPag servico;
	
	private List<FormaPag> lista;

	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
		
		this.formapag = this.getFormapag();
	}
	
	public String salvar(){
		servico.salvar(formapag);
		lista = servico.consultar();
		
		return "lista-formapag";
	}
	
	
	
	public FormaPag getFormapag() {
		return formapag;
	}

	public void setFormapag(FormaPag formapag) {
		this.formapag = formapag;
	}

	public List<FormaPag> getLista() {
		return lista;
	}

	public void setLista(List<FormaPag> lista) {
		this.lista = lista;
	}

	public String excluir() {
		try {
			servico.excluir(formapag.getIdformapag());
			lista = servico.consultar();
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro utilizado em outro local! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}

		return "lista-formapag";
	}

}
