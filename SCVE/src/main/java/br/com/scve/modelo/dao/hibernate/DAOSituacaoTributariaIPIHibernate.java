package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.SituacaoTributariaIPI;

import br.com.scve.modelo.dao.DAOSituacaoTributariaIPI;

@Dependent
public class DAOSituacaoTributariaIPIHibernate extends DAOGenericoHibernate<SituacaoTributariaIPI> implements DAOSituacaoTributariaIPI,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOSituacaoTributariaIPIHibernate(){
		super(SituacaoTributariaIPI.class);
	}


}
