package br.com.scve.modelo.dao;


import java.util.Date;
import java.util.List;

public interface DAOGenerico<E> {
	public E salvar(E e);
	public E alterar(E e);
	public boolean excluir(Integer id);
	public E consultar(Integer id);
	public List<E> consultar();
	/*
	public boolean salvarList(List<E> e);
	public boolean alterarList(List<E> e);
	public boolean excluirLista(List<E> e);
	
	public List<E> consultarEnderecosId(Integer id);
	public List<E> consultarEnderecoId(Integer id,Integer tipo);
	public boolean excluirEnderecos(List<E> ids);
	
	public boolean excluirObj(E e);
	
	public List<E> consultarContatosporPessoa(Integer id);*/
	public List<E> consultarProdutosAtivos();
	
	public List<E> buscaprodutonomeativos(String e);
	public List<E> buscavendedornome(String e);
	public List<E> buscaclientenome(String e);
	public List<E> buscaclientenomeevendedor(String e,Integer v);
	
	public List<E> buscacidadenome(String e);
	
	public List<E> buscapreco(Integer idtipomv,Integer idvendedor, Integer idproduto);
	public List<E> buscaitens(Integer idlista,  String e);
	public List<E> buscalistapreco(Integer idtipomv, Integer idvendedor);
	
	public List<E> consultarAtivos();
	
	
	/*ws*/
	public E wsvendedor(Integer e);
	/*consultar cidades por cliente do vendedor especifico*/
	public List<E> wscidadesPorclienteDovendedor(Integer e);
	/*consultar pessoas por vendedor com vendedor is not null*/
	public List<E> wspessoas(Integer e);
	/*busca tipomv por vendedor*/
	public List<E> wstipomv(Integer e);	
	/*busca dados pessoa fisica*/
	public E wsPessoafisica(Integer e );
	/*busca dados pessoa juridica*/
	public E wsPessoajuridica(Integer e );
	
	/*grafico*/
	public List<E> movimentodia(Date data);
	
	
}
