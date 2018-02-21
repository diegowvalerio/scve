package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Contato;

import br.com.scve.modelo.dao.DAOContato;

@Dependent
public class DAOContatoHibernate extends DAOGenericoHibernate<Contato> implements DAOContato,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOContatoHibernate(){
		super(Contato.class);
	}


}
