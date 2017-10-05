/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Dominios.EntidadeDominio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pessoal
 */
public interface IDao {
    void create(EntidadeDominio ent) throws ClassNotFoundException, SQLException;
    EntidadeDominio read(int id) throws ClassNotFoundException, SQLException;
    ArrayList<EntidadeDominio> read() throws ClassNotFoundException, SQLException;
    void delete(int id) throws ClassNotFoundException, SQLException;
    void update(EntidadeDominio ent) throws ClassNotFoundException, SQLException;    
}
