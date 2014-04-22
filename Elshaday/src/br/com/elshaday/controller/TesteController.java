package br.com.elshaday.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.elshaday.dao.UserDAO;
import br.com.elshaday.model.trabalheconosco.DadosPessoais;
import br.com.elshaday.model.trabalheconosco.Experiencia;
import br.com.elshaday.model.user.User;

import com.sun.jersey.api.view.Viewable;
import com.sun.security.ntlm.Client;

@Path("/teste")
public class TesteController {

	private UserDAO dao =  new UserDAO();
	
	//TESTE DA VIEW EXPERIÊNCIA 
	@GET
	@Path("experiencia")
	@Produces("text/html")
	public Viewable experienciaContatos(){
		
		return new Viewable("/trabalheConosco/experiencia");
	}
	
	//TESTE DA INSERÇÃO EXPERIÊNCIA 
	@POST
	@Path("/setExperiencia")
	public Response salvar(
			@FormParam("empresa")String empresa,@FormParam("funcao")String funcao,
			@FormParam("admissao")String admissao,@FormParam("demissao")String demissao,
			@FormParam("descricao")String descricao
			
			){
			
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
			List<Experiencia> listExp= new ArrayList<Experiencia>();
			Experiencia exp = new Experiencia();
			
			exp.setEmpresa(empresa);
			exp.setFuncao(funcao);
			DadosPessoais dp= new DadosPessoais();
			
			try {
				cal.setTime(sp.parse(admissao));
				exp.setAdmissao(cal);
				cal.setTime(sp.parse(demissao));
				exp.setDemissao(cal);
				
			} catch (ParseException e) {
				System.out.println("data não foi convertida do formato texto");
				e.printStackTrace();
			}catch (Exception e) {
				e.toString();
				e.printStackTrace();
			}	
			
			exp.setDescricao(descricao);
			
			listExp.add(exp);
			/*
			dp.setId(Long.parseLong(idDp));
			dp.setExperiencia(listExp);
			dao.open();
			dao.salvar(exp);
			dao.flush();
			dao.atualizar(dp);
			dao.commit();*/
			
			System.out.println(exp.toString());
		
			return Response.status(200).build();
			}
	
	//TESTE DE INSERÇÃO DE USUÁRIO
	@GET
	@Path("usuário")
	@Produces("application/xml")
	public User viewUser(){
		
		User u1 = new User();
		u1.setLogin("loginteste");
		u1.setName("nomeExemplo");
		u1.setPassword("000000");
		
		if(dao!=null){
		dao.open();
		dao.salvar(u1);
		User u = dao.get(u1.getId());
		dao.close();
		return u;
		}else{
			System.out.println("Sem instancia do dao");
			return u1;
		}
	}	
}
