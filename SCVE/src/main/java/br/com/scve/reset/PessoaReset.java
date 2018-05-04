package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import br.com.scve.entidades.Pessoa;
import br.com.scve.modelo.servico.ServicoPessoa;




@Path("/pessoas")
@RequestScoped
public class PessoaReset {
	
	@Inject
	private ServicoPessoa servico;
	private List<Pessoa> lista;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Pessoa> buscaTodasCidades(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}
	
	/*@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{id}")
	public List<Pessoa> buscaTodasCidadesp(@PathParam("id") Integer id){
		lista = servico.buscacidadePorclienteDovendedor(id);
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}
*/
}
