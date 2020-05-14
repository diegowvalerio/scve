package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.SituacaoTributariaIPI;
import br.com.scve.modelo.dao.DAOSituacaoTributariaIPI;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoSituacaoTributariaIPI implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOSituacaoTributariaIPI dao;
	
	@Transacao
	public void salvar(SituacaoTributariaIPI situacaotributariaipi){
		try {
			if(situacaotributariaipi.getIdsituacaotributariaipi() == null){
				dao.salvar(situacaotributariaipi);
			}else{
				dao.alterar(situacaotributariaipi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<SituacaoTributariaIPI> consultar(){
		return dao.consultar();
	}
	
	
}
