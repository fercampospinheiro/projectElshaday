/**
 *  
 */
	var num=1;
	function addEmpresa(){
		
		var empresa = 'Penultima empresa';
		if (num>1) {
			empresa='Antipenultima empresa';
		}
		var	html= '<div class="control-group">'
			+'<div class="controls">'
				+'<label class="control-label" ><b>'+empresa+'</b></label>'
			    +'<div class="controls">'
			     +'<input type="Text"  name="empresa'+num+'" placeholder="nome da empresa">' 
			    +'</div>'
		    +'</div>'
		  +'</div>'
		
		  +'<div class="control-group">'
		    +'<div class="controls">'
				+'<label class="control-label" >Função</label>'
			    +'<div class="controls">'
			      +'<input type="Text"  name="funcao'+num+'" placeholder="informe a função">'
			    +'</div>'
		    +'</div>'
		  +'</div>'
		  
		  +'<div class="control-group">'
		    +'<div class="controls">'
				+'<label class="control-label" >Admitido em :</label>'
			    +'<div class="controls">'
			      +'<input type="date" name="admissao'+num+'" placeholder="">'
			    +'</div>'
		    +'</div>'
		  +'</div>'
		
		  +'<div class="control-group">'
		    +'<div class="controls">'
				+'<label class="control-label" >Saí em :</label>'
			    +'<div class="controls">'
			      +'<input type="date"  name="demissao'+num+'" placeholder="">'
			    +'</div>'
		    +'</div>'
		  +'</div>'
		
		  +'<div class="control-group">'
		    +'<div class="controls">'
				+'<label class="control-label" >motivo da saída</label>'
			    +'<div class="controls">'
			      +'<input type="text"  name="descricao'+num+'" placeholder="Pedi demissão, demitido...">'
			    +'</div>'
		    +'</div>'
		 +'</div>'+'<div id="botoes"></div>';
		 
			
		 var botoes='<input type="button" class="btn"  onclick="clearAdd()" value="- empresa"/><br>'

		+'<input type="button" class="btn" onclick="addEmpresa()" value="+ empresa"/><br>';	
		
		 var botoes1='<input type="button" class="btn"  onclick="clearAdd()" value="- empresa"/><br>';
		
		var botoes2='input type="button" class="btn" onclick="addEmpresa()" value="+ empresa"/><br>';

		if (num<=2) {
			document.getElementById('addEmpresa'+num).innerHTML=html;
		
		}
		 switch (num) {
			case 1:document.getElementById('botoes').innerHTML=botoes;
			break;
			case 2:document.getElementById('botoes').innerHTML=botoes1;					


			}
		 
		 if (num<2) {
			 num++;
		}
		 
	
		
		
		}
	
	function clearAdd(){
		
		if (num<=2&num>=1) {
			document.getElementById('addEmpresa'+num).innerHTML='';
		}
		 switch (num) {
			case 1:document.getElementById('botoes2').innerHTML=botoes;
			break;
			case 2:document.getElementById('botoes1').innerHTML=botoes1;					


			}
		 
		 if (num>0) {
			 num--;
		}
		
		
}
	
	
	$(function($) {
	    // Quando o formulário for enviado, essa função é chamada
	    $("#formulario").submit(function() {
	    // Colocamos os valores de cada campo em uma váriavel para facilitar a manipulação
	    var nome = $("#nome").val();
	    var email = $("#email").val();
	    var mensagem = $("#mensagem").val();
	    // Exibe mensagem de carregamento
	    $("#status").html("<img src='loader.gif' alt='Enviando' />");
	    // Fazemos a requisão ajax com o arquivo envia.php e enviamos os valores de cada campo através do método POST
	    $.post('envia.php', {nome: nome, email: email, mensagem: mensagem }, 
	    function(resposta) {
	            // Quando terminada a requisição
	            // Exibe a div status
	            $("#status").slideDown();
	            // Se a resposta é um erro
	            if (resposta != false) {
	                // Exibe o erro na div
	                $("#status").html(resposta);
	            } 
	            // Se resposta for false, ou seja, não ocorreu nenhum erro
	            else {
	                // Exibe mensagem de sucesso
	                $("#status").html("Mensagem enviada com sucesso!");
	                // Coloca a mensagem no div de mensagens
	                $("#mensagens").prepend("<strong>" + nome+  "</strong> disse: <em>"+   mensagem +  "</em>");
	                // Limpando todos os campos
	                $("#nome").val("");
	                $("#email").val("");
	                $("#mensagem").val("");
	            }
	        });
	    });
	});
