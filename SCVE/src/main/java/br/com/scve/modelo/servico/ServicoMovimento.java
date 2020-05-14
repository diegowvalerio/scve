package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Movimento;
import br.com.scve.modelo.dao.DAOMovimento;
import br.com.scve.modelo.dao.hibernate.Transacao;
import br.com.scve.msn.FacesMessageUtil;

@Dependent
public class ServicoMovimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private DAOMovimento dao;

	@Transacao
	public void salvar(Movimento movi){
		if(movi.getCliente() != null && movi.getCondpgto() != null && movi.getFormapag() != null && movi.getTipomv() != null && movi.getVendresp() != null
				&& movi.getItems().size()>0){
		try {
			if(movi.getIdmov() == null){
				dao.salvar(movi);
			}else{
				dao.alterar(movi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else{
			FacesMessageUtil.addMensagemError("Preenchas todos os campos");
		}
	}

	@Transacao
	public boolean excluir(Integer id) {
		return dao.excluir(id);
	}

	public List<Movimento> consultar() {
		return dao.consultar();
	}

	public Movimento consultarId(Integer id) {

		return dao.consultar(id);
	}

	// Grafico
	public List<Movimento> movimentodia(Date data) {
		return dao.movimentodia(data);
	}

}
