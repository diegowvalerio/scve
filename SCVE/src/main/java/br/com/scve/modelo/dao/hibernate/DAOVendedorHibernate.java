package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Vendedor;

import br.com.scve.modelo.dao.DAOVendedor;

@Dependent
public class DAOVendedorHibernate extends DAOGenericoHibernate<Vendedor> implements DAOVendedor,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOVendedorHibernate(){
		super(Vendedor.class);
	}


}
