package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Cest;
import br.com.scve.modelo.servico.ServicoCest;
import br.com.scve.msn.FacesMessageUtil;

@Named
@RequestScoped
public class BeanCest implements Serializable{
	private static final long serialVersionUID = 1L;

	private Cest cest = new Cest();
	@Inject
	private ServicoCest servico;
	private List<Cest> lista;

	
	
	public String salvar(){
		try{
		servico.salvar(cest);
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro j� existente! N�o foi poss�vel realizar a opera��o.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-cest";
	}

	public Cest getCest() {
		return cest;
	}

	public void setCest(Cest cest) {
		this.cest = cest;
	}

	public List<Cest> getLista() {
		return lista;
	}

	public void setLista(List<Cest> lista) {
		this.lista = lista;
	}
		

}
