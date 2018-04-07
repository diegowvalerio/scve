package br.com.scve.modelo.dao;


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
	
	
	
	
}
