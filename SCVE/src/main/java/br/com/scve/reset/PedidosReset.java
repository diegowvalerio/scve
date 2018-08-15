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

import br.com.scve.entidades.ItemMov;
import br.com.scve.entidades.Movimento;
import br.com.scve.modelo.servico.ServicoMovimento;





@Path("/pedidos")
@RequestScoped
public class PedidosReset {
	
	@Inject
	private ServicoMovimento servico;

	private List<Movimento> lista;
	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@Path("/gravar")
	public String gravaPedido(String wspedidos){
		List<String> ids = new ArrayList<>();
		try {
			System.out.println(wspedidos);
		Collection<Movimento> movimentos = new ArrayList();
		Gson gson = new Gson();
		movimentos = gson.fromJson(wspedidos, new TypeToken<Collection<Movimento>>(){}.getType());
		
		for(Movimento p : movimentos){
			Movimento c = new Movimento();
			c.setCliente(p.getCliente());
			c.setCondpgto(p.getCondpgto());
			c.setFormapag(p.getFormapag());
			c.setObservacao(p.getObservacao());
			//c.setItems(p.getItems());
			c.setPerc_comissao(p.getVendresp().getPerc_comissao());
			c.setTipomv(p.getTipomv());
			c.setTotalvenda(p.getTotalvenda());
			c.setVendresp(p.getVendresp());
			c.setDtvenda(p.getDtvenda());
			
			/*trata items*/
			List<ItemMov> pitems = p.getItems();
			List<ItemMov> citems = new  ArrayList<>();
			for (ItemMov item : pitems){
				ItemMov i = new ItemMov();
				i.setDesconto(item.getDesconto());
				i.setItemobservacao(item.getItemobservacao());
				i.setMovimento(c);
				i.setProduto(item.getProduto());
				i.setQtde(item.getQtde());
				i.setSubtotal(item.getSubtotal());
				i.setValor(item.getValor());
				citems.add(i);
			}
			c.setItems(citems);
			
			servico.salvar(c);
			System.out.println("Id:"+c.getIdmov());
			//return c.getIdpessoa().toString();
			ids.add(c.getIdmov().toString());
		}
		lista = new ArrayList<>();
		for (int i = 0; i < ids.size(); i++){
			Movimento pe = new Movimento();
			pe = servico.consultarId(Integer.parseInt(ids.get(i).toString())); 
			System.out.println("Id-retorno:"+pe.getIdmov());
			lista.add(pe);
			 
		 }
		Gson gson2 = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("dd/MM/yyyy").create();
		String retorno = gson2.toJson(lista);
		return retorno;
		} catch (Exception e) {
			e.printStackTrace();
			return "erro";
		}
		//return null;
	}

}
