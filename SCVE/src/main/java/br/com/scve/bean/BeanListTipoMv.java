package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.entidades.TipoMv;
import br.com.scve.modelo.servico.ServicoListaPreco;
import br.com.scve.modelo.servico.ServicoTipoMv;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanListTipoMv implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private TipoMv tipomv = new TipoMv();
	@Inject
	private ServicoTipoMv servico;
	@Inject
	private ServicoListaPreco servicolista;
	private List<TipoMv> lista;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
	}
	public List<ListaPreco> getListaPrecos(){
		
		return servicolista.consultar();
	}
	
	public List<ListaPreco> getListaPrecosPromocao(){
		
		return servicolista.consultar();
	}
	
	public String salvar(){
		servico.salvar(tipomv);
		lista = servico.consultar();
		
		return "lista-tipomv";
		
	}
	
	public void excluir(){
		try{
		servico.excluir(tipomv.getIdmv());
		}catch(Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro utilizado em outro local! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
	}

	public TipoMv getTipomv() {
		return tipomv;
	}

	public void setTipomv(TipoMv tipomv) {
		this.tipomv = tipomv;
	}

	public List<TipoMv> getLista() {
		return lista;
	}

	public void setLista(List<TipoMv> lista) {
		this.lista = lista;
	}
		
	/*editar cliente*/
	 public String encaminha() {
		 FacesContext fc = FacesContext.getCurrentInstance();
		 HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
		 session.setAttribute("tipomvAux", this.tipomv );
		 
		 return "edita-tipomv";
	 }
	

}
