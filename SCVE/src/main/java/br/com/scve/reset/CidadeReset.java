package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.scve.entidades.Cidade;
import br.com.scve.modelo.servico.ServicoCidade;




@Path("/cidades")
@RequestScoped
public class CidadeReset {
	
	@Inject
	private ServicoCidade servico;
	private List<Cidade> lista;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Cidade> buscaTodasCidades(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}

}
