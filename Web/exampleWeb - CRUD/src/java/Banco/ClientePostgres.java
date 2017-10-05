package Banco;


import Dominio.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pessoal
 */
public class ClientePostgres implements ICliente{

    
    private Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
       
         String url = "jdbc:postgresql://localhost:5432/postgres";
      
        return DriverManager.getConnection(url, "postgres", "FatecRafa");
    }
    
    @Override
    public void create(Cliente cliente) throws ClassNotFoundException, SQLException{
      Connection con = getConnection();
      
      PreparedStatement sqlCliente = con.prepareStatement("insert into tblclientes (nome, sobre, cpf) values(?,?,?);");
      sqlCliente.setString(1, cliente.getNome());
      sqlCliente.setString(2, cliente.getSobrenome());
      sqlCliente.setString(3, cliente.getCpf());
      
      sqlCliente.execute();
      con.close();
      
    }

    @Override
    public Cliente read(int index) throws ClassNotFoundException, SQLException {
        Connection con = getConnection();
        ResultSet set;
        PreparedStatement sqlCliente = con.prepareStatement("select * from tblclientes where id_cliente = ?;");
        sqlCliente.setInt(1,index);
        set = sqlCliente.executeQuery();
        set.next();
        con.close();
        return new Cliente(set.getInt("id_cliente"), 
                           set.getString("nome"),
                           set.getString("sobre"), 
                           set.getString("cpf"));
    }

    @Override
    public ArrayList<Cliente> read() throws ClassNotFoundException, SQLException {
         Connection con = getConnection();
         ResultSet set;
         ArrayList<Cliente> clientes = new ArrayList<>();
         PreparedStatement sqlClientes = con.prepareStatement("select * from tblclientes");
         set= sqlClientes.executeQuery();
            while(set.next())
            {
                clientes.add(new Cliente(set.getInt("id_cliente"), 
                           set.getString("nome"),
                           set.getString("sobre"), 
                           set.getString("cpf")));
            }
         con.close();
         
         return clientes;
    }

    @Override
    public void update(Cliente cliente) throws ClassNotFoundException, SQLException {
       Connection con = getConnection();
       
       PreparedStatement sqlCliente =  con.prepareStatement("update tblclientes set nome=?, sobre=?, cpf=? where id_cliente = ?");
       sqlCliente.setString(1,cliente.getNome());
       sqlCliente.setString(2,cliente.getSobrenome());
       sqlCliente.setString(3,cliente.getCpf());
       sqlCliente.setInt(4, cliente.getId());
       sqlCliente.execute();
       con.close();
       
    }

    @Override
    public void delete(int index) throws ClassNotFoundException, SQLException {
       Connection con = getConnection();
       PreparedStatement sql=  con.prepareStatement("delete tblclientes where id=?");
       
    }

  
}

