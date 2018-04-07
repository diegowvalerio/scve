package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.TipoMvVend;
import br.com.scve.modelo.dao.DAOTipoMvVend;

@Dependent
public class DAOTipoMvVendHibernate extends DAOGenericoHibernate<TipoMvVend> implements DAOTipoMvVend,Serializable{
		private static final long serialVersionUID = 1L;

	public DAOTipoMvVendHibernate(){
		super(TipoMvVend.class);
	}
}
