package br.com.elshaday.controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sun.jersey.api.view.Viewable;

@Path("/")
public class Controller {

	@GET
	@Path("Home")
	@Produces("text/html")
	public Viewable viewIndex(){
		
		return new Viewable("/index/index");
	}

	@GET
	@Path("Servicos")
	@Produces("text/html")
	public Viewable viewServicos(){
		
		return new Viewable("/servicos/servicos");
	}
	
	@GET
	@Path("TrabalheConosco")
	@Produces("text/html")
	public Viewable viewTrabalheConosco(){
		
		return new Viewable("/trabalheConosco/trabalheConosco");
	}
	
	@GET
	@Path("SobreNos")
	@Produces("text/html")
	public Viewable viewSobreNos(){
		
		return new Viewable("/sobrenos/sobreNos");
	}

	@GET
	@Path("Contato")
	@Produces("text/html")
	public Viewable viewContatos(){
		
		return new Viewable("/contato/contato");
	}
	
	
}
