package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.TipoEndereco;
import br.com.scve.modelo.dao.DAOTipoEndereco;

@Dependent
public class DAOTipoEnderecoHibernate extends DAOGenericoHibernate<TipoEndereco> implements DAOTipoEndereco,Serializable{
		private static final long serialVersionUID = 1L;

	public DAOTipoEnderecoHibernate(){
		super(TipoEndereco.class);
	}
}
