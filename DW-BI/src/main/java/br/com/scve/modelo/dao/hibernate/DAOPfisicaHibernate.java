package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.Pfisica;
import br.com.scve.modelo.dao.DAOPfisica;

@Dependent
public class DAOPfisicaHibernate extends DAOGenericoHibernate<Pfisica> implements DAOPfisica,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOPfisicaHibernate(){
		super(Pfisica.class);
	}

}
