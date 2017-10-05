/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Pessoal
 */
public class Postgres implements IConexao {
    
    private Connection connect;
    
      private void connectionDefault() throws ClassNotFoundException, SQLException
    {
        Properties prop = new Properties();
        prop.put("driver", "org.postgresql.Driver");
        prop.put("url", "jdbc:postgresql://localhost:5432/postgres");
        prop.put("user", "postgres");
        prop.put("password", "FatecRafa"); 
        
        this.setConnect(prop);
    }

    @Override
    public Connection getConnect() throws ClassNotFoundException, SQLException {
       return this.connect;
    }

    @Override
    public void setConnect(Properties prop) throws ClassNotFoundException, SQLException {
        Class.forName(prop.getProperty("driver"));
        this.connect = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
    }

    @Override
    public Connection getConnectDefault() throws ClassNotFoundException, SQLException { 
        connectionDefault();
        return this.connect;
    }
    
}






























