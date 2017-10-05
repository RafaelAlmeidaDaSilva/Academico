import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ClientePost  implements ICliente {

	private Connection con;
	
	public ClientePost(Connection connect)
	{
		this.con = connect;
	}
	
	public ClientePost(){}
	
	@Override
	public int Inserir(Cliente cliente) throws ClassNotFoundException, SQLException {
		
		
		PreparedStatement sqlEnderecos= this.con.prepareStatement(
				"insert into enderecos (rua, numero, bairro, cidade) values(?,?,?,?) returning id_end;");
		
		sqlEnderecos.setString(1, cliente.getEnd().getRua());
		sqlEnderecos.setString(2, cliente.getEnd().getNumero());
		sqlEnderecos.setString(3, cliente.getEnd().getBairro());
		sqlEnderecos.setString(4, cliente.getEnd().getCidade());
		
		ResultSet set;

		set = sqlEnderecos.executeQuery();
		set.next();
		System.out.println(set.getInt("id_end"));
		
		PreparedStatement sqlClientes = this.con.prepareStatement(
				"insert into clientes (nome, sobrenome, telefone, email, id_end) values(?,?,?,?,?) returning id_cliente;");
		
		sqlClientes.setString(1, cliente.getNome());
		sqlClientes.setString(2, cliente.getSobrenome());
		sqlClientes.setString(3, cliente.getTelefone());
		sqlClientes.setString(4, cliente.getEmail());		
		sqlClientes.setInt(5, set.getInt("id_end"));
		
		set = sqlClientes.executeQuery();
		set.next();
		
       return set.getInt("id_cliente");
	}

	@Override
	public Cliente Consultar(int id) throws ClassNotFoundException, SQLException {
		
		
		PreparedStatement PStateSql = this.con.prepareStatement("select * from clientes, enderecos where clientes.id_cliente=? and enderecos.id_end=?");
		PStateSql.setInt(1, id);
		PStateSql.setInt(2, id);
		ResultSet set;
		set = PStateSql.executeQuery();
		set.next();
		
		
		return  new Cliente(set.getString("nome"),
							set.getString("sobrenome"),
							set.getString("telefone"),
							set.getString("email"),
							new Endereco(set.getString("rua"),
										 set.getString("bairro"),
										 set.getString("cidade"),
										 set.getString("numero")));
	}

	@Override
	public void Excluir(int id) throws ClassNotFoundException, SQLException {
		
		
		PreparedStatement sqlCliente = this.con.prepareStatement("delete from clientes where id_cliente=? returning id_end;");
		sqlCliente.setInt(1, id);
		ResultSet set = sqlCliente.executeQuery();
		
		PreparedStatement sqlEndereco = this.con.prepareStatement("delete from enderecos where id_end=?");
		
		if(set.next())
			sqlEndereco.setInt(1,set.getInt("id_end"));
		
		sqlEndereco.execute();
	
	}

	@Override
	public ArrayList<Cliente> Consultar() throws ClassNotFoundException, SQLException {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		PreparedStatement PStateSql = this.con.prepareStatement("select * from clientes, enderecos");
		ResultSet set = PStateSql.executeQuery();
	
		while(set.next())
		{
			clientes.add(new Cliente(set.getString("nome"),
					set.getString("sobrenome"),
					set.getString("telefone"),
					set.getString("email"),
					new Endereco(set.getString("rua"),
								 set.getString("bairro"),
								 set.getString("cidade"),
								 set.getString("numero"))));
		}
		
		return clientes;
	}

	@Override
	public void Alterar(Cliente cliente, int id) throws ClassNotFoundException, SQLException {
		
		PreparedStatement sqlCliente = this.con.prepareStatement("update clientes set nome=?, sobrenome=?, telefone=?, email=? where id_cliente = ? returning id_end;");
		
		
		
		PreparedStatement sqlEndereco = this.con.prepareStatement("update enderecos set rua=?, numero=?, bairro=?, cidade=? where id_end = ?;");

		sqlCliente.setString(1,cliente.getNome());
		sqlCliente.setString(2,cliente.getSobrenome());
		sqlCliente.setString(3,cliente.getTelefone());
		sqlCliente.setString(4,cliente.getEmail());
		sqlCliente.setInt(5,id);
		ResultSet set = sqlCliente.executeQuery();
		
		sqlEndereco.setString(1,cliente.getEnd().getRua());
		sqlEndereco.setString(2,cliente.getEnd().getNumero());
		sqlEndereco.setString(3,cliente.getEnd().getBairro());
		sqlEndereco.setString(4,cliente.getEnd().getCidade());
	
		if(set.next())
			sqlEndereco.setInt(5,set.getInt("id_end"));
		
		sqlEndereco.execute();
	
	}
	

}
