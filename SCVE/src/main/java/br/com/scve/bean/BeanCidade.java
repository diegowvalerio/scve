package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Cidade;
import br.com.scve.entidades.Estado;
import br.com.scve.modelo.servico.ServicoCidade;
import br.com.scve.modelo.servico.ServicoEstado;
import br.com.scve.msn.FacesMessageUtil;

@Named
@RequestScoped
public class BeanCidade implements Serializable{
	private static final long serialVersionUID = 1L;

	private Cidade cidade = new Cidade();
	@Inject
	private ServicoCidade servico;
	@Inject
	private ServicoEstado servicoEst;
	private List<Cidade> lista;

	
	
	public String salvar(){
		try{
		servico.salvar(cidade);
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro j� existente! N�o foi poss�vel realizar a opera��o.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-cidade";
	}
	
	public List<Estado> getEstados2(){
		return servicoEst.consultar();
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getLista() {
		return lista;
	}

	public void setLista(List<Cidade> lista) {
		this.lista = lista;
	}
		

}
