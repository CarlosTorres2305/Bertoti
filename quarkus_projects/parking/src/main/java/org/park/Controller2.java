package org.park;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

@Path("/produto")
public class Controller2 {

	
	Model2 model = new Model2();
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{marca}/{fornecedor}")
    public Response produto(@PathParam String marca, @PathParam String fornecedor) {	
		List<Produto> produtosEncontrados = model.buscarInformacoes(new Informacoes(marca, fornecedor));	
		String json = new Gson().toJson(produtosEncontrados);
    	return Response.status(200).entity(json).build();	
    }
	
	
	
	
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasymmmmmmm";
    }
}