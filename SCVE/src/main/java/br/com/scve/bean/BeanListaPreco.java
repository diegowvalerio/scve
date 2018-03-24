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
import javax.servlet.http.HttpSession;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.entidades.ListaPrecoItem;
import br.com.scve.entidades.Produto;
import br.com.scve.modelo.servico.ServicoListaPreco;
import br.com.scve.modelo.servico.ServicoProduto;
import br.com.scve.msn.FacesMessageUtil;

@Named
@ViewScoped
public class BeanListaPreco implements Serializable {
	private static final long serialVersionUID = 1L;

	private ListaPreco listapreco = new ListaPreco();
	private ListaPrecoItem listaprecoitem = new ListaPrecoItem();

	@Inject
	private ServicoListaPreco servico;
	@Inject
	private ServicoProduto servicoProd;
	private List<ListaPreco> lista;
	private List<ListaPrecoItem> listaprecoitems = new ArrayList<>();

	private Date dt = new Date();

	@PostConstruct
	public void carregar() {
		lista = servico.consultar();

		this.listapreco = this.getListapreco();
		this.listapreco.setDtcadastro(dt);
		this.listaprecoitems = this.listapreco.getListaprecoitens();

	}

	public String salvar() {

		servico.salvar(listapreco);
		lista = servico.consultar();

		return "lista-listapreco";
	}

	public String excluir() {
		servico.excluir(listapreco.getIdlista());

		lista = servico.consultar();

		return "lista-listapreco";
	}

	public List<Produto> getProdutos() {
		return servicoProd.consultar();
	}

	public ListaPreco getListapreco() {
		return listapreco;
	}

	public void setListapreco(ListaPreco listapreco) {
		this.listapreco = listapreco;
	}

	public List<ListaPreco> getLista() {
		return lista;
	}

	public void setLista(List<ListaPreco> lista) {
		this.lista = lista;
	}

	public ListaPrecoItem getListaprecoitem() {
		return listaprecoitem;
	}

	public void setListaprecoitem(ListaPrecoItem listaprecoitem) {
		this.listaprecoitem = listaprecoitem;
	}

	public List<ListaPrecoItem> getListaprecoitems() {
		return listaprecoitems;
	}

	public void setListaprecoitems(List<ListaPrecoItem> listaprecoitems) {
		this.listaprecoitems = listaprecoitems;
	}

	/* listaprecoitem */

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public void novoitem() {
		this.listaprecoitem = new ListaPrecoItem();

	}

	public void additem() {
		int p = 0;
		if (listaprecoitem == null) {
			throw new IllegalArgumentException("Lista nao pode ser nulo");
		}
		for (int i = 0; i < listaprecoitems.size(); i++) {
			if (listaprecoitems.get(i).getProduto().getIdproduto().equals(listaprecoitem.getProduto().getIdproduto())) {
				p = p + 1;
			}
		}
		if (p == 0) {
			int index = listaprecoitems.indexOf(listaprecoitem);
			if (index > -1) {
				listaprecoitems.remove(index);
				listaprecoitem.setListapreco(listapreco);
				listaprecoitem.setDtultimaalt(dt);
				listaprecoitems.add(index, listaprecoitem);
			} else {
				listaprecoitem.setListapreco(listapreco);
				listaprecoitem.setDtultimaalt(dt);
				listaprecoitems.add(listaprecoitem);
			}

		} else {
			FacesMessageUtil.addMensagemWarn("Produto já consta na Lista de Preço");
		}
		listaprecoitem = new ListaPrecoItem();

	}

	public void excluiritem() {
		this.listaprecoitems.remove(listaprecoitem);
	}

	public List<Produto> completaProduto(String descricao) {
		return servicoProd.consultaprodutopelonome(descricao);
	}

	/* editar */
	public String encaminha() {
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
		session.setAttribute("listaprecoAux", this.listapreco);

		return "edita-listapreco";
	}

}
