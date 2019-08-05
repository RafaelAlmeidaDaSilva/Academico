public class Funcionario extends Conexao implements ICadastro, IEndereco{
	
	public String getStatus(){}
	
	public String getEndereco(){}
	
	public void setEndereco(String endereco){}
	
	public String getCep(){}
	
	public void setCep(String cep){}
	
	public String getCidade(){}
	
	public void setCidade(String cidade){}
	
	public String getEstado(){}
	
	public void setEstado(String estado){}
	
	public String getStatus(){}
	
	public int getCodigo(){}
	
	public void setCodigo(int codigo){}
	
	public String getNome(){}
	
	public void setNome(String nome){}
	
	abstract void alterar(){}
	
	abstract void excluir(){}
	
	abstract void incluir(){}


}