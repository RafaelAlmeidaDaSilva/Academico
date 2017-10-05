<%-- 
    Document   : RProduto
    Created on : 13/05/2017, 02:03:03
    Author     : Pessoal
--%>
<%@page import="Dominios.Itens"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Consulta de produtos </title>
        <style type="text/css">
             * { margin: 0; padding:0; font-family:Tahoma; font-size:14pt;}

            body {
                padding: 1em;
            }
             #divCenter
            {
                background-color: #e1e1e1; 
                width:400px;
                height:250px;
                left: 50%;
                margin: -150px 0 0 -150px;
                top:50%;
                padding:10px;
                position: absolute;
                
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
	<style type="text/javascript">
		ancora()
		{
			location.href="CProduto.jsp";	
		}
	</style>
    </head>
    <body>
        <div id="divCenter">
        <h1>Selecione o Produto</h1>
        <form action="#" method="#">
            <p><label for="txtSearch">Pesquisar:</label></p>
            <center>
                <p><input type="text" name="txtSearch"/></p>
            <table>
                 <tr>
                    <th>Seleção</th>
                    <th>Descrição</th>
                    <th>Valor</th>
                </tr>
                <tr>
                    <td><input type="checkbox" name="idProduto"/></th>
                    <td>Null</td>
                    <td>Null</td>
                </tr>
                <tr>
                    <td><input type="checkbox" name="idProduto"/></th>
                    <td>Null</td>
                    <td>Null</td>
                </tr>
            </table>
             
                <p><input type="button" name="btnCProduto" value="Add Produto"/></p>
		
            </center>
        </form>
        </div>
    </body>
</html>
