package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;

import javax.enterprise.context.Dependent;


import br.com.scve.entidades.Pessoa;
import br.com.scve.modelo.dao.DAOPessoa;

@Dependent
public class DAOPessoaHibernate extends DAOGenericoHibernate<Pessoa> implements DAOPessoa,Serializable {
	private static final long serialVersionUID = 1L;
	
	public DAOPessoaHibernate(){
		super(Pessoa.class);
	}


}
