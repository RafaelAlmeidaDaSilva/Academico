/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Banco.Conexao.Postgres;
import Banco.IDao;
import Banco.ProdutoPost;
import Dominios.Produto;
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
@WebServlet(name = "svProduto", urlPatterns = {"/svProduto"})
public class svProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       IDao dao;
          
            try
            {
                if(request.getParameter("btnRegistrarProduto")!= null)
                {

                     Produto produto = new Produto();
                     produto.setDescricao(request.getParameter("txtNomePro"));
                     produto.setValor(Float.parseFloat(request.getParameter("txtValorPro")));
                     Postgres banco = new Postgres();
                     ProdutoPost dbProduto = new ProdutoPost(banco.getConnectDefault());
                     dao = dbProduto;
                     dao.create(produto);   
                     
                     request.setAttribute("msg", "Cadastrado com sucesso!");
                }
                
            }catch(ClassNotFoundException | NumberFormatException | SQLException e)
            {
                request.setAttribute("msg","Erro ao cadastrar: "+e.getMessage());
            }
            finally
            {
                request.getRequestDispatcher("CProduto.jsp").forward(request, response);
            }
          
        }
    

}
