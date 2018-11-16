package br.com.scve.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.Usuario;
import br.com.scve.modelo.servico.ServicoUsuario;
import br.com.scve.msn.FacesMessageUtil;;

@Named
@ViewScoped
public class BeanListUsuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	private Pfisica pfisica = new Pfisica();
	private Pjuridica pjuridica = new Pjuridica();
	@Inject
	private ServicoUsuario servico;
	private List<Usuario> lista;

	//usado para definir fisica ou juridica
	private String opcao ;
	private Boolean isRederiza = false;
	private Boolean isRederiza2 = false;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
					
	}
	
	public void salvar(){
		servico.salvar(usuario,pfisica,pjuridica ,getOpcao());
		lista = servico.consultar();
	}

	public void excluir(){
		try{
		if (usuario.getTipojf().equals("F")){
		servico.excluirF(usuario.getIdpessoa());
		}else{
		servico.excluirJ(usuario.getIdpessoa());
		}
		servico.excluir(usuario.getIdpessoa());
		}catch (Exception e) {
			if (e.getCause().toString().contains("ConstraintViolationException")) {
				FacesMessageUtil.addMensagemError("Registro utilizado em outro local! Não foi possível realizar a operação.");
			} else {
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
	}
	
	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public Boolean getIsRederiza() {
		return isRederiza;
	}

	public void setIsRederiza(Boolean isRederiza) {
		this.isRederiza = isRederiza;
	}

	public Boolean getIsRederiza2() {
		return isRederiza2;
	}

	public void setIsRederiza2(Boolean isRederiza2) {
		this.isRederiza2 = isRederiza2;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getLista() {
		return lista;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}
	

	public Pfisica getPfisica() {
		return pfisica;
	}

	public void setPfisica(Pfisica pfisica) {
		this.pfisica = pfisica;
	}

	public Pjuridica getPjuridica() {
		return pjuridica;
	}

	public void setPjuridica(Pjuridica pjuridica) {
		this.pjuridica = pjuridica;
	}
	

	public void renderizar(Usuario usuario) {  
        if(usuario.getTipojf().equals("J")){ 
            isRederiza = true; 
            isRederiza2= false;
            pjuridica = servico.consultarPjuridica(usuario.getIdpessoa());
            setOpcao("J");
        }
        if(usuario.getTipojf().equals("F")){
            isRederiza = false;  
            isRederiza2= true;
            pfisica = servico.consultarPfisica(usuario.getIdpessoa());
            setOpcao("F");
                        
        } 
        
        
    } 	
	
	public void renderizar2() {  
        if(getOpcao().equals("J")){ 
            isRederiza = true; 
            isRederiza2= false;
            
        }
        if(getOpcao().equals("F")){
            isRederiza = false;  
            isRederiza2= true;
                        
        } 
        
        
    } 

	
}
