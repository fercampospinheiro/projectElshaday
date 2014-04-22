<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
					
			function adiciona(){
				var html="<table>"+
					"<tr>"+
				"<td align='center'><label>Penultima Empresa</br></label></td>"+
			"</tr>"+
			"<td><label><b>Empresa :</b></label></td>"
			+"<td><input type='text' name ='empresa' required /><br></td>"
		+"</tr>"
		+"<tr class='funcao'>"
			+"<td><label><b>Função :</b></label></td>"
			+"<td><input type='text' name ='funcao1' required /><br></td>"
		+"</tr>"
		
		
		+"<tr class='admissao'>"
			+"<td><label><b>Admissão :</b></label></td>"
			+"<td><input type='date' name ='admissao1' required /><br></td>"
		+"</tr>"
		
		+"<tr class='demissao'>"
			+"<td><label><b>Demissão :</b></label></td>"
			+"<td><input type='date' name ='demissao1' required /><br></td>"
		+"</tr>"			
		
		+"<tr class='descricaoDemissao'>"
			+"<td><label><b>Motivo da saída :</b></label></td>"
			+"<td><input type='text' name ='descricao1' required /><br></td>"
		+"</tr>"+"</table>" ;
			document.getElementById('empresa').innerHTML=html;	
					
			}
			
			
</script>

</head>
<body>

<form action="teste1" method="post">

nome :<input type="text" name="nome"/>
<input type="submit" value="enviar">

</form>


<br>
<form action="">
<input type="button" value="adicionar empresa" onclick="adiciona()"/>
</form>		
		<br>
		Conteudo deve aparecer abaixo
		<br>
		<br><div id="empresa"></div>

</body>
</html>