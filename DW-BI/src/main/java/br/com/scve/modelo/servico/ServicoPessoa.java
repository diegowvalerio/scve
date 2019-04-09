package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Pessoa;
import br.com.scve.modelo.dao.DAOPessoa;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoPessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOPessoa dao;
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<Pessoa> consultar(){
		return dao.consultar();
	}
	public Pessoa consultarId(Integer id){
		return dao.consultar(id);
	}
	/*ws*/
	public List<Pessoa> wspessoas(Integer id){
		return dao.wspessoas(id);
	}
	
}
