package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Application;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.TipoEndereco;
import br.com.scve.entidades.Vendedor;
import br.com.scve.entidades.Cidade;
import br.com.scve.entidades.Cliente;
import br.com.scve.entidades.Cnae;
import br.com.scve.entidades.Contato;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.servico.ServicoCidade;
import br.com.scve.modelo.servico.ServicoCliente;
import br.com.scve.modelo.servico.ServicoCnae;
import br.com.scve.modelo.servico.ServicoTipoEndereco;
import br.com.scve.modelo.servico.ServicoVendedor;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanEditaCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	private Cliente cliente = new Cliente();
	private Pfisica pfisica = new Pfisica();
	private Pjuridica pjuridica = new Pjuridica();
	private Endereco endereco = new Endereco();
	private Contato contato = new Contato();

	@Inject
	private ServicoCliente servico;
	@Inject
	private ServicoCidade servicoCidade;
	@Inject
	private ServicoVendedor servicoVendedor;
	@Inject
	private ServicoCnae servicoCnae;
	@Inject
	private ServicoTipoEndereco servicoTipoende;
	private List<Cliente> lista;
	private List<Endereco> enderecos = new ArrayList<>();
	private List<Contato> contatos = new ArrayList<>();

	// usado para definir fisica ou juridica
	private String opcao;
	private Date data;
	private Boolean isRederiza = false;
	private Boolean isRederiza2 = false;

	@PostConstruct
	public void ini() {
		lista = servico.consultar();

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		HttpSession session = (HttpSession) request.getSession();
		this.cliente = (Cliente) session.getAttribute("clienteAux");
		session.removeAttribute("clienteAux");
		this.opcao = this.cliente.getTipojf();
		// this.pfisica = (Pfisica) session.getAttribute("pfisica");
		this.enderecos = this.cliente.getEnderecos();
		this.contatos = this.cliente.getContatos();
		// this.enderecos = (List<Endereco>) session.getAttribute("enderecos");
		// this.contatos = (List<Contato>) session.getAttribute("contatos");

		if (this.cliente.getTipojf().equals("J")) {
			isRederiza = true;
			isRederiza2 = false;
			this.pjuridica = servico.consultarPjuridica(this.cliente.getIdpessoa());
		}
		if (this.cliente.getTipojf().equals("F")) {
			isRederiza = false;
			isRederiza2 = true;
			this.pfisica = servico.consultarPfisica(this.cliente.getIdpessoa());
		}

	}

	public String salvar() {
		//verifica tipo de enderecos repetidos
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
		try {
			cliente.setEnderecos(enderecos);
			servico.salvar(cliente, pfisica, pjuridica, getOpcao(), contatos, enderecos);
		} catch (Exception e) {
			if (e.getCause().toString().contains("ConstraintViolationException")) {
				FacesMessageUtil.addMensagemError("Registro j� existente! N�o foi poss�vel realizar a opera��o.");
			} else {
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();

		return "lista-cliente";
		}else{
			FacesMessageUtil.addMensagemError("N�o � possivel registrar Tipo de Endere�os iguais, revise os dados informados");
			return null;
		}
	}

	public String excluir() {

		try {
			if (cliente.getTipojf().equals("F")) {
				servico.excluirF(cliente.getIdpessoa());
			} else {
				servico.excluirJ(cliente.getIdpessoa());
			}
			servico.excluir(cliente.getIdpessoa());
		} catch (Exception e) {
			if (e.getCause().toString().contains("ConstraintViolationException")) {
				FacesMessageUtil
						.addMensagemError("Registro utilizado em outro local! N�o foi poss�vel realizar a opera��o.");
			} else {
				FacesMessageUtil.addMensagemError(e.getCause().toString());
			}
		}
		lista = servico.consultar();

		return "lista-cliente";
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
		if (getOpcao().equals("J")) {
			isRederiza = true;
			isRederiza2 = false;

		}
		if (getOpcao().equals("F")) {
			isRederiza = false;
			isRederiza2 = true;

		}

	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	/* endereco */
	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public void addNovoEndereco() {
		if (this.cliente == null) {
			throw new RuntimeException("O cliente n�o pode ser nulo");
		} else {
			this.endereco = new Endereco();
		}
	}

	public void removerEndereco() {
		int index = enderecos.indexOf(endereco);
		if (index > -1) {
			this.enderecos.remove(index);
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Cidade> getCidades() {
		return servicoCidade.consultar();
	}

	public List<Vendedor> getVendedores() {
		return servicoVendedor.consultar();
	}
	public List<Cnae> getCnae() {
		return servicoCnae.consultar();
	}

	public List<TipoEndereco> getTipos() {
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
					endereco.setPessoa(cliente);
					enderecos.add(endereco);
				} else {
					FacesMessageUtil.addMensagemWarn("Tipo de endere�o j� existente");
				}
			} else {
				if (p == 0) {
					endereco.setPessoa(cliente);
					enderecos.add(endereco);
				} else {
					FacesMessageUtil.addMensagemWarn("Tipo de endere�o j� existente");
				}

			}
			endereco = new Endereco();
		} else {
			FacesMessageUtil.addMensagemWarn("Preencha todos os dados");
		}
	}
	/* contato */

	public void novocontato() {
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

	public void addcontato() {
		if (contato == null) {
			throw new IllegalArgumentException("Cliente nao pode ser nulo");
		}
		if (contato.getNome().length() > 0 && contato.getEmail().length() > 0 && contato.getDdd().length() > 0
				&& contato.getNumero().length() > 0) {
			int index = contatos.indexOf(contato);
			if (index > -1) {
				contatos.remove(index);
				contato.setPessoa(cliente);
				contatos.add(index, contato);
			} else {
				contato.setPessoa(cliente);
				contatos.add(contato);
			}

			contato = new Contato();
		} else {
			FacesMessageUtil.addMensagemWarn("Preencha todos os dados");
		}
	}

	public void excluirContato() {
		// servico.excluir(this.contato.getIdcontato());
		this.contatos.remove(contato);
	}

	public List<Cidade> completaCidade(String nome) {
		return servicoCidade.buscacidadenome(nome);
	}

}
