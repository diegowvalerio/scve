package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Produto;
import br.com.scve.modelo.dao.DAOProduto;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoProduto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOProduto dao;
	
	@Transacao
	public void salvar(Produto produto){
		try {
			if(produto.getIdproduto() == null){
				dao.salvar(produto);
			}else{
				dao.alterar(produto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<Produto> consultar(){
		return dao.consultar();
	}
	
	public List<Produto> consultaprodutopelonome(String nome){
		List<Produto> pro = null;
		if(!nome.equals("")){
			pro = dao.buscaprodutonome(nome);
		}
		return pro;
	}
}
