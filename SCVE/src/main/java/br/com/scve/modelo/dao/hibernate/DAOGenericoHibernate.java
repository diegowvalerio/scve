package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.dao.DAOGenerico;

public class DAOGenericoHibernate<E> implements DAOGenerico<E>, Serializable{
	@Inject
	protected EntityManager manager;
	private Class classeEntidade;
	
	public DAOGenericoHibernate(Class classeEntidade){
		this.classeEntidade = classeEntidade;
	}

	@Override
	public E salvar(E e) {
		manager.persist(e);
		return e;
	}

	@Override
	public E alterar(E e) {
		return manager.merge(e);
	}

	@Override
	public boolean excluir(Integer id) {
		E e = consultar(id);
		manager.remove(e);
		return true;
	}

	@Override
	public E consultar(Integer id) {
		return (E) manager.find(classeEntidade, id);
	}

	@Override
	public List<E> consultar() {
		return manager.createQuery("from "+classeEntidade.getSimpleName()).getResultList();
	}
	
	@Override
	public List<E> consultarEnderecosId(Integer id) {
	      return this.manager.createQuery("select e from Endereco e where "
	      		+ "e.pessoa.idpessoa = :id").setParameter("id", id).getResultList();
	}
	
	@Override
	public List<E> consultarEnderecoId(Integer id,Integer tipo) {
		Query query =manager.createQuery("select e from Endereco e where e.pessoa.idpessoa = :id and e.idtipoend = :idtipo");
		query.setParameter("id", id);
		query.setParameter("idtipo", tipo);
		return query.getResultList();
	}
	
	@Override
	public boolean excluirEnderecos(List<E> ids) {
		for (int i = 0; i < ids.size(); i++) {
			System.out.println("Id Endereco: "+ids.get(i));
			/*manager.createQuery("delete from Endereco  where Endereco.pessoa.idpessoa = :id").setParameter("id", ids).executeUpdate();*/
			manager.remove(ids.get(i));
        }
		
		return true;
	}
	
	@Override
	public boolean excluirObj(Object e) {
		manager.remove(e);
		return true;
	}

}
