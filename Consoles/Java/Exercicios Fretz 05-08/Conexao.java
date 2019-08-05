public class abstract Conexao {
	public String status;
	public void conectar (){}
	public void desconectar(){}
	
	abstract void alterar();
	abstract void excluir();
	abstract void incluir();
}