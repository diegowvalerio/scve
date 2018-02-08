package br.com.scve.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.TipoEndereco;
import br.com.scve.entidades.Cidade;
import br.com.scve.entidades.Cliente;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.servico.ServicoCidade;
import br.com.scve.modelo.servico.ServicoCliente;
import br.com.scve.modelo.servico.ServicoTipoEndereco;

@Named
@ViewScoped
public class BeanCliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Cliente cliente =new Cliente(); 
	private Pfisica pfisica = new Pfisica();
	private Pjuridica pjuridica = new Pjuridica();
	private Endereco endereco = new Endereco();
	
	@Inject
	private ServicoCliente servico;
	@Inject
	private ServicoCidade servicoCidade;
	@Inject
	private ServicoTipoEndereco servicoTipoende;
	private List<Cliente> lista;
	private List<Endereco> enderecos ;
	
	//usado para definir fisica ou juridica
	private String opcao ;
	private Date data;
	private Boolean isRederiza = false;
	private Boolean isRederiza2 = false;
	
	/*@PostConstruct
	public void inicia() {
		data = new Date();
		cliente =new Cliente();
		pfisica = new Pfisica();
		pjuridica = new Pjuridica();
		endereco = new Endereco();
	}
	*/
	public String salvar(){
		servico.salvar(cliente,pfisica,pjuridica ,getOpcao());
		lista = servico.consultar();
		
		return "index";
	}
	public void excluir(){
		servico.excluir(cliente.getIdpessoa());
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
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getLista() {
		return lista;
	}

	public void setLista(List<Cliente> lista) {
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
	 /*@PostConstruct*/
	 public void addNovoEndereco(){
		 if (this.cliente == null){
	          throw new RuntimeException("O cliente não pode ser nulo");
	        }else{
		 //enderecos.add(new Endereco());
	     servico.salvar(cliente,pfisica,pjuridica ,getOpcao());   	
		 this.endereco = new Endereco();
		 this.endereco.setPessoa(cliente);
		 
	        }
	}
	 public void removerEndereco(Endereco endeco){
	        //condição para garantir pelo menos 2 enderecos
	        if(getEnderecos().size()>1){
	            getEnderecos().remove(endeco);
	        }
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
	
	public String salvarende(){
		servico.salvarende(cliente,pfisica,pjuridica ,getOpcao(),endereco);	
						
		return null;
	}
}
