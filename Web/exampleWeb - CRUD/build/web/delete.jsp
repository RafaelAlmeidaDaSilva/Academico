<%-- 
    Document   : delete
    Created on : 13/05/2017, 01:31:40
    Author     : Pessoal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Delete </title>
    </head>
    <body>
        <h1> Delete </h1>
        <form action="svlGerenciarCliente" method="Post">
            <label for="txtId"> ID:</label><br>
            <input type="text" name="txtId"/>
            <input type="submit" name="btnSearchDelete" value="Search"/>
            <label for="btnSearchDelete">${msg}</label>
        </form>
    </body>
</html>
