package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.SituacaoTributariaPISCOFINS;

import br.com.scve.modelo.dao.DAOSituacaoTributariaPISCOFINS;

@Dependent
public class DAOSituacaoTributariaPISCOFINSHibernate extends DAOGenericoHibernate<SituacaoTributariaPISCOFINS> implements DAOSituacaoTributariaPISCOFINS,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOSituacaoTributariaPISCOFINSHibernate(){
		super(SituacaoTributariaPISCOFINS.class);
	}


}
