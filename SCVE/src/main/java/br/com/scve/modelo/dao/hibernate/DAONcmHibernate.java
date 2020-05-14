package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Ncm;

import br.com.scve.modelo.dao.DAONcm;

@Dependent
public class DAONcmHibernate extends DAOGenericoHibernate<Ncm> implements DAONcm,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAONcmHibernate(){
		super(Ncm.class);
	}


}
