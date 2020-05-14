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

import br.com.scve.entidades.FormaPag;
import br.com.scve.modelo.servico.ServicoFormaPag;




@Path("/formapag")
@RequestScoped
public class FormaPagReset {
	
	@Inject
	private ServicoFormaPag servico;
	private List<FormaPag> lista;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String buscaTodasAtivos(){
		lista = servico.consultarAtivos();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create(); 
	    String formapag = gson.toJson(lista);
		return formapag;
	}


}
