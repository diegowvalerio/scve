package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Empresa;

import br.com.scve.modelo.dao.DAOEmpresa;

@Dependent
public class DAOEmpresaHibernate extends DAOGenericoHibernate<Empresa> implements DAOEmpresa,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOEmpresaHibernate(){
		super(Empresa.class);
	}


}
