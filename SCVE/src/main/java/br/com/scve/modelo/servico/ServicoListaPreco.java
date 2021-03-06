package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.entidades.ListaPrecoItem;
import br.com.scve.modelo.dao.DAOListaPreco;
import br.com.scve.modelo.dao.DAOListaPrecoItem;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoListaPreco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOListaPreco dao;
	
	@Inject
	private DAOListaPrecoItem daoI;
	
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
	
public List<ListaPrecoItem> buscapreco(Integer idtipomv,Integer idvendedor,Integer idproduto){
		
		return daoI.buscapreco(idtipomv, idvendedor, idproduto);
	}

public List<ListaPrecoItem> buscaitens(Integer idlista,  String nome){
	List<ListaPrecoItem> lis = null;
	if(!nome.equals("")){
		lis = daoI.buscaitens(idlista,nome);
	}
	return lis;
}
}
