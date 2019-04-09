package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.scve.entidades.Usuario;
import br.com.scve.modelo.servico.ServicoUsuario;


@Path("/usuarios")
@RequestScoped
public class UsuarioReset {
	
	@Inject
	private ServicoUsuario servico;
	private List<Usuario> lista;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Usuario> buscaTodosUsuarios(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}

}
