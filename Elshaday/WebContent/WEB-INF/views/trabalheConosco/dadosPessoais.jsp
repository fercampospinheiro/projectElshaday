<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="pt-BR">
<head>

	<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>" type="text/css" media="all" />
	<link rel="stylesheet" href="<c:url value="/css/bootstrap-responsive.css"/>" type="text/css" media="all" />
	<link rel="stylesheet" href="<c:url value="/css/style.css"/>" type="text/css" media="all" />
	

</head>
<body>

	<div class="container">	

		
		<form class="form-horizontal" action="Curriculo/salvar" method="post">
				
				<!-- DADOS PESSOAIS -->
				
				<label class="label offset1"><strong><h6>Dados Pessoais</h6></strong></label> 
		 
		  		<div class="well">
		  
				  <div class="control-group">
				    <div class="controls">
				    <label class="control-label" >Email</label>
				    <div class="controls">
				      <input type="email"  name="email"placeholder="Email">
				    </div>
				    </div>
				  </div>
		  			
				  <div class="control-group">
				  	<div class="controls">
				    <label class="control-label" >Nome Completo</label>
				    <div class="controls">
				      <input type="Text" name="nome" placeholder="Nome">
				    </div>
				    </div>
				  </div>
				  
				  <div class="control-group">
				  	<div class="controls">
				    <label class="control-label">Data de Nascimento</label>
				    <div class="controls">
				      <input type="date" name="dataNascimento" placeholder="Selecione uma data">
				    </div>
				    </div>
				  </div>
		  
				  <div class="control-group">
				  	<div class="controls">
				    <label class="control-label" >Sexo</label>
				    <div class="controls">
				     <input type="radio" name ="sexo" value="m" checked="on">Masculino
					<input type="radio" name ="sexo" value="f">Feminino
				    </div>
				    </div>
				  </div>
		  
				  <div class="control-group">
				  	<div class="controls">
				    <label class="control-label" >Estado Cívil</label>
				    <div class="controls">
				      <select name="estadoCivil">
								<option value="">Selecione uma opção</option>
								<option value="solteiro">Solteiro(a)</option>
								<option value="casado">Casado(a)</option>
								<option value="separado">Separado(a)</option>
								<option value="divorciado">Divorciado(a)</option>
								<option value="viuvo">Viuvo(a)</option>
						</select>
				    </div>
				    </div>
				  </div>
		  
				  <div class="control-group">
				    <div class="controls">
						<label class="control-label">Nacionalidade</label>
					    <div class="controls">
					      <input type="Text" name="nacionalidade" placeholder="informe sua origem"/>
					    </div>
				    </div>
				  </div>
				</div>
		  
		  		<!-- DADOS DE ENDEREÇO -->
		  		
		 		<label class="label offset1"><strong><h6>Endereço</h6></strong></label> 
		 
		 		<div class="well">
				  <div class="control-group">
				  	<div class="controls">
				    <label class="control-label">País</label>
				    <div class="controls">
				      <select name="pais">
							<option value="">Selecione um país</option>
							<option value="Brasil">Brasil</option>
							<option value="Argentina">Argentina</option>
						</select>
				    </div>
				    </div>
				  </div>
		  
				  <div class="control-group">
				  	<div class="controls">
				    <label class="control-label">Estado</label>
				    <div class="controls">
				     <select name="estado">
						<option value="">Selecione um estado</option>
						<option value="São Paulo">Brasil</option>
						<option value="Rio de Janeiro">Argentina</option>
					</select> 
				    </div>
				    </div>
				  </div>
		  
				  <div class="control-group">
				  	<div class="controls">
				    <label class="control-label" for="inputName">Cidade</label>
				    <div class="controls">
				     <select name="cidade">
							<option value="">Selecione uma cidade</option>
							<option value="São Paulo">Brasil</option>
							<option value="Rio de Janeiro">Argentina</option>
					</select> 
				    </div>
				   	</div>
				  </div>
		  
				  <div class="control-group">
				    <div class="controls">
						<label class="control-label">Logradouro</label>
					    <div class="controls">
					      <input type="Text" name="logradouro" placeholder="Rua, Avenida..">
					    </div>
				    </div>
				  </div>
		  
				  <div class="control-group">
				    <div class="controls">
						<label class="control-label">Bairro</label>
					    <div class="controls">
					      <input type="Text" name="bairro" placeholder="Bairro,Vila">
					    </div>
				    </div>
				  </div>
		  
				  <div class="control-group">
				    <div class="controls">
						<label class="control-label">CEP</label>
					    <div class="controls">
					      <input type="Text" name="cep" placeholder="ex:00000-000">
					    </div>
				    </div>
		  		</div>
		 	 </div>
		  
		 	 
		 	 <!-- DADOS DE CONTATO -->
		 	 
		 	 <label class="label offset1"><strong><h6>Dados para contato</h6></strong></label> 
		 
		  	<div class="well">
			  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label">Residencial</label>
				    <div class="controls">
				      <input type="tel" name="residencial" placeholder="(00)0000-0000">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label">Celular</label>
				    <div class="controls">
				      <input type="tel" name="celular" placeholder="(00)0000-0000">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label"> Falar com</label>
				    <div class="controls">
				      <input type="Text" name="falarCom" placeholder="informe alguém">
				    </div>
			    </div>
			  </div>
			</div>
		  
		  <!-- DADOS DE EXPERIÊNCIA -->
		  
		  <label class="label offset1"><strong><h6>Experiências</h6></strong></label> 
		 
		  <div class="well">
			  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" ><b>Ultima empresa</b></label>
				    <div class="controls">
				      <input type="Text"  name="empresa" placeholder="nome da empresa">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" >Função</label>
				    <div class="controls">
				      <input type="Text"  name="funcao" placeholder="informe a função">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" >Admitido em :</label>
				    <div class="controls">
				      <input type="date" name="admissao" placeholder="">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" >Saí em :</label>
				    <div class="controls">
				      <input type="date"  name="demissao" placeholder="">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" >motivo da saída</label>
				    <div class="controls">
				      <input type="text"  name="descricao" placeholder="Pedi demissão, demitido...">
				    </div>
			    </div>
		 	 </div>
		 	
		 	 
		 	 <div id="addEmpresa1">
		 	  <input type="button" class="btn" onclick="addEmpresa()" value="+ empresa"/>
		 	 </div>
		 	 <div id="addEmpresa2">
		 	 
		 	 </div>

		 	 
			</div>
			<button type="submit" class="offset5 btn btn-info">Gravar informações</button>
		 
		</form>

</div>
<script src="<c:url value="/js/bootstrap.js"/>" type="text/javascript"/>
</body>
</html>
