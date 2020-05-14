package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.scve.entidades.Estado;
import br.com.scve.modelo.servico.ServicoEstado;



@Path("/estados")
@RequestScoped
public class EstadoReset {
	
	@Inject
	private ServicoEstado servico;
	private List<Estado> lista;
	/*
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Estado> buscaTodosEstados(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}*/
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String buscaTodosEstados(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		String e = new Gson().toJson(lista);
		return e;
	}

}
