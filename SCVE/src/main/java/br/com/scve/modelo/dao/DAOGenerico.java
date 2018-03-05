package br.com.scve.modelo.dao;


import java.util.List;

public interface DAOGenerico<E> {
	public E salvar(E e);
	public E alterar(E e);
	public boolean excluir(Integer id);
	public E consultar(Integer id);
	public List<E> consultar();
	
	public boolean salvarList(List<E> e);
	public boolean alterarList(List<E> e);
	public boolean excluirLista(List<E> e);
	
	public List<E> consultarEnderecosId(Integer id);
	public List<E> consultarEnderecoId(Integer id,Integer tipo);
	public boolean excluirEnderecos(List<E> ids);
	
	public boolean excluirObj(E e);
	
	public List<E> consultarContatosporPessoa(Integer id);

}
