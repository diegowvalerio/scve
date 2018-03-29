package br.com.scve.reset;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.scve.entidades.Vendedor;
import br.com.scve.modelo.servico.ServicoVendedor;


@Path("/vendedor")
@RequestScoped
public class VendedorReset {
	
	@Inject
	private ServicoVendedor servico;
	//private List<Vendedor> lista;
	
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("/{id}")
	public Vendedor loginVendedor(@PathParam("id") Integer id){
		Vendedor vendedor = servico.loginVendedor(id);
		return vendedor;
	}

}
