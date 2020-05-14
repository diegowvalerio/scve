package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.SituacaoTributaria;
import br.com.scve.modelo.dao.DAOSituacaoTributaria;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoSituacaoTributaria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOSituacaoTributaria dao;
	
	@Transacao
	public void salvar(SituacaoTributaria situacaotributaria){
		try {
			if(situacaotributaria.getIdsituacaotributaria() == null){
				dao.salvar(situacaotributaria);
			}else{
				dao.alterar(situacaotributaria);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<SituacaoTributaria> consultar(){
		return dao.consultar();
	}
	
	
}
