package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.dao.DAOEndereco;

@Dependent
public class DAOEnderecoHibernate extends DAOGenericoHibernate<Endereco> implements DAOEndereco,Serializable{
	private static final long serialVersionUID = 1L;

	public DAOEnderecoHibernate(){
		super(Endereco.class);
	}
}
