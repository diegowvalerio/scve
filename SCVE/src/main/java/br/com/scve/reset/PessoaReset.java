package br.com.scve.reset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.omnifaces.util.Json;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.scve.entidades.Pessoa;
import br.com.scve.modelo.servico.ServicoCliente;
import br.com.scve.modelo.servico.ServicoPessoa;
import net.sf.jasperreports.web.util.JacksonUtil;




@Path("/pessoas")
@RequestScoped
public class PessoaReset {
	
	@Inject
	private ServicoPessoa servico;
	private ServicoCliente servicocliente;
	private List<Pessoa> lista;
	/*
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Pessoa> buscaTodasCidades(){
		lista = servico.consultar();
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		return lista;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{id}")
	public List<Pessoa> buscaPessoasPorVendedor(@PathParam("id") Integer id){
		lista = servico.wspessoas(id);
		//List<Usuario> users = new ArrayList<>();
		//users.addAll(lista);
		//String listap = new Gson().toJson(lista);
		
		return lista;
	}*/
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String buscaTodasCidades(){
		lista = servico.consultar();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create(); 
	    String pessoa = gson.toJson(lista);
		return pessoa;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{id}")
	public String buscaPessoasPorVendedor(@PathParam("id") Integer id){
		lista = servico.wspessoas(id);
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("dd/MM/yyyy").create(); 
	    String pessoa = gson.toJson(lista);
		
		return pessoa;
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@Path("/gravar")
	public String gravaPessoa(String wspessoa){
		System.out.println(wspessoa);
		/*Collection<Pessoa> pessoas = new ArrayList();
		Gson gson = new Gson();
		pessoas = gson.fromJson(wspessoa, new TypeToken<Collection<Pessoa>>(){}.getType());
		
		for(Pessoa p : pessoas){
			System.out.println(p.getNome().toString());
		}*/
		
		return "1";
	}

}
