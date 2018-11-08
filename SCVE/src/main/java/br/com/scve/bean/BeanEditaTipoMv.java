package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.entidades.TipoMv;
import br.com.scve.entidades.TipoMvVend;
import br.com.scve.entidades.Vendedor;
import br.com.scve.modelo.servico.ServicoListaPreco;
import br.com.scve.modelo.servico.ServicoTipoMv;
import br.com.scve.modelo.servico.ServicoVendedor;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanEditaTipoMv implements Serializable {
	private static final long serialVersionUID = 1L;

	private TipoMv tipomv = new TipoMv();
	private TipoMvVend tipomvvend = new TipoMvVend();
	@Inject
	private ServicoTipoMv servico;
	@Inject
	private ServicoListaPreco servicolista;
	@Inject
	private ServicoVendedor servicoVendedor;
	private List<TipoMvVend> tipomvvends = new ArrayList<>();
	private List<TipoMv> lista;
	//private List<ListaPreco> listaprecopromocao ;

	@PostConstruct
	public void carregar() {

		lista = servico.consultar();

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		HttpSession session = (HttpSession) request.getSession();
		this.tipomv = (TipoMv) session.getAttribute("tipomvAux");
		session.removeAttribute("tipomvAux");

		// this.tipomv = this.getTipomv();
		this.tipomvvends = this.tipomv.getTipomvvends();
		
	}

	public String salvar() {
		servico.salvar(tipomv);
		lista = servico.consultar();

		return "lista-tipomv";

	}

	public List<ListaPreco> getListaPrecos() {

		return servicolista.consultar();
	}

	// nao repete lista de preço para promocao
	/*public List<ListaPreco> getListaprecopromocao() {
		return listaprecopromocao;
	}

	public void setListaprecopromocao(List<ListaPreco> listaprecopromocao) {
		this.listaprecopromocao = listaprecopromocao;
	}

	public void retiralistaPreco() {
		List<ListaPreco> listap2 = new ArrayList<ListaPreco>();
		try {
			listap2 = servicolista.consultar();
			int index = listap2.indexOf(tipomvvend.getListapreco());
			if (index > -1) {
				listap2.remove(index);
				this.listaprecopromocao = listap2;
				//System.out.println("ok");
			}else{
				this.listaprecopromocao = servicolista.consultar();
			}
			//System.out.println("ok2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
*/
	// fim filtro de lista

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

	public TipoMvVend getTipomvvend() {
		return tipomvvend;
	}

	public void setTipomvvend(TipoMvVend tipomvvend) {
		this.tipomvvend = tipomvvend;
	}

	public List<TipoMvVend> getTipomvvends() {
		return tipomvvends;
	}

	public void setTipomvvends(List<TipoMvVend> tipomvvends) {
		this.tipomvvends = tipomvvends;
	}

	/* tipomvvend */

	public void novoitem() {
		this.tipomvvend = new TipoMvVend();
		// this.tipomvvend.setVendedor(null);
	}

	public void additem() {
		ListaPreco p1 = null;
		ListaPreco p2 = null;
		if(tipomvvend.getListapreco() != null){
			p1 = tipomvvend.getListapreco();
		}
		if(tipomvvend.getListaprecopromocao() != null){
			p2 = tipomvvend.getListapreco();
		}
		if(p1 != null){
		if (p1.equals(p2)){// si for listas iguais exibe msg e nao salva o campo PROMOÇÃO
			FacesMessageUtil.addMensagemWarn("Nâo é permitido utilizar a mesma Lista de Preço como Principal e Promoção !");
			int index = tipomvvends.indexOf(tipomvvend);
			if (index > -1) {
				tipomvvends.remove(index);
				tipomvvend.setTipomv(tipomv);
				tipomvvend.setListaprecopromocao(null);
				tipomvvends.add(index, tipomvvend);
			}
		}else{ //inicio listas diferentes entao salva ou edita
			//System.out.println("difere"+p1.getNome()+" de " +p2.getNome());
		
		if (tipomvvend.getVendedor() == null || tipomvvend.getListapreco() == null ) {
			//throw new IllegalArgumentException("Vendedor nao pode ser nulo");
			FacesMessageUtil.addMensagemError("Vendedor nao pode ser nulo");
			int index = tipomvvends.indexOf(tipomvvend);
			if (index > -1) {
				tipomvvends.remove(index);
			}
		}else{
		int index = tipomvvends.indexOf(tipomvvend);
		if (index > -1) {
			tipomvvends.remove(index);
			tipomvvend.setTipomv(tipomv);
			tipomvvends.add(index, tipomvvend);
		} else {
			tipomvvend.setTipomv(tipomv);
			tipomvvends.add(tipomvvend);
		}
		}
		}//fim se for listas diferentes
		}else{
			FacesMessageUtil.addMensagemWarn("Preencha todos os dados");
		}
		tipomvvend = new TipoMvVend();
	}
	
	public void excluiritem() {
		this.tipomvvends.remove(tipomvvend);
	}

	public List<Vendedor> getVendedores() {
		return servicoVendedor.consultar();
	}

	public List<Vendedor> completaVendedor(String nome) {
		return servicoVendedor.buscavendedornome(nome);
	}
}
