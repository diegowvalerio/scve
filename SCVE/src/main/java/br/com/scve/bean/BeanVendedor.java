package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.TipoEndereco;
import br.com.scve.entidades.Cidade;
import br.com.scve.entidades.Vendedor;
import br.com.scve.entidades.Contato;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.servico.ServicoCidade;
import br.com.scve.modelo.servico.ServicoVendedor;
import br.com.scve.modelo.servico.ServicoTipoEndereco;

@Named
@ViewScoped
public class BeanVendedor implements Serializable{
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
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	private List<Contato> contatos = new ArrayList<Contato>();
	
	//usado para definir fisica ou juridica
	private String opcao ;
	private Date data;
	private Boolean isRederiza = false;
	private Boolean isRederiza2 = false;
	

	public String salvar(){
		servico.salvar(vendedor,pfisica,pjuridica ,getOpcao(),contatos,enderecos);
		lista = servico.consultar();
		
		return "index";
	}
	public String excluir(){
		
		//servico.excluirEnde(cliente.getIdpessoa());
		if (vendedor.getTipojf().equals("F")) {
			servico.excluirF(vendedor.getIdpessoa());
		}else{
			servico.excluirJ(vendedor.getIdpessoa());
		}
		servico.excluir(vendedor.getIdpessoa());
		
		lista = servico.consultar();
		
		return "index";
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
	          throw new RuntimeException("O cliente n�o pode ser nulo");
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
		if(endereco.getPessoa() == null){
			throw new IllegalArgumentException("Vendedor nao pode ser nulo");
	    }
		int index = enderecos.indexOf(endereco);
		if (index > -1) {
			enderecos.remove(index);
			endereco.setPessoa(vendedor);
			enderecos.add(index, endereco);
		}else{
			endereco.setPessoa(vendedor);
			enderecos.add(endereco);
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
		if(contato.getPessoa() == null){
			throw new IllegalArgumentException("Vendedor nao pode ser nulo");
	    }
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
				
	}
	
	public void excluirContato(){
		//servico.excluir(this.contato.getIdcontato());
		this.contatos.remove(contato);
	}
}
