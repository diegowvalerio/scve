package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.SituacaoTributaria;

import br.com.scve.modelo.dao.DAOSituacaoTributaria;;

@Dependent
public class DAOSituacaoTributariaHibernate extends DAOGenericoHibernate<SituacaoTributaria> implements DAOSituacaoTributaria,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOSituacaoTributariaHibernate(){
		super(SituacaoTributaria.class);
	}


}
