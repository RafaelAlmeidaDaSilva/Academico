<%-- 
    Document   : RegistroProduto
    Created on : 13/05/2017, 01:58:54
    Author     : Pessoal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Castrado de Produtos</title>
        <style type="text/css">
            * { margin: 0; padding:0; font-family:Tahoma; font-size:14pt;}

            #divCenter
            {
                background-color: #e1e1e1; 
                width:400px;
                height:170px;
                left: 50%;
                margin: -150px 0 0 -150px;
                top:50%;
                padding:10px;
                position: absolute;
                
            }
           
            
          
        </style>
    </head>
    <body>
        
        <div id="divCenter">
            <center><h1>Castrado de Produtos</h1></center>
            <form id="form" action="svProduto" method="Post">
                <p><label for="txtNomePro">Descrição:</label></p>
                <p><input type="text" name="txtNomePro"></p>
                <p><label for="txtValorPro">Valor do Produto:</label></p>
                <p><input type="text" name="txtValorPro"></p>
                <p><input type="submit" name="btnCancelar" value="Cancelar">
                <input type="submit" name="btnRegistrarProduto" value="Registrar"></p>
                <label for="btnRegistrarProduto" value="Registrar">${msg}</label></p>      
            </form>
        </div>
    </body>
</html>
