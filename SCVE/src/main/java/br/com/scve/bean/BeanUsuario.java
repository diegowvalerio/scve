package br.com.scve.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.Usuario;
import br.com.scve.modelo.servico.ServicoUsuario;;

@Named
@ViewScoped
public class BeanUsuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	private Pfisica pfisica = new Pfisica();
	private Pjuridica pjuridica = new Pjuridica();
	@Inject
	private ServicoUsuario servico;
	private List<Usuario> lista;
	//usado para definir fisica ou juridica
	private String opcao ;
	private Date data;
	private Boolean isRederiza = false;
	private Boolean isRederiza2 = false;
	
	public BeanUsuario() {
		data = new Date();
	}
	
	public String salvar(){
		servico.salvar(usuario,pfisica,pjuridica ,getOpcao());
		lista = servico.consultar();
		
		return "listaUsuario";
	}
	public void excluir(){
		servico.excluir(usuario.getIdpessoa());
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
	

	public void renderizar() {  
        if(getOpcao().equals("J")){ 
            isRederiza = true; 
            isRederiza2= false;
            
        }
        if(getOpcao().equals("F")){
            isRederiza = false;  
            isRederiza2= true;
                        
        } 
        
        
    }

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	} 	
	/*
	public String logout(HttpSession session) {
		session.invalidate();
		return "login.xhtml";
	}

	*/
}
