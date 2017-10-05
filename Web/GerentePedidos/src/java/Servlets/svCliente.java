/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Banco.ClientePost;
import Banco.Conexao.Postgres;
import Banco.IDao;
import Dominios.Cliente;
import Dominios.Endereco;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pessoal
 */
@WebServlet(name = "svCliente", urlPatterns = {"/svCliente"})
public class svCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IDao dao;
        try{
            if(request.getParameter("btnRegistrarCliente")!= null)
            {
                Endereco end = new Endereco();
                Cliente cliente = new Cliente();
                
                end.setNumero(request.getParameter("txtNumero"));
                end.setRua(request.getParameter("txtRua"));
                end.setBairro(request.getParameter("txtBairro"));
                end.setCidade(request.getParameter("txtCidade"));
                
                cliente.setEnd(end);
                cliente.setNome(request.getParameter("txtNome"));
                cliente.setTelefone(request.getParameter("txtTelefone"));
                
                Postgres postgres = new Postgres();
                dao = new ClientePost(postgres.getConnectDefault());
                dao.create(cliente);
                request.setAttribute("msg", "Cliente cadastrado com sucesso!");
            }
            
        }catch(ClassNotFoundException | SQLException e)
        {
            request.setAttribute("msg", e.getMessage());
        }
        finally{
            request.getRequestDispatcher("CCliente.jsp").forward(request, response);
        }
            
    }

}
