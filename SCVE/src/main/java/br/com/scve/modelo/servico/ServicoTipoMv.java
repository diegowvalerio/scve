package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.TipoMv;
import br.com.scve.entidades.TipoMvVend;
import br.com.scve.modelo.dao.DAOTipoMv;
import br.com.scve.modelo.dao.DAOTipoMvVend;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoTipoMv implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOTipoMv dao;
	@Inject
	private DAOTipoMvVend daoV;
	
	
	@Transacao
	public void salvar(TipoMv tipoendereco){
		try {
			if(tipoendereco.getIdmv() == null){
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
	
	public List<TipoMv> consultar(){
		return dao.consultar();
	}
	
	public List<TipoMv> consultarAtivos(){
		return dao.consultarAtivos();
	}
	
	public List<TipoMvVend> buscalistapreco(Integer idtipomv, Integer idvendedor){
		
		return daoV.buscalistapreco(idtipomv, idvendedor);
		
	}
	
	/*ws*/
	public List<TipoMvVend> wstipomv(Integer id){
		return daoV.wstipomv(id);
	}
	

}
