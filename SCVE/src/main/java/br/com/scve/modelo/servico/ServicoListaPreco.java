package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.modelo.dao.DAOListaPreco;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoListaPreco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOListaPreco dao;
	
	@Transacao
	public void salvar(ListaPreco listapreco){
		try {
			if(listapreco.getIdlista() == null){
				dao.salvar(listapreco);
			}else{
				dao.alterar(listapreco);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<ListaPreco> consultar(){
		return dao.consultar();
	}
	

}
