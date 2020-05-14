package br.com.scve.reset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
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

import br.com.scve.entidades.Cliente;
import br.com.scve.entidades.Contato;
import br.com.scve.entidades.Endereco;
import br.com.scve.entidades.Pessoa;
import br.com.scve.entidades.Vendedor;
import br.com.scve.modelo.servico.ServicoCliente;
import br.com.scve.modelo.servico.ServicoPessoa;
import br.com.scve.modelo.servico.ServicoVendedor;




@Path("/pessoas")
@RequestScoped
public class PessoaReset {
	
	@Inject
	private ServicoPessoa servico;
	@Inject
	private ServicoCliente servicocliente;
	@Inject
	private ServicoVendedor servicovendedor;
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
		List<String> ids = new ArrayList<>();
		try {
		//System.out.println(wspessoa);
		Collection<Pessoa> pessoas = new ArrayList();
		Gson gson = new Gson();
		pessoas = gson.fromJson(wspessoa, new TypeToken<Collection<Pessoa>>(){}.getType());
		
		for(Pessoa p : pessoas){
			Cliente c = new Cliente();
			c.setNome(p.getNome());
			c.setSituacao(true);
			c.setDtcadastro(p.getDtcadastro());
			c.setTipojf(p.getTipojf());
			/*trata contatos*/
			List<Contato> pcontatos = p.getContatos();
			List<Contato> clicontatos = new  ArrayList<>();
			for (Contato contato : pcontatos){
				contato.setIdcontato(null);
				contato.setPessoa(c);
				clicontatos.add(contato);
			}
			c.setContatos(clicontatos);
			/*trata enderecos*/
			List<Endereco> penderecos = p.getEnderecos();
			List<Endereco> clienderecos= new ArrayList<>();
			for(Endereco endereco : penderecos){
				endereco.setPessoa(c);
				clienderecos.add(endereco);
			}
			c.setEnderecos(p.getEnderecos());
			/*trata o vendedor do cliente*/
			c.setVendresp((Vendedor) p.getVendresp());
			
			servicocliente.salvarWs(c);
			System.out.println("Id:"+c.getIdpessoa());
			//return c.getIdpessoa().toString();
			ids.add(c.getIdpessoa().toString());
		}
		lista = new ArrayList<>();
		for (int i = 0; i < ids.size(); i++){
			Pessoa pe = new Pessoa();
			pe = servico.consultarId(Integer.parseInt(ids.get(i).toString())); 
			lista.add(pe);
			 
		 }
		Gson gson2 = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("dd/MM/yyyy").create();
		String retorno = gson2.toJson(lista);
		return retorno;
		} catch (Exception e) {
			return "erro";
		}
		//return null;
	}

}
