

import java.sql.SQLException;
import java.util.ArrayList;

public interface ICliente{
	
	int Inserir(Cliente cliente) throws ClassNotFoundException, SQLException;
	Cliente Consultar(int id) throws ClassNotFoundException, SQLException;
	void Excluir(int id) throws ClassNotFoundException, SQLException;
	ArrayList<Cliente> Consultar() throws ClassNotFoundException, SQLException;
	void Alterar(Cliente cliente,int id)throws ClassNotFoundException, SQLException;
	
}
