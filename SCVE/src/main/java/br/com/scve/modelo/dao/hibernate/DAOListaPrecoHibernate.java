package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.ListaPreco;
import br.com.scve.modelo.dao.DAOListaPreco;

@Dependent
public class DAOListaPrecoHibernate extends DAOGenericoHibernate<ListaPreco> implements DAOListaPreco,Serializable{
		private static final long serialVersionUID = 1L;

	public DAOListaPrecoHibernate(){
		super(ListaPreco.class);
	}
}
