package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Cfop;

import br.com.scve.modelo.dao.DAOCfop;

@Dependent
public class DAOCfopHibernate extends DAOGenericoHibernate<Cfop> implements DAOCfop,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOCfopHibernate(){
		super(Cfop.class);
	}


}
