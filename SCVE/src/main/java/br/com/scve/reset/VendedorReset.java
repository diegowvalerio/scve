package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.scve.entidades.Vendedor;
import br.com.scve.entidades.WsVendedor;
import br.com.scve.modelo.servico.ServicoVendedor;


@Path("/vendedor")
@RequestScoped
public class VendedorReset {
	
	@Inject
	private ServicoVendedor servico;
	private List<Vendedor> lista;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Vendedor> buscaTodosVendedores(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}
	
	/*@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{id}")
	public Vendedor loginVendedor(@PathParam("id") Integer id){
		Vendedor vendedor = servico.loginVendedor(id);
		return vendedor;
	}*/
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{id}")
	public WsVendedor wsvendedor(@PathParam("id") Integer id){
		WsVendedor vendedor = servico.wsvendedor(id);
		return vendedor;
	}
	


}
