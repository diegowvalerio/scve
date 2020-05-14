package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Cnae;

import br.com.scve.modelo.dao.DAOCnae;

@Dependent
public class DAOCnaeHibernate extends DAOGenericoHibernate<Cnae> implements DAOCnae,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOCnaeHibernate(){
		super(Cnae.class);
	}


}
