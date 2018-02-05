package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.Pjuridica;
import br.com.scve.modelo.dao.DAOPjuridica;

@Dependent
public class DAOPjuridicaHibernate extends DAOGenericoHibernate<Pjuridica> implements DAOPjuridica,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOPjuridicaHibernate(){
		super(Pjuridica.class);
	}

}
