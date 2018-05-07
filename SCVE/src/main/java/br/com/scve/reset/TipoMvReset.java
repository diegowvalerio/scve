package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.scve.entidades.TipoMv;
import br.com.scve.entidades.TipoMvVend;
import br.com.scve.modelo.servico.ServicoTipoMv;




@Path("/tipomv")
@RequestScoped
public class TipoMvReset {
	
	@Inject
	private ServicoTipoMv servico;
	private List<TipoMv> lista;
	private List<TipoMvVend> lista2;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<TipoMv> buscaTipoMv(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{id}")
	public List<TipoMvVend> buscaTipoMvVendedor(@PathParam("id") Integer id){
		lista2 = servico.wstipomv(id);
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista2;
	}

}
