package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.CondPgto;

import br.com.scve.modelo.dao.DAOCondicaoPagto;

@Dependent
public class DAOCondicaoPagtoHibernate extends DAOGenericoHibernate<CondPgto> implements DAOCondicaoPagto,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOCondicaoPagtoHibernate(){
		super(CondPgto.class);
	}


}
