/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Pessoal
 */
public interface IConexao {
    
    /*
        user = usuario
        password = senha
        url = jdbc://localhost:5432/nomeBanco
        Class.forname("org.postgresql.Driver");
    */
    void setConnect(Properties prop) throws ClassNotFoundException, SQLException;
    Connection getConnect() throws ClassNotFoundException, SQLException;
    Connection getConnectDefault() throws ClassNotFoundException, SQLException;
    
}
