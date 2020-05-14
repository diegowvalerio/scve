package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.scve.entidades.CondPgto;
import br.com.scve.modelo.servico.ServicoCondicaoPagto;




@Path("/condpagto")
@RequestScoped
public class CondPagtoReset {
	
	@Inject
	private ServicoCondicaoPagto servico;
	private List<CondPgto> lista;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String buscaTodasAtivos(){
		lista = servico.consultarAtivos();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create(); 
	    String cond = gson.toJson(lista);
		return cond;
	}


}
