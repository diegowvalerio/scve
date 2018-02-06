package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Cliente;

import br.com.scve.modelo.dao.DAOCliente;

@Dependent
public class DAOClienteHibernate extends DAOGenericoHibernate<Cliente> implements DAOCliente,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOClienteHibernate(){
		super(Cliente.class);
	}


}
