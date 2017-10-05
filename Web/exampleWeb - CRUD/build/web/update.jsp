<%-- 
    Document   : upadate
    Created on : 12/05/2017, 20:01:24
    Author     : Pessoal
--%>
<%@page import="Dominio.Cliente" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Upadate </title>
    </head>
    <body>
        <h1> Update </h1>
        <form action="svlGerenciarCliente" method="Post">
    
            <label for="txtId"> ID:</label><br>
            <input type="text" name="txtId"/>
            <input type="submit" name="btnSearchUpdate" value="search"/>
            <label for="btnSearchUpdate">${msg}</label>
            <%if(request.getAttribute("resultado")=="Ok")
            {
               Cliente cliente =(Cliente) request.getAttribute("cliente");
               
            %>            
            <p><label for="id">ID:</label><input type="text" name="id" id="id" value="<%=cliente.getId()%>" /></p>
            <p><label for="cpf">CPF:</label><input type="text" name="cpf" id="cpf" value="<%=cliente.getCpf()%>" /></p>
            <p><label for="nome">Nome:</label><input type="text" name="nome" id="nome" value="<%=cliente.getNome()%>"/></p>
            <p><label for="nome">Sobrenome:</label><input type="text" name="sobrenome" id="sobrenome" value="<%=cliente.getSobrenome()%>"/></p>
            <input type="submit" name="btnAlterar" value="alterar" /> ${msg}
            <%}else{%>
            <p><label for="cpf">CPF:</label><input type="text" name="cpf" id="cpf" /></p>
            <p><label for="nome">Nome:</label><input type="text" name="nome" id="nome" /></p>
            <p><label for="nome">Sobrenome:</label><input type="text" name="sobrenome" id="sobrenome" /></p>
            <%}%>
            
            
        </form>
            
    </body>
</html>
