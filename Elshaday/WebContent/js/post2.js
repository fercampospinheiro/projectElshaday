   $("#mandar").click(function()
        {   
	   
	   var dados=$("#Form1 :input").serializeArray();
            $("div#result").text(""); 
            $.ajax({ 
                type: "POST",                    
                url: "setExperiencia", 
                data: {
                	empresa: dados[1],
                    funcao: dados[2],
                    admissao: dados[3],
                    demissao:dados[4],
                    descricao:dados[5]
                },
                dataType: "json",                    
                success: function(result)
                {   
                    $("div#dados").append('...');
                },
                error: function(xml,result)
                {
                    $("div#dados").append('...');                    
                }
            });                                            
        });