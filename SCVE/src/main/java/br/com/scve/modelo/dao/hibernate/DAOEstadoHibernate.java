package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.Estado;
import br.com.scve.modelo.dao.DAOEstado;

@Dependent
public class DAOEstadoHibernate extends DAOGenericoHibernate<Estado> implements DAOEstado,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOEstadoHibernate(){
		super(Estado.class);
	}

}
