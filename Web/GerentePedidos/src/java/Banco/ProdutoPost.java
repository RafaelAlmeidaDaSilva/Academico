/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Banco.Conexao.IConexao;
import Dominios.EntidadeDominio;
import Dominios.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pessoal
 */
public class ProdutoPost implements IDao {
    
    private final Connection connect;
    private Produto produto;
    
    public ProdutoPost (Connection connect)
    {
        this.connect = connect;
    }

    @Override
    public void create(EntidadeDominio ent) throws ClassNotFoundException, SQLException{
      this.produto=(Produto) ent;
      PreparedStatement sql = this.connect.prepareStatement("insert into tblProdutos (descricao, valor) values(?,?)");
      sql.setString(1,produto.getDescricao());
      sql.setFloat(2,produto.getValor());
      sql.execute();
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
