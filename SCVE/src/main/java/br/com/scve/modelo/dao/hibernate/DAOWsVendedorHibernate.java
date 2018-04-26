package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.WsVendedor;

import br.com.scve.modelo.dao.DAOWsVendedor;

@Dependent
public class DAOWsVendedorHibernate extends DAOGenericoHibernate<WsVendedor> implements DAOWsVendedor,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOWsVendedorHibernate(){
		super(WsVendedor.class);
	}


}
