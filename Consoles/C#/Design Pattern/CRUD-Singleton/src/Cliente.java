
public class Cliente {

	private String nome, sobrenome, telefone, email;
	private Endereco end;
	
	
	public Cliente(String nome, String sobrenome,String telefone, String email ,Endereco end)
	{
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.setEndereco(end);
	}
	
	public Cliente(Endereco end)
	{
		this.end= end;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setEndereco(Endereco end){
		this.end = end;
	}
	
	public String getEmail() {
		return email;
	}
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public Endereco getEnd() {
		return end;
	}
	
}
