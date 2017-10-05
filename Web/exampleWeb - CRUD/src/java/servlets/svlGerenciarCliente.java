package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Banco.ClientePostgres;
import Banco.ICliente;
import Dominio.Cliente;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pessoal
 */
public class svlGerenciarCliente extends HttpServlet {

    /**
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           int id = 0;  
                if(request.getParameter("btnInserir")!= null)
                { 
                    try{
                    Cliente cli = new Cliente();
                    cli.setNome(request.getParameter("nome"));
                    cli.setSobrenome(request.getParameter("sobrenome"));
                    cli.setCpf(request.getParameter("cpf"));
                    
                    ICliente bdCliente = new ClientePostgres();
                    bdCliente.create(cli);
                    request.setAttribute("msg", "Cliente cadastrado com sucesso!");
                    request.getRequestDispatcher("/create.jsp").forward(request, response);
                    
                    }catch(ClassNotFoundException|SQLException|NumberFormatException e)
                         {
                             request.setAttribute("msg", e.getMessage());
                             request.getRequestDispatcher("/create.jsp").forward(request, response);
                            }
                }else 
                if(request.getParameter("btnSearch") != null){
                     
                    try {
               
                         try{
                          id =Integer.parseInt( request.getParameter("txtId"));}
                          catch(NumberFormatException e){
                                  
                                  }
                  
                         if(id != 0)
                       {
                           
                           // consulta um unico 
                           ICliente bdCliente = new ClientePostgres();
                           Cliente cliente = bdCliente.read(id);

                           // notifica JSP
                           request.setAttribute("cliente", cliente);
                           request.setAttribute("tipo", "com");
                           request.getRequestDispatcher("/read.jsp").forward(request, response);
                        
                       }else
                       {
                           //consulta todos os clientes 
                           ICliente bdCliente = new ClientePostgres();                           
                           ArrayList<Cliente> clientes = bdCliente.read();

                           //notifica jsp
                           request.setAttribute("clientes", clientes);
                           request.setAttribute("tipo", "vazia");
                           request.getRequestDispatcher("/read.jsp").forward(request, response);
                       }
                   
                     
                        }catch(ClassNotFoundException|SQLException e)
                        {
                            
                              // set msg
                              request.setAttribute("msg", e.getMessage());
                              request.getRequestDispatcher("/search.jsp").forward(request, response);
                          }
                         
                         
 
                    }else   
                     if(request.getParameter("btnSearchUpdate")!=null)
                     {
                          try{
                          id =Integer.parseInt( request.getParameter("txtId"));}
                          catch(NumberFormatException e){
                                   // set msg
                              request.setAttribute("msg", e.getMessage());
                              request.getRequestDispatcher("/update.jsp").forward(request, response);
                           }
                          
                          if(id != 0)
                          {
                              try{
                           // consulta um unico 
                           ICliente bdCliente = new ClientePostgres();
                           Cliente cliente = bdCliente.read(id);
                           
                           request.setAttribute("resultado", "Ok");
                           request.setAttribute("msg", "cliente consultado!");
                           request.setAttribute("cliente", cliente);
                           request.getRequestDispatcher("/update.jsp").forward(request, response);
                              }catch(ClassNotFoundException|SQLException e)
                              {
                                  request.setAttribute("msg", e.getMessage());
                                  request.getRequestDispatcher("/update.jsp").forward(request, response);
                              }
                          }
                          
                  
                     }
                    else if(request.getParameter("btnAlterar")!= null)
                    {
                        Cliente cliente = new Cliente();
                        try{
                        cliente.setId(Integer.parseInt(request.getParameter("id")));
                        cliente.setNome(request.getParameter("nome"));
                        cliente.setCpf(request.getParameter("cpf"));
                        cliente.setSobrenome(request.getParameter("sobrenome"));
                        
                        ICliente DBCliente = new ClientePostgres();
                        DBCliente.update(cliente);
                        request.setAttribute("msg", "Alterado com Sucesso!");
                        request.getRequestDispatcher("/update.jsp").forward(request, response);
                        }catch(ClassNotFoundException|SQLException|NumberFormatException e )
                        {
                            request.setAttribute("msg", e.getMessage());
                            request.getRequestDispatcher("/update.jsp").forward(request, response);
                        }
                        
                    }else if(request.getParameter("btnSearchDelete") != null)
                    {
                        try{
                        id = Integer.parseInt(request.getParameter("txtId"));
                        }catch(NumberFormatException e)
                        {
                               request.setAttribute("msg", e.getMessage());
                               request.getRequestDispatcher("/delete.jsp").forward(request, response);
                        }
                        
                        if(id != 0)
                        {
                            try{
                               
                               ICliente cliente = new ClientePostgres();
                               cliente.delete(id);
                               request.setAttribute("msg","Cliente deletado com sucesso!");
                               request.getRequestDispatcher("/delete.jsp").forward(request, response);
                               
                            }catch(ClassNotFoundException|SQLException e)
                            {
                               request.setAttribute("msg", e.getMessage());
                               request.getRequestDispatcher("/delete.jsp").forward(request, response);
                            }
                              
                        }else{
                                request.setAttribute("msg","0(zero) não pode!" );
                                request.getRequestDispatcher("/delete.jsp").forward(request, response);
                        }
                    }
                
            
             
                    
        }
    }
