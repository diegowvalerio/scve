package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.ListaPrecoItem;
import br.com.scve.modelo.dao.DAOListaPrecoItem;;

@Dependent
public class DAOListaPrecoItemHibernate extends DAOGenericoHibernate<ListaPrecoItem> implements DAOListaPrecoItem,Serializable{
		private static final long serialVersionUID = 1L;

	public DAOListaPrecoItemHibernate(){
		super(ListaPrecoItem.class);
	}
}
