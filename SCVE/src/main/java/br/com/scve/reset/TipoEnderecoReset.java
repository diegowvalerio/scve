package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import br.com.scve.entidades.TipoEndereco;

import br.com.scve.modelo.servico.ServicoTipoEndereco;




@Path("/tipoenderecos")
@RequestScoped
public class TipoEnderecoReset {
	
	@Inject
	private ServicoTipoEndereco servico;
	private List<TipoEndereco> lista;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<TipoEndereco> buscaTodasCidades(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}


}
