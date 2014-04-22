<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=0" />
	<title>Curriculo : ${it.nome}</title>
	<link rel="stylesheet" href="../css/bootstrap.css" type="text/css" media="all" />
	<link rel="stylesheet" href="../css/bootstrap-responsive.css" type="text/css" media="all" />
	<link rel="stylesheet" href="../css/style.css" type="text/css" media="all" />
</head>

<body>
	
	<div class="container">
		<div class="offset2 span8 tabCurriculoInd">
			<div class="row">
				
				<div class="row">
				<div class="span1"><a href="../Curriculo/list" class="btn btn-link">voltar</a></div>
				</div>
				
				<div class="row">
				  <div class="span8" aling="center"><h5><i class="icon-briefcase"></i>&nbsp;Dados Pessoais</h5></div>
				</div>
				<div class="row " id="dadospessoaisIND">
					<div class="span8">
							<div class="span2 well well-small" >
								
								<b><div class=span1">Nome</div><br>
								<div class=span2">e-mail</div><br>
								<div class=span2">Bairro</div><br>
								<div class=span2">Cidade</div><br>
								<div class=span2">Telefone</div></b><br>
								
							</div>
							<div class="span5 well well-small">
								
								<div class=span3">${it.nome}</div><br>
								<div class=span3"><a href="mailto:${it.email}">${it.email }</a></div><br>
								<div class=span3">${it.endereco.bairro }</div><br>
								<div class=span3">${it.endereco.cidade }</div><br>
								<div class=span3">${it.telefone.residencial }</div><br>
								
							</div>
					</div>	
				</div>	  
		
		</div>
		
	</div>	
	
	<script src="<c:url value="/js/bootstrap.js"/>" type="text/javascript"/>
</body>
</html>