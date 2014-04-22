
$("#mandar").click( function() {

	var dados=$("#Form1 :input").serializeArray();
	   
    $.ajax({  
        type: 'POST',  
        url: $("#Form1").attr("action"),  
        data: 'empresa='+dados[1]+  
              '&funcao='+dados[2]+  
              '&admissao='+dados[3]+  
              '&demissao='+dados[4]+  
              '&descricao='+dados[5],  
        cache: false, 
        statusCode :{
            200 : function(jqXHR) {
                $.messager.alert('Request Status',
                        jqXHR.responseText);

            }},


          
        success: function( data ) {  
        	Jquery("div#dados").html("<strong>Empresa</strong><br>"+dados[1]+"<br>"
                	+"<strong>Funcao</strong><br>"+dados[2]+"<br>"+
                	"<strong>admissao</strong><br>"+dados[3]+"<br>"+
                	"<strong>demissao</strong><br>"+dados[4]+"<br>"+
                	"<strong>descricao</strong><br>"+dados[5]+"<br>") ;
        	  $("#empresa").val("");
              $("#funcao").val("");
              $("#admissao").val("");
              $("#demissao").val("");
              $("#descricao").val("");
        }  

      });
});

