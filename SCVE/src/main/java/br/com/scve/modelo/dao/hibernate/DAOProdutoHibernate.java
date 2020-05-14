package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Produto;

import br.com.scve.modelo.dao.DAOProduto;

@Dependent
public class DAOProdutoHibernate extends DAOGenericoHibernate<Produto> implements DAOProduto,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOProdutoHibernate(){
		super(Produto.class);
	}


}
