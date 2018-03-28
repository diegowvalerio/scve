package br.com.scve.reset;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.scve.entidades.Usuario;
import br.com.scve.modelo.dao.hibernate.DAOUsuarioHibernate;


@Path("/usuarios")
public class UsuarioReset {
	
	@GET
	@Produces({MediaType.APPLICATION_XML})
	public List<Usuario> buscaTodosUsuarios(){
		List<Usuario> usuarios = new DAOUsuarioHibernate().consultar();
		return usuarios;
	}

}
