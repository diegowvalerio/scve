package br.com.scve.reset;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
	private ServicoPessoa servicoP;
	private List<Pessoa> listaC;
	private List<Pfisica> listaF;
	private List<Pjuridica> listaJ;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/fisica/{id}")
	public String buscadadosF(@PathParam("id") Integer id){
		listaC = servicoP.wspessoas(id);
		for(Pessoa p : listaC){
			if(p.getTipojf().equals("F")){
			Pfisica f = new Pfisica();
			f= servico.consultarPfisica(p.getIdpessoa());
			listaF.add(f);
			}
		}
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("dd-MM-yyyy").create();
	    String fisica = gson.toJson(listaF);
		return fisica;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/juridica")
	public String buscadadosJ(){
		listaJ = servico.consultarJ();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("dd-MM-yyyy").create();
	    String juridica = gson.toJson(listaJ);
		return juridica;
	}

}
