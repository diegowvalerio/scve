package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Cnae;
import br.com.scve.modelo.servico.ServicoCnae;
import br.com.scve.msn.FacesMessageUtil;

@Named
@RequestScoped
public class BeanCnae implements Serializable{
	private static final long serialVersionUID = 1L;

	private Cnae cnae = new Cnae();
	@Inject
	private ServicoCnae servico;
	private List<Cnae> lista;

	
	
	public String salvar(){
		try{
		servico.salvar(cnae);
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro já existente! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-cnae";
	}

	public Cnae getCnae() {
		return cnae;
	}

	public void setCnae(Cnae cnae) {
		this.cnae = cnae;
	}

	public List<Cnae> getLista() {
		return lista;
	}

	public void setLista(List<Cnae> lista) {
		this.lista = lista;
	}
		

}
