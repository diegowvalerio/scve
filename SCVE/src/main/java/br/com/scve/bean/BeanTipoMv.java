package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.entidades.TipoMv;
import br.com.scve.entidades.TipoMvVend;
import br.com.scve.entidades.Vendedor;
import br.com.scve.modelo.servico.ServicoListaPreco;
import br.com.scve.modelo.servico.ServicoTipoMv;
import br.com.scve.modelo.servico.ServicoVendedor;

@Named
@ViewScoped
public class BeanTipoMv implements Serializable {
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
	private List<ListaPreco> listaprecopromocao;

	@PostConstruct
	public void carregar() {

		lista = servico.consultar();

		this.tipomv = this.getTipomv();
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

	// nao repete lista de pre�o para promocao
	public List<ListaPreco> getListaprecopromocao() {
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

	//fim filtro de lista

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
	}

	public void additem() {
		if (tipomvvend.getVendedor() == null) {
			throw new IllegalArgumentException("Vendedor nao pode ser nulo");
		}
		int index = tipomvvends.indexOf(tipomvvend);
		if (index > -1) {
			tipomvvends.remove(index);
			tipomvvend.setTipomv(tipomv);
			tipomvvends.add(index, tipomvvend);
		} else {
			tipomvvend.setTipomv(tipomv);
			tipomvvends.add(tipomvvend);
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
