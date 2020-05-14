package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.FormaPag;

import br.com.scve.modelo.dao.DAOFormaPag;

@Dependent
public class DAOFormaPagHibernate extends DAOGenericoHibernate<FormaPag> implements DAOFormaPag,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOFormaPagHibernate(){
		super(FormaPag.class);
	}


}
