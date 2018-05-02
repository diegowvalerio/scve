package br.com.scve.modelo.dao.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

import br.com.scve.entidades.Cidade;
import br.com.scve.entidades.Cliente;
import br.com.scve.entidades.Endereco;
import br.com.scve.entidades.Estado;
import br.com.scve.entidades.ListaPrecoItem;
import br.com.scve.entidades.Pessoa;
import br.com.scve.entidades.Produto;
import br.com.scve.entidades.TipoMvVend;
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
	public List<E> buscaprodutonomeativos(String e){
		/*return this.manager.createQuery("select e from Produto e where "
	      		+ "e.descricao like '%':desc'%' and e.situacao = 'true' ").setParameter("desc", e).getResultList();		*/
		boolean bo = true;
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Produto.class);
		
		criteria.add(Restrictions.ilike("descricao", e.toUpperCase(),MatchMode.START));
		criteria.add(Restrictions.eq("situacao", bo));
		
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
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> buscacidadenome(String e){
		/*return this.manager.createQuery("select e from Produto e where "
	      		+ "e.descricao like '%':desc'%' and e.situacao = 'true' ").setParameter("desc", e).getResultList();		*/
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Cidade.class);
		
		criteria.add(Restrictions.ilike("nome", e.toUpperCase(),MatchMode.START));
		
		return criteria.list();
	}
	//consultarProdutosAtivos
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> consultarProdutosAtivos(){
		/*return this.manager.createQuery("select e from Produto e where "
	      		+ "e.descricao like '%':desc'%' and e.situacao = 'true' ").setParameter("desc", e).getResultList();		*/
		boolean bo = true;
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Produto.class);
		
		criteria.add(Restrictions.eq("situacao", bo));
		
		return criteria.list();
	}
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> buscaclientenome(String e){
		boolean bo = true;
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Cliente.class);
		
		criteria.add(Restrictions.ilike("nome", e.toUpperCase(),MatchMode.START));
		criteria.add(Restrictions.eq("situacao", bo));
		return criteria.list();
	}
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> buscaclientenomeevendedor(String e,Integer v){
		boolean bo = true;
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Cliente.class);
		
		criteria.add(Restrictions.ilike("nome", e.toUpperCase(),MatchMode.START));
		criteria.add(Restrictions.eq("situacao", bo));
		criteria.add(Restrictions.eq("vendresp.idpessoa", v));
		return criteria.list();
	}
	
	
	//consultarTipode mv
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> consultarAtivos(){
		boolean bo = true; 
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(classeEntidade);
		
		criteria.add(Restrictions.eq("situacao", bo));
		
		return criteria.list();
	}
	
	//busca lista de preco do vendedor
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> buscalistapreco(Integer idtipomv, Integer idvendedor){
		
		Session session = manager.unwrap(Session.class);		
		Criteria criteria = session.createCriteria(TipoMvVend.class);		
		criteria.add(Restrictions.eq("tipomv.idmv", idtipomv));
		criteria.add(Restrictions.eq("vendedor.idpessoa", idvendedor));
		return criteria.list();
	}
	
	//busca itens da lista de preco do vendedor que foi definida no tipo de mv
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> buscaitens(Integer idlista, String e){
		/*return this.manager.createQuery("select e from Produto e where "
	      		+ "e.descricao like '%':desc'%' and e.situacao = 'true' ").setParameter("desc", e).getResultList();		*/
		boolean bo = true;
		
		Session session = manager.unwrap(Session.class);		
		Criteria criteria = session.createCriteria(ListaPrecoItem.class,"li");
		criteria.createAlias("produto", "p", JoinType.INNER_JOIN);
		criteria.createAlias("listapreco", "l", JoinType.INNER_JOIN);
		//criteria.createCriteria("p","produto",Criteria.INNER_JOIN);
		//criteria.createCriteria("l","listapreco",Criteria.INNER_JOIN);
		
		//criteria.add(Restrictions.eq("li.id.idproduto", "p.idproduto"));
		//criteria.add(Restrictions.eq("l.idlista", "li.id.idlista"));
		//criteria.add(Restrictions.eq("p.situacao", bo));
		criteria.add(Restrictions.eq("li.id.idlista",idlista));
		criteria.add(Restrictions.ilike("p.descricao", e.toUpperCase(),MatchMode.START));
		

		return criteria.list();
		
	}
	
	//buscapreco
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<E> buscapreco(Integer idtipomv, Integer idvendedor, Integer idproduto){
		/*return this.manager.createQuery("select e from Produto e where "
	      		+ "e.descricao like '%':desc'%' and e.situacao = 'true' ").setParameter("desc", e).getResultList();		*/
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(ListaPrecoItem.class,"i");
		criteria.createCriteria("v","TipoMvVend",Criteria.INNER_JOIN);
		criteria.createCriteria("e","ListaPrecoItem",Criteria.LEFT_JOIN);
		criteria.add(Restrictions.eq("e.idlista", "v.listaprecopromocao_idlista"));
		criteria.add(Restrictions.eq("e.idproduto", idproduto));
		criteria.add(Restrictions.eq("v.idmv", idtipomv));
		criteria.add(Restrictions.eq("v.idpessoa", idvendedor));
		criteria.add(Restrictions.eq("i.idproduto", idproduto));
		
		
		return criteria.list();
	}
	
	/*ws*/
	@Override
	public E wsvendedor(Integer e){
		return (E) manager.find(classeEntidade, e);
	}
	
	@Override
	public List<E> wscidadesPorclienteDovendedor(Integer e){
		/*Session session = manager.unwrap(Session.class);
		Transaction tx;
		tx = session.beginTransaction();
		String s = ("select e.idcidade,e.nome,e.estado_id from tbcidade e"
										+"inner join tbendereco en on en.cidade_idcidade = e.idcidade"
										+"inner join tbpessoa p on p.idpessoa = en.idpessoa"
										+"inner join tbcliente c on c.idpessoa = p.idpessoa"
										+"where en.idpessoa = ?");	
		Query query = session.createSQLQuery(s).setParameter ("id",e);
		List<E> lista =  query.getResultList();
		tx.commit();
		return lista;*/
		
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Pessoa.class,"p");
		criteria.add(Restrictions.eq("p.vendresp.idpessoa", e));
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.addAll(criteria.list());
		List<Endereco> enderecos = new ArrayList<>();
		for(Pessoa pe : pessoas){
			//Pessoa p = new Pessoa();
			//p = pe;
			enderecos.addAll(pe.getEnderecos());
		}
		//List<Integer> ids ;
		List<Cidade> cidades= new ArrayList<>();
		for (Endereco en : enderecos){
			Endereco end = new Endereco();
			end = en;
			Criteria criteria2 = session.createCriteria(Cidade.class,"c");
			criteria2.add(Restrictions.eq("c.idcidade", end.getCidade().getIdcidade()));
			cidades.addAll(criteria2.list());
			
		}
		
		//List<Integer> idss ;
		List<Estado> estados= new ArrayList<>();
		List<E> cidadess= new ArrayList<>();
		for (Cidade cid : cidades){
			Cidade cids = new Cidade();
			cids = cid;
			//if(cidades.contains(cids)){
			Criteria criteria3 = session.createCriteria(Estado.class,"c");
			criteria3.add(Restrictions.eq("c.idestado", cids.getEstado().getIdestado()));
			estados.addAll(criteria3.list());
			//cidades.remove(cids);
			//} 
		}
		
		for(Estado es : estados){
			Estado est = new Estado();
			est = es;
			Criteria criteria4 = session.createCriteria(Cidade.class,"c");
			criteria4.add(Restrictions.eq("c.estado.idestado", est.getIdestado()));
			cidadess.addAll(criteria4.list());
						
		}
		return cidadess;
	}
	
}
