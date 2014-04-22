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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import br.com.elshaday.dao.PersonDataDAO;
import br.com.elshaday.model.trabalheconosco.DadosPessoais;
import br.com.elshaday.model.trabalheconosco.Endereco;
import br.com.elshaday.model.trabalheconosco.Experiencia;
import br.com.elshaday.model.trabalheconosco.Telefone;

import com.sun.jersey.api.view.Viewable;

@Path("/Curriculo")
public class TrabalheConoscoController {

	private PersonDataDAO dao = new PersonDataDAO(); 
	
	
	@POST
	@Path("/salvar")
	public Response salvar( 
			@FormParam("email") String email,@FormParam("nome") String nome,
			@FormParam("nacionalidade")String nacionalidade,@FormParam("dataNascimento")String dataNascimento,
			@FormParam("estadoCivil")String estadoCivil,@FormParam("sexo")String sexo,
			@FormParam("pais")String pais,@FormParam("estado")String estado,
			@FormParam("cidade")String cidade,@FormParam("bairro")String bairro,
			@FormParam("logradouro")String logradouro,
			@FormParam("cep")String cep,@FormParam("residencial")String residencial,
			@FormParam("celular")String celular,@FormParam("falarCom")String falarCom,
			@FormParam("empresa")String empresa,@FormParam("funcao")String funcao,
			@FormParam("admissao")String admissao,@FormParam("demissao")String demissao,
			@FormParam("descricao")String descricao,
			@FormParam("empresa1")String empresa1,@FormParam("funcao1")String funcao1,
			@FormParam("admissao1")String admissao1,@FormParam("demissao1")String demissao1,
			@FormParam("descricao1")String descricao1,
			@FormParam("empresa2")String empresa2,@FormParam("funcao2")String funcao2,
			@FormParam("admissao2")String admissao2,@FormParam("demissao2")String demissao2,
			@FormParam("descricao2")String descricao2
			
			){
		
		System.out.println();
		
		DadosPessoais dp = new DadosPessoais();
		Endereco end = new Endereco();
		Telefone t = new Telefone();
		List<Experiencia> listaExp= new ArrayList<Experiencia>();	
		SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		
			//DADOS COMUNS
			dp.setEmail(email);
			dp.setNome(nome);
			dp.setNacionalidade(nacionalidade);
			
			System.out.println(dataNascimento);
			try {
					cal.setTime(sp.parse(dataNascimento));
					dp.setDataNascimento(cal);
				
				} catch (ParseException e) {
					System.out.println("data não foi convertida do formato texto");
					e.printStackTrace();
				}catch (Exception e) {
					e.toString();
					e.printStackTrace();
				}

			dp.setEstadoCivil(estadoCivil);
			dp.setSexo(sexo.charAt(0));
				
			//DADOS DO ENDEREÇO
				end.setPais(pais);
				end.setEstado(estado);
				end.setCidade(cidade);
				end.setBairro(bairro);
				end.setLogradouro(logradouro);
				end.setCep(cep);
			
			dp.setEndereco(end);
			
			//DADOS DO TELEFONE
				t.setResidencial(residencial);
				t.setCelular(celular);
				t.setFalarCom(falarCom);
				
			dp.setTelefone(t);
			
			//DADOS DA 1º EXPERIENCIA
			Experiencia exp = new Experiencia();
			exp.setEmpresa(empresa);
			exp.setFuncao(funcao);
			
			try {
				cal.setTime(sp.parse(admissao));
				exp.setAdmissao(cal);
				cal.setTime(sp.parse(demissao));
				exp.setDemissao(cal);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			exp.setDescricao(descricao);
			
			//DADOS DA 2º EXPERIENCIA
			/*Experiencia exp1 = new Experiencia();
			exp1.setEmpresa(empresa1);
			exp1.setFuncao(funcao1);
			
			try {
				cal.setTime(sp.parse(admissao1));
				exp1.setAdmissao(cal);
				cal.setTime(sp.parse(demissao1));
				exp1.setDemissao(cal);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			exp1.setDescricao(descricao1);
			
			//DADOS DA 3º EXPERIENCIA
			Experiencia exp2 = new Experiencia();
			exp2.setEmpresa(empresa2);
			exp2.setFuncao(funcao2);
			
			try {
				cal.setTime(sp.parse(admissao2));
				exp2.setAdmissao(cal);
				cal.setTime(sp.parse(demissao2));
				exp2.setDemissao(cal);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			exp.setDescricao(descricao2);*/
			
			
			listaExp.add(exp);
			//listaExp.add(exp1);
			//listaExp.add(exp2);
			dp.setExperiencia(listaExp);
			
			
			System.out.println(dp.toString());
			
			try {
				dao.open();
				dao.salvar(end);
				dao.salvar(t);
				dao.flush();
				dao.salvar(dp);
				dao.commit();
			} catch (Exception e) {
				dao.rollBack();
				e.printStackTrace();
				System.out.println("transação desfeita");
			}finally{
				dao.close();
			}
				
			
			return Response.ok(new Viewable("/trabalheConosco/confirmacao")).build();
	}
	
	@GET
	@Path("list")
	public Response list(){
		
		List<DadosPessoais> list = dao.list("DadosPessoais.list");
		return Response.ok(new Viewable("/trabalheConosco/lista",list)).build();
	}
	
	@GET
	@Path("listId")
	public Response listId(@QueryParam("id") Long id){

		DadosPessoais pd=null;
		pd =  dao.get(id);
		return Response.ok(new Viewable("/trabalheConosco/curriculoIndividual",pd)).build();
	}
	
	
}
