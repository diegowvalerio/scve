package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.TipoMv;
import br.com.scve.modelo.dao.DAOTipoMv;

@Dependent
public class DAOTipoMvHibernate extends DAOGenericoHibernate<TipoMv> implements DAOTipoMv,Serializable{
		private static final long serialVersionUID = 1L;

	public DAOTipoMvHibernate(){
		super(TipoMv.class);
	}
}
