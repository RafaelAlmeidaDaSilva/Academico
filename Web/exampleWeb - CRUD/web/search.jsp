<%-- 
    Document   : search
    Created on : 12/05/2017, 19:50:31
    Author     : Pessoal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Search </title>
    </head>
    <body>
        <h1>Search</h1>
         <form action="svlGerenciarCliente" method="Post">
            <label for="txtId"> ID:</label><br>
            <input type="text" name="txtId"/>
            <input type="submit" name="btnSearch" value="Search"/>
            <label for="btnSearch">${msg}</label>
        </form>
    </body>
</html>
