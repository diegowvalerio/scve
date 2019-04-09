package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.TipoEndereco;
import br.com.scve.modelo.servico.ServicoTipoEndereco;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanListTipoEndereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private TipoEndereco tipoendereco = new TipoEndereco();
	@Inject
	private ServicoTipoEndereco servico;
	private List<TipoEndereco> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
	}

	
	public TipoEndereco getTipoendereco() {
		return tipoendereco;
	}


	public void setTipoendereco(TipoEndereco tipoendereco) {
		this.tipoendereco = tipoendereco;
	}


	public List<TipoEndereco> getLista() {
		return lista;
	}


	public void setLista(List<TipoEndereco> lista) {
		this.lista = lista;
	}


	public void excluir(){
		try{
		servico.excluir(tipoendereco.getIdtipoend());
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
		servico.salvar(tipoendereco);
	}
}
