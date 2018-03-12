package br.com.scve.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
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
public class BeanTipoMv implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private TipoMv tipomv = new TipoMv();
	private TipoMvVend tipomvvend = new TipoMvVend();
	@Inject
	private ServicoTipoMv servico;
	@Inject
	private ServicoListaPreco servicolista;
	@Inject
	private ServicoVendedor servicoVendedor;
	private List<TipoMvVend> tipomvvends  = new ArrayList<>();
	private List<TipoMv> lista;
	
	@PostConstruct
	public void carregar(){
		this.tipomv = getTipomv();
		this.tipomvvends = this.tipomv.getTipomvvend();
		
	}
	
	public String salvar(){
		servico.salvar(tipomv);
		lista = servico.consultar();
		
		return "listaTipoMv";
		
	}

	public List<ListaPreco> getListaPrecos(){
		
		return servicolista.consultar();
	}
	
	public List<ListaPreco> getListaPrecosPromocao(){
		
		return servicolista.consultar();
	}
	
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

	/*tipomvvend*/
	
	public void novoitem(){
		this.tipomvvend = new TipoMvVend();
	}

	public void additem(){
		if(tipomvvend == null){
			throw new IllegalArgumentException("Vendedor nao pode ser nulo");
	    }
		int index = tipomvvends.indexOf(tipomvvend);
		if (index > -1) {
			tipomvvends.remove(index);
			tipomvvend.setTipomv(tipomv);
			tipomvvends.add(index, tipomvvend);
		}else{
			tipomvvend.setTipomv(tipomv);
			tipomvvends.add(tipomvvend);
		}
		tipomvvend = new TipoMvVend();
				
	}
	public void excluiritem(){
		this.tipomvvends.remove(tipomvvend);
	}
	
	public List<Vendedor> getVendedores() {
		return servicoVendedor.consultar();
	}
}
