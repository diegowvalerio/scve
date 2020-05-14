package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Cnae;
import br.com.scve.modelo.servico.ServicoCnae;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanEditaCnae implements Serializable{

	private static final long serialVersionUID = 1L;
	private Cnae cnae = new Cnae();
	@Inject
	private ServicoCnae servico;
	private List<Cnae> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
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

	public void excluir(){
		try{
		servico.excluir(cnae.getIdcnae());
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
		servico.salvar(cnae);
	}
}
