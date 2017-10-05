<%-- 
    Document   : create
    Created on : 07/05/2017, 07:19:47
    Author     : Pessoal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create</title>
    </head>
    <body>
        <h1>Creating</h1>
        <form action="svlGerenciarCliente" method="Post">
            
            <p><label for="cpf">CPF:</label><input type="text" name="cpf" id="cpf" /></p>
            <p><label for="nome">Nome:</label><input type="text" name="nome" id="nome" /></p>
            <p><label for="nome">Sobrenome:</label><input type="text" name="sobrenome" id="sobrenome" /></p>
            <input type="submit" name="btnInserir" value="inserir" /> ${msg}
            
        </form>
            
    </body>
</html>
