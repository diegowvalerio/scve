package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.scve.entidades.Produto;
import br.com.scve.entidades.Vendedor;
import br.com.scve.modelo.dao.DAOGenerico;

public class DAOGenericoHibernate<E> implements DAOGenerico<E>, Serializable{
	private static final long serialVersionUID = 1L;
	
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
	/*endereco*/
	/*
	@Override
	public List<E> consultarEnderecosId(Integer id) {
	      return this.manager.createQuery("select e from Endereco e where "
	      		+ "e.pessoa.idpessoa = :id").setParameter("id", id).getResultList();
	}
	
	@Override
	public List<E> consultarEnderecoId(Integer id,Integer tipo) {
		Query query =manager.createQuery("select e from Endereco e where e.pessoa.idpessoa = :id and e.tipoendereco.idtipoend = :idtipo");
		query.setParameter("id", id);
		query.setParameter("idtipo", tipo);
		return query.getResultList();
	}
	
	@Override
	public boolean excluirEnderecos(List<E> ids) {
		for (int i = 0; i < ids.size(); i++) {
			
			manager.remove(ids.get(i));
        }
		
		return true;
	}
	
	@Override
	public boolean excluirObj(E e) {
		E c =manager.merge(e);
		manager.remove(c);
		return true;
	}
	
	
	contato
	@Override
	public List<E> consultarContatosporPessoa(Integer id) {
	      return this.manager.createQuery("select e from Contato e where "
	      		+ "e.pessoa.idpessoa = :id").setParameter("id", id).getResultList();
	}
		@Override
	public boolean salvarList(List<E> lista) {
		for (int i = 0; i < lista.size(); i++) {
			manager.persist(lista.get(i));
        }
		return true;
	}
	
	@Override
	public boolean alterarList(List<E> lista) {
		for (int i = 0; i < lista.size(); i++) {
			manager.merge(lista.get(i));
        }
		return true;
	}	
	
	@Override
	public boolean excluirLista(List<E> ids) {
		for (int i = 0; i < ids.size(); i++) {
			E e = manager.merge(ids.get(i));
			manager.remove(e);
        }
		
		return true;
	}
	
*/

	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> buscaprodutonome(String e){
		/*return this.manager.createQuery("select e from Produto e where "
	      		+ "e.descricao like '%':desc'%' and e.situacao = 'true' ").setParameter("desc", e).getResultList();		*/
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Produto.class);
		
		criteria.add(Restrictions.ilike("descricao", e.toUpperCase(),MatchMode.START));
		
		return criteria.list();
	}
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> buscavendedornome(String e){
		/*return this.manager.createQuery("select e from Produto e where "
	      		+ "e.descricao like '%':desc'%' and e.situacao = 'true' ").setParameter("desc", e).getResultList();		*/
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Vendedor.class);
		
		criteria.add(Restrictions.ilike("nome", e.toUpperCase(),MatchMode.START));
		
		return criteria.list();
	}
}
