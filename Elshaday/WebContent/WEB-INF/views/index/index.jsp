<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=0" />
	<title>Elshaday Home Care | Você em primeiro lugar</title>
	<link rel="shortcut icon" type="image/x-icon" href="<c:url value='/images/favicon.png'/>"/>
	<link rel="stylesheet" href="<c:url value='/css/style.css'/>" type="text/css" media="all" />
	<link rel="stylesheet" href="<c:url value="/css/flexslider.css"/>" type="text/css" media="all" />
	<link href='http://fonts.googleapis.com/css?family=Ubuntu:400,500,700' rel='stylesheet' type='text/css' />
	
	<script src="<c:url value="/js/jquery-1.8.0.min.js"/>" type="text/javascript"></script>
	<!--[if lt IE 9]>
		<script src="<c:url value="/js/modernizr.custom.js"/>"</script>
	<![endif]-->
	<script src="<c:url value="/js/jquery.flexslider-min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/js/functions.js"/>" type="text/javascript"></script>


<title>Elshaday|Home Care</title>
</head>
<body>
	
		<div id="wrapper">
			<div class="shell">
				<div class="container">
			
					<!-- CABEÇALHO -->
						<c:import url="cabecalho.jsp"></c:import>
					<!-- FIM CABEÇALHO -->
					
					<!-- MENU -->
						<c:import url="menu.jsp"></c:import>
					<!-- FIM MENU -->
					
					<!-- BANNER -->
						<c:import url="banner.jsp"></c:import>
					<!-- FIM BANNER -->
					<div class="main">
						
						<a href="#" class="m-btn-grey grey-btn">Saiba mais..</a>
						
						<!-- COLUNAS -->
						<c:import url="secaoColunas.jsp"></c:import>
						
						<!-- PUBLICAÇÕES -->
						<c:import url="secaoPublicacao.jsp"></c:import>
						
						<!-- TESTEMUNHO-->
						<c:import url="secaoTestemunho.jsp"></c:import>
					
					</div>
					
					
					<!-- REDE SOCIAIS -->
					<c:import url="redesocial.jsp"></c:import>
					<!-- FIM -->
					
					<!-- RODAPÉ -->
					<div id="footer">
						<c:import url="sobreRodape.jsp"></c:import>
						<c:import url="rodape.jsp"></c:import>
					</div>
				</div>
			</div>
		</div>
		
</body>
</html>