package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Cidade;

import br.com.scve.modelo.dao.DAOCidade;

@Dependent
public class DAOCidadeHibernate extends DAOGenericoHibernate<Cidade> implements DAOCidade,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOCidadeHibernate(){
		super(Cidade.class);
	}


}
