package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Cest;

import br.com.scve.modelo.dao.DAOCest;

@Dependent
public class DAOCestHibernate extends DAOGenericoHibernate<Cest> implements DAOCest,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOCestHibernate(){
		super(Cest.class);
	}


}
