package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.TipoEndereco;
import br.com.scve.modelo.dao.DAOTipoEndereco;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoTipoEndereco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOTipoEndereco dao;
	
	@Transacao
	public void salvar(TipoEndereco tipoendereco){
		try {
			if(tipoendereco.getIdtipoend() == null){
				dao.salvar(tipoendereco);
			}else{
				dao.alterar(tipoendereco);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<TipoEndereco> consultar(){
		return dao.consultar();
	}
	

}
