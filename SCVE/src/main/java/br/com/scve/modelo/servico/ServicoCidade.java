package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Cidade;
import br.com.scve.modelo.dao.DAOCidade;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoCidade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOCidade dao;
	
	@Transacao
	public void salvar(Cidade cidade){
		try {
			if(cidade.getIdcidade() == null){
				dao.salvar(cidade);
			}else{
				dao.alterar(cidade);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<Cidade> consultar(){
		return dao.consultar();
	}
	

}
