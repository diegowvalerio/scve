package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Movimento;

import br.com.scve.modelo.dao.DAOMovimento;

@Dependent
public class DAOMovimentoHibernate extends DAOGenericoHibernate<Movimento> implements DAOMovimento,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOMovimentoHibernate(){
		super(Movimento.class);
	}


}
