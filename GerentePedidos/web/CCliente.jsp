<%-- 
    Document   : CCliente
    Created on : 13/05/2017, 02:06:12
    Author     : Pessoal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro do Cliente</title>
        <style type="text/css">
            * { margin: 0; padding:0; font-family:Tahoma; font-size:14pt;}

            #divCenter
            {
                background-color: #e1e1e1; 
                width:270px;
                height:450px;
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
            <center><h1>Dados do Cliente</h1></center>
        <form action="#" method="#">
            
            <p><label for="txtNome">Nome:</label></p>
            <p><input type="text" name="txtNome"></p>
            <p><label for="txtTelefone">Telefone:</label></p>
            <p><input type="text" name="txtTelefone"></p>
            <br>
            <center><p><label>Endereco</label></p></center>
            <br>
            <p><label for="txtRua">Rua:</label></p>
            <p><input type="text" name="txtRua"></p>
            <p><label for="txtNumero">Numero:</label></p>
            <p><input type="text" name="txtNumero"></p>
            <p><label for="txtBairro">Bairro:</label></p>
            <p><input type="text" name="txtBairro"></p>
            <p><label for="txtCidade">Cidade:</label></p>
            <p><input type="text" name="txtCidade"></p>
            <p><input type="submit" name="btnCancelar" value="Cancelar">
               <input type="submit" name="btnRegistrarCliente" value="Registrar"></p>
            <label for="btnRegistrarCliente"> ${msg} </label>
        </form>
        </div>
    </body>
</html>
