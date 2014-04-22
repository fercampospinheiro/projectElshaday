<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="../css/bootstrap.css" type="text/css" media="all" />
	<link rel="stylesheet" href="../css/bootstrap-responsive.css" type="text/css" media="all" />
	<link rel="stylesheet" href="../css/style.css" type="text/css" media="all" />
<title>Currículos</title>
</head>
<body>
	<div class="container">
	<a href="../TrabalheConosco" class="btn btn-link">voltar</a>
	<table class="table">
	
		<tr>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Bairro</th>
			<th>Cidade</th>
			<th>Telefone</th>
		</tr>
	<c:forEach var="p" items="${it}">
		
		<tr> 
			<td><a href="listId?id=${p.id}">${p.nome}</a></td>
			<td>${p.email}</td>
			<td>${p.endereco.bairro}</td>
			<td>${p.endereco.cidade}</td>
			<td>${p.telefone.residencial}</td>
		</tr>
	</c:forEach>
	
	</table>
	</div>
	<script src="<c:url value="/js/bootstrap.js"/>" type="text/javascript"/>
</body>
</html>