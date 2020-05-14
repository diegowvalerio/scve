package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.RegraImposto;

import br.com.scve.modelo.dao.DAORegraImposto;

@Dependent
public class DAORegraImpostoHibernate extends DAOGenericoHibernate<RegraImposto> implements DAORegraImposto,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAORegraImpostoHibernate(){
		super(RegraImposto.class);
	}


}
