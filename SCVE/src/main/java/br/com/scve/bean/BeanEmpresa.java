package br.com.scve.bean;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.TipoEndereco;
import br.com.scve.fiscal.StatusServicoWebTeste;
import br.com.scve.fiscal.CertificadoEmpresa;
import br.com.scve.entidades.Cidade;
import br.com.scve.entidades.Contato;
import br.com.scve.entidades.Empresa;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.servico.ServicoCidade;
import br.com.scve.modelo.servico.ServicoEmpresa;
import br.com.scve.msn.FacesMessageUtil;
import br.com.scve.modelo.servico.ServicoTipoEndereco;

@Named
@ViewScoped
public class BeanEmpresa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Empresa empresa =new Empresa(); 
	private Pfisica pfisica = new Pfisica();
	private Pjuridica pjuridica = new Pjuridica();
	private Endereco endereco = new Endereco();
	private Contato contato = new Contato();
	
	@Inject
	private ServicoEmpresa servico;
	@Inject
	private ServicoCidade servicoCidade;
	@Inject
	private ServicoTipoEndereco servicoTipoende;
	private List<Empresa> lista;
	private List<Endereco> enderecos = new ArrayList<>();
	private List<Contato> contatos = new ArrayList<>();
	private Date dt = new Date();
	
	private StreamedContent certificado;
	
	//usado para definir fisica ou juridica
	private String opcao ;
	private Date data ;
	private Boolean isRederiza = false;
	private Boolean isRederiza2 = false;
	
	@PostConstruct
	public void carregar(){
		lista = servico.consultar();
		
		this.empresa = this.getEmpresa();
		this.empresa.setDtcadastro(dt);
		this.opcao = this.empresa.getTipojf();
		this.enderecos = this.empresa.getEnderecos();
		this.contatos = this.empresa.getContatos();
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
		servico.salvar(empresa,pfisica,pjuridica ,getOpcao(),contatos,enderecos);
		}catch (Exception e){
			if(e.getCause().toString().contains("ConstraintViolationException")){
				FacesMessageUtil.addMensagemError("Registro já existente! Não foi possível realizar a operação.");
			}else{
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();
		return "lista-empresa";
		}else{
			FacesMessageUtil.addMensagemError("Não é possivel registrar Tipo de Endereços iguais, revise os dados informados");
			return null;
		}
	}
	public String excluir(){
		
		try{
			if (empresa.getTipojf().equals("F")) {
				servico.excluirF(empresa.getIdpessoa());
			}else{
				servico.excluirJ(empresa.getIdpessoa());
			}
			servico.excluir(empresa.getIdpessoa());
			} catch (Exception e) {
				if (e.getCause().toString().contains("ConstraintViolationException")) {
					FacesMessageUtil
							.addMensagemError("Registro utilizado em outro local! Não foi possível realizar a operação.");
				} else {
					FacesMessageUtil.addMensagemError(e.getCause().toString());
				}
			}
			lista = servico.consultar();
			
			return "lista-empresa";
	}
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
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
	

	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public List<Empresa> getLista() {
		return lista;
	}
	public void setLista(List<Empresa> lista) {
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
		 if (this.empresa == null){
	          throw new RuntimeException("A Empresa não pode ser nulo");
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
			throw new IllegalArgumentException("empresa nao pode ser nulo");
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
					endereco.setPessoa(empresa);
					enderecos.add(endereco);
				} else {
					FacesMessageUtil.addMensagemWarn("Tipo de endereço já existente");
				}
			} else {
				if (p == 0) {
					endereco.setPessoa(empresa);
					enderecos.add(endereco);
				} else {
					FacesMessageUtil.addMensagemWarn("Tipo de endereço já existente");
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
			throw new IllegalArgumentException("empresa nao pode ser nulo");
	    }
		if(contato.getNome().length()>0 && contato.getEmail().length()>0  && contato.getDdd().length()>0  && contato.getNumero().length()>0 ){
		int index = contatos.indexOf(contato);
		if (index > -1) {
			contatos.remove(index);
			contato.setPessoa(empresa);
			contatos.add(index, contato);
		}else{
			contato.setPessoa(empresa);
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
	
	/*editar vendedor*/
	 public String encaminha() {
		 FacesContext fc = FacesContext.getCurrentInstance();
		 HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
		 session.setAttribute("empresaAux", this.empresa );
		 
		 return "edita-empresa";
	 }
	 public List<Cidade> completaCidade(String nome) {
			return servicoCidade.buscacidadenome(nome);
		}
	 
	 public void handleFileUpload(FileUploadEvent event) throws ParseException {
	        try {	            
	            this.empresa.setCertificadobyte(event.getFile().getContents());
	            this.setCertificado(new DefaultStreamedContent(event.getFile().getInputstream()));
	            
	            Instant instant = CertificadoEmpresa.main(this.empresa.getCertificadobyte(), this.empresa.getSenhacertificado()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
	            Date data = Date.from(instant);
			    this.empresa.setDtvencimentocertificado(data);
	   		 
	            FacesMessage message = new FacesMessage("Sucesso", event.getFile().getFileName() + " foi carregado.");
	            FacesContext.getCurrentInstance().addMessage(null, message);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 
	}
	
	 public void validacertificado() throws ParseException{
		    Instant instant = CertificadoEmpresa.main(this.empresa.getCertificadobyte(), this.empresa.getSenhacertificado()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
            Date data = Date.from(instant);
		    this.empresa.setDtvencimentocertificado(data);
		// StatusServicoWebTeste.main("C:/Users/Valerio/N P FONTANA MARCHEZAN METAIS.pfx", this.empresa.getSenhacertificado());
	 }

	public StreamedContent getCertificado() {
		return certificado;
	}

	public void setCertificado(StreamedContent certificado) {
		this.certificado = certificado;
	}
}
