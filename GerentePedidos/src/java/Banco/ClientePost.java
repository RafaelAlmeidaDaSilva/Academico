/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Dominios.Cliente;
import Dominios.EntidadeDominio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pessoal
 */
public class ClientePost implements IDao {
    private Connection connect;
    private Cliente cliente;
    
    public ClientePost(Connection connect)
    {
        this.connect = connect;
    }
    @Override
    public void create(EntidadeDominio ent) throws ClassNotFoundException, SQLException {
       this.cliente  = (Cliente)ent;
       
       PreparedStatement  sqlEnd = this.connect.prepareStatement("insert into tblClientes (numero, rua, bairro, cidade) values(?,?,?,?) returning id_end;");
       sqlEnd.setString(1,this.cliente.getEnd().getNumero());
       sqlEnd.setString(2,this.cliente.getEnd().getRua());
       sqlEnd.setString(3,this.cliente.getEnd().getBairro());
       sqlEnd.setString(4,this.cliente.getEnd().getCidade());
       ResultSet result = sqlEnd.executeQuery();
       result.next();
        
       PreparedStatement  sqlCliente = this.connect.prepareStatement("insert into tblClientes (nome, telefone, id_End) values(?,?,?);");
       sqlCliente.setString(1,this.cliente.getNome());
       sqlCliente.setString(2,this.cliente.getTelefone());
       sqlCliente.setInt(3,result.getInt("id_end"));
       
       sqlCliente.execute();
       this.connect.close();
       
    }

    @Override
    public EntidadeDominio read(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EntidadeDominio> read() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(EntidadeDominio ent) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
