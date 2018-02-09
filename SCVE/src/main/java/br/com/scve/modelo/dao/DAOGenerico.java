package br.com.scve.modelo.dao;

import java.util.ArrayList;
import java.util.List;

public interface DAOGenerico<E> {
	public E salvar(E e);
	public E alterar(E e);
	public boolean excluir(Integer id);
	public E consultar(Integer id);
	public List<E> consultar();
	
	public List<E> consultarEnderecosId(Integer id);
	public boolean excluirEnderecos(List<E> ids);

}
