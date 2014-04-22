<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>" type="text/css" media="all" />
	<link rel="stylesheet" href="<c:url value="/css/bootstrap-responsive.css"/>" type="text/css" media="all" />
	<link rel="stylesheet" href="<c:url value="/css/style.css"/>" type="text/css" media="all" />
<script src="<c:url value="/js/jquery.js"/>" type="text/javascript"></script> 
<script src="<c:url value="/js/post.js"/>" type="text/javascript"></script>

</head>
<body>
	  
	  
	  
	  <!-- DADOS DE EXPERIÊNCIA -->
		  <div class="container">
		  <label class="label offset1"><strong><h6>Experiências</h6></strong></label> 

		 <form  id="form1" method="post" action="setExperiencia">
		  <div class="well">
			  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" ><b>Ultima empresa</b></label>
				    <div class="controls">
				      <input type="Text"  name="empresa"  id="empresa" placeholder="nome da empresa">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" >Função</label>
				    <div class="controls">
				      <input type="Text"  name="funcao" id="funcao" placeholder="informe a função">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" >Admitido em :</label>
				    <div class="controls">
				      <input type="date" name="admissao" id="admissao" placeholder="">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" >Saí em :</label>
				    <div class="controls">
				      <input type="date"  name="demissao" id="demissao" placeholder="">
				    </div>
			    </div>
			  </div>
		  
			  <div class="control-group">
			    <div class="controls">
					<label class="control-label" >motivo da saída</label>
				    <div class="controls">
				      <input type="text"  name="descricao" id="descricao"placeholder="Pedi demissão, demitido...">
				    </div>
			    </div>
		 	 </div>
		 	
		 	 
			</div>
		<button id="" class="offset5 btn btn-info">Gravar informações</button>
		 
		</form>
		
		<div id="dados" class="well"></div>
		
		</div>
		
		<script src="<c:url value="/js/bootstrap.js"/>" type="text/javascript"/>
</body>
</html>