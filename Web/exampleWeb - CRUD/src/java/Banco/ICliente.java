package Banco;


import Dominio.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Pessoal
 */
public interface ICliente {

    void create(Cliente cliente)throws ClassNotFoundException, SQLException;
    Cliente read(int index)throws ClassNotFoundException, SQLException;
    ArrayList<Cliente> read()throws ClassNotFoundException, SQLException;
    void update(Cliente cliente)throws ClassNotFoundException, SQLException;
    void delete(int index)throws ClassNotFoundException, SQLException;
    
}
