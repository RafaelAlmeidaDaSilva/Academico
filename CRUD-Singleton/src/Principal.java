import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Principal {

	public static void main(String[] args) {

		
		Conexao conexao = Conexao.getInstancia();
		conexao.setLocal("localhost");
		conexao.setNomeBanco("dbsimples");
		conexao.setTipoBanco("postgresql");
		conexao.setPorta("5432");
		conexao.setClassDriver("org.postgresql.Driver");
		Properties propriedade = new Properties();
		propriedade.put("user","postgres");
		propriedade.put("password", "FatecRafa");
		conexao.setPropriedades(propriedade);
		
		Endereco end = new Endereco();
		end.setRua("Suiça");
		end.setNumero("54");
		end.setBairro("Jd.São José");
		end.setCidade("Suzano");
		
		Cliente cli = new Cliente(end);
		cli.setNome("Rafael");
		cli.setSobrenome("Almeida da Silva");
		cli.setTelefone("4749-7919");
		cli.setEmail("exampleE-mail@exampleE-mail.com");

		
		try
		{
			Connection connect = abrir(conexao);
			
			DBCliente cliente = new DBCliente(new ClientePost(connect));
			
			int id = cliente.getCliente().Inserir(cli);
			System.out.println("Cliente inserido com sucesso!");
			
			cli.setEmail("ExampleEmail@tantofaz.com");
			cliente.getCliente().Alterar(cli, id);
			System.out.println("Cliente alterado com sucesso!");
		

			connect.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	static Connection abrir(Conexao conexao) throws SQLException, ClassNotFoundException{
		
		System.out.println("class: " +conexao.getClassDriver());
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:"+conexao.getTipoBanco()+"://"+conexao.getLocal()+":"+conexao.getPorta()+"/" + conexao.getNomeBanco();
		System.out.println(url);
		Connection con = DriverManager.getConnection(url,conexao.getPropriedades());
		return con;
		
	}

}
