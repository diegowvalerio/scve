package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.TipoEndereco;
import br.com.scve.entidades.Cidade;
import br.com.scve.entidades.Vendedor;
import br.com.scve.entidades.Contato;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.servico.ServicoCidade;
import br.com.scve.modelo.servico.ServicoVendedor;
import br.com.scve.msn.FacesMessageUtil;
import br.com.scve.modelo.servico.ServicoTipoEndereco;

@Named
@ViewScoped
public class BeanEditaVendedor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Vendedor vendedor =new Vendedor(); 
	private Pfisica pfisica = new Pfisica();
	private Pjuridica pjuridica = new Pjuridica();
	private Endereco endereco = new Endereco();
	private Contato contato = new Contato();
	
	@Inject
	private ServicoVendedor servico;
	@Inject
	private ServicoCidade servicoCidade;
	@Inject
	private ServicoTipoEndereco servicoTipoende;
	
	private List<Vendedor> lista;
	private List<Endereco> enderecos = new ArrayList<>();
	private List<Contato> contatos = new ArrayList<>();
	
	//usado para definir fisica ou juridica
	private String opcao ;
	private Date data;
	private Boolean isRederiza = false;
	private Boolean isRederiza2 = false;
	
	@PostConstruct
	public void carregar(){
		
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpSession session = (HttpSession) request.getSession();
		this.vendedor = (Vendedor) session.getAttribute("vendedorAux");
		session.removeAttribute("vendedorAux");
		this.opcao = this.vendedor.getTipojf();
		this.enderecos = this.vendedor.getEnderecos();
		this.contatos = this.vendedor.getContatos();

		
		if (this.vendedor.getTipojf().equals("J")) {
			isRederiza = true;
			isRederiza2 = false;
			this.pjuridica = servico.consultarPjuridica(this.vendedor.getIdpessoa());
		}
		if (this.vendedor.getTipojf().equals("F")) {
			isRederiza = false;
			isRederiza2 = true;
			this.pfisica = servico.consultarPfisica(this.vendedor.getIdpessoa());
		}
	}
	
	public String salvar(){	
		int p = 0;
		List<Endereco> repetidos = new ArrayList<>();
		repetidos.addAll(enderecos);
		for (int i = 0; i < enderecos.size(); i++) {
			for (int b = 0; b < enderecos.size(); b++) {
				if(enderecos.get(i).getTipoendereco().equals(repetidos.get(b).getTipoendereco()) && i != b){
					p++;
				}
			}
		}
		if(p == 0){
		try{
		servico.salvar(vendedor,pfisica,pjuridica ,getOpcao(),contatos,enderecos);
		}catch (Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro j� existente! N�o foi poss�vel realizar a opera��o.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-vendedor";
		}else{
			FacesMessageUtil.addMensagemError("N�o � possivel registrar Tipo de Endere�os iguais, revise os dados informados");
			return null;
		}
	}
	public String excluir(){
		
		try{
		if (vendedor.getTipojf().equals("F")) {
			servico.excluirF(vendedor.getIdpessoa());
		}else{
			servico.excluirJ(vendedor.getIdpessoa());
		}
		servico.excluir(vendedor.getIdpessoa());
		} catch (Exception e) {
			if (e.getCause().toString().contains("ConstraintViolationException")) {
				FacesMessageUtil
						.addMensagemError("Registro utilizado em outro local! N�o foi poss�vel realizar a opera��o.");
			} else {
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		
		return "lista-vendedor";
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
	

	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public List<Vendedor> getLista() {
		return lista;
	}
	public void setLista(List<Vendedor> lista) {
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
	
	/*endereco*/
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	public void addNovoEndereco(){
		 if (this.vendedor == null){
	          throw new RuntimeException("O Vendedor n�o pode ser nulo");
	        }else{   
		         this.endereco = new Endereco(); 
	       }
	}
	
	 public void removerEndereco(){
		 this.enderecos.remove(endereco);
	 }
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List<Cidade> getCidades(){
		return servicoCidade.consultar();
	}
	public List<TipoEndereco> getTipos(){
		return servicoTipoende.consultar();
	}
	
	public void editarEnd() {
		
		int p = 0;
		if (endereco == null) {
			throw new IllegalArgumentException("Cliente nao pode ser nulo");
		}
		for (int i = 0; i < enderecos.size(); i++) {
			if (enderecos.get(i).getTipoendereco().getIdtipoend()
					.equals(endereco.getTipoendereco().getIdtipoend())) {
				p = p + 1;
			}
		}
		if (endereco.getCep().length() > 0 && endereco.getBairro().length() > 0 && endereco.getLogadouro().length() > 0
				&& endereco.getNumero().length() > 0) {
			int index = enderecos.indexOf(endereco);
			if (index > -1) {
				if (p == 0 || p == 1) {
					enderecos.remove(index);
					endereco.setPessoa(vendedor);
					enderecos.add(endereco);
				} else {
					FacesMessageUtil.addMensagemWarn("Tipo de endere�o j� existente");
				}
			} else {
				if (p == 0) {
					endereco.setPessoa(vendedor);
					enderecos.add(endereco);
				} else {
					FacesMessageUtil.addMensagemWarn("Tipo de endere�o j� existente");
				}

			}
		} else {
			FacesMessageUtil.addMensagemWarn("Preencha todos os dados");
		}
		endereco = new Endereco();
	}
	
	/*contato*/
	
	public void novocontato(){
		 this.contato = new Contato();
		
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public List<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	public void addcontato(){
		if(contato == null){
			throw new IllegalArgumentException("Vendedor nao pode ser nulo");
	    }
		if(contato.getNome().length()>0 && contato.getEmail().length()>0  && contato.getDdd().length()>0  && contato.getNumero().length()>0 ){
		int index = contatos.indexOf(contato);
		if (index > -1) {
			contatos.remove(index);
			contato.setPessoa(vendedor);
			contatos.add(index, contato);
		}else{
			contato.setPessoa(vendedor);
			contatos.add(contato);
		}
		contato = new Contato();
		}else{
			FacesMessageUtil.addMensagemWarn("Preencha todos os dados");
		}
				
	}
	
	public void excluirContato(){
		//servico.excluir(this.contato.getIdcontato());
		this.contatos.remove(contato);
	}
	
	public List<Cidade> completaCidade(String nome) {
		return servicoCidade.buscacidadenome(nome);
	}	
}
