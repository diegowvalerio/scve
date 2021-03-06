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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.scve.entidades.Cliente;
import br.com.scve.entidades.Pessoa;
import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.modelo.servico.ServicoCliente;
import br.com.scve.modelo.servico.ServicoPessoa;




@Path("/tipojf")
@RequestScoped
public class FisicaJuridicaReset {
	
	@Inject
	private ServicoCliente servico;
	@Inject
	private ServicoPessoa servicoP;
	private List<Pessoa> listaC;
	private List<Pfisica> listaF = new ArrayList<>();
	private List<Pjuridica> listaJ = new ArrayList<>();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("fisica/{id}")
	public String buscaPessoasFisica(@PathParam("id") Integer id){
		listaC = servicoP.wspessoas(id);
		for(Pessoa p : listaC){
			if(p.getTipojf().equals("F")){
			Pfisica f = servico.consultaPfisicaWs(p.getIdpessoa());
			listaF.add(f);
			}
		}
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("dd/MM/yyyy").create(); 
	    String pessoa = gson.toJson(listaF);
		
		return pessoa;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("juridica/{id}")
	public String buscaPessoasJuridica(@PathParam("id") Integer id){
		listaC = servicoP.wspessoas(id);
		for(Pessoa p : listaC){
			if(p.getTipojf().equals("J")){
			Pjuridica j = servico.consultaPJuridicaWs(p.getIdpessoa());
			listaJ.add(j);
			}
		}
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("dd/MM/yyyy").create(); 
	    String pessoa = gson.toJson(listaJ);
		
		return pessoa;
	}
	
	
	//gravarpfisica
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@Path("/gravarpfisica")
	public String gravaPfisica(String wsfisica){
		try {
			//System.out.println(wsfisica);
			Collection<Pfisica> pfisicas = new ArrayList();
			Gson gson = new Gson();
			pfisicas = gson.fromJson(wsfisica, new TypeToken<Collection<Pfisica>>(){}.getType());
			for(Pfisica p : pfisicas){
				servico.salvaWsPfisica(p);
				return p.getPessoa().getIdpessoa().toString();
			}
		} catch (Exception e) {
			return "erro";
		}
		return null;
	}
	
	//gravarpfisica
		@POST
		@Produces({MediaType.APPLICATION_JSON})
		@Consumes({MediaType.APPLICATION_JSON})
		@Path("/gravarpjuridica")
		public String gravaPjuridica(String wsfisica){
			try {
				//System.out.println(wsfisica);
				Collection<Pjuridica> pfisicas = new ArrayList();
				Gson gson = new Gson();
				pfisicas = gson.fromJson(wsfisica, new TypeToken<Collection<Pjuridica>>(){}.getType());
				for(Pjuridica p : pfisicas){
					servico.salvaWsPjuridica(p);
					return p.getPessoa().getIdpessoa().toString();
				}
			} catch (Exception e) {
				return "erro";
			}
			return null;
		}

}
