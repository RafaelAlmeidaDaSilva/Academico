
public class Endereco {
	
	private String rua, bairro, cidade, numero;
	
	public Endereco(){}
	public Endereco(String rua, String bairro, String cidade, String numero)
	{
		this.setRua(rua);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setNumero(numero);
	}
	
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getRua() {
		return rua;
	}
	public String getCidade() {
		return cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public String getNumero() {
		return numero;
	}
	
}
