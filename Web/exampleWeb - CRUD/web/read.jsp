<%-- 
    Document   : read
    Created on : 07/05/2017, 09:23:18
    Author     : Pessoal
--%>
<%@page import="Dominio.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reading</title>
         <style>
            body {
                padding: 1em;
            }
            h1 {
                border-bottom: 1px solid #666;
                margin-bottom: 1em;
            }
            table {
                margin-top: 1em;
                font-size: 18px;
            }
            th {
                background-color: #333;
                color: #FFF;
            }
            td {
                padding: 0.5em;
            }
        </style>
    </head>
    <body>
        <h1>Reading</h1>
         <table border="1">
                <tr>
                    <th>ID</th>
                    <th>CPF</th>
                    <th>Nome</th>
                    <th>Sobrenome</th>
                </tr>
                <%
                    String tipo = (String)request.getAttribute("tipo");
                    
                    switch(tipo)
                    {
                        case"vazia":                     
                        // loop exibindo cada item do arraylist de cliente
                        ArrayList<Cliente> clientes = (ArrayList<Cliente>) request.getAttribute("clientes");
                    for (Cliente cliente : clientes) {
                        %>
                    <tr>
                    <td><%= cliente.getId()%></td>
                    <td><%= cliente.getCpf()%></td>
                    <td><%= cliente.getNome()%></td>
                    <td><%= cliente.getSobrenome()%></td>
                    <a href="read.jsp"></a>
                     </tr>
                <%}
                        break;
                        
                        case"com":
                            // mostra o unico cliente.
                    Cliente cliente = (Cliente)request.getAttribute("cliente");%>
                    <tr>
                    <td><%= cliente.getId()%></td>
                    <td><%= cliente.getCpf()%></td>
                    <td><%= cliente.getNome()%></td>
                    <td><%= cliente.getSobrenome()%></td>
                     </tr>
                <% break;
                   default:
                        
                   break;
                  }

%>
                
         </table>      
    </body>
</html>
