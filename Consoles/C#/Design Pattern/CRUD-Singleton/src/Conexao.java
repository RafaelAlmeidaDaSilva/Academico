import java.util.Properties;

public class Conexao {

	private static Conexao unicaConexao;
	private Properties propriedades;
	private String local, nomeBanco, tipoBanco,
	porta, classDriver;
	
	private Conexao()
	{
		
	}
	
	public static Conexao getInstancia()
	{
		if(unicaConexao == null)
		{
			
			return new Conexao();
		}
		
		return unicaConexao;
		
	}
	
	
	public void setPropriedades(Properties propriedades) {
		this.propriedades = propriedades;
	}
	public void setClassDriver(String classDriver) {
		this.classDriver = classDriver;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public void setTipoBanco(String tipoBanco) {
		this.tipoBanco = tipoBanco;
	}
	public void setLocal(String local)
	{
		this.local =local;
	}
	
	public Properties getPropriedades()
	{
		return this.propriedades;
	}
	
	public String getLocal()
	{
		return this.local;
	}
	
	public String getPorta()
	{
		return this.porta;
	}

	public String getNomeBanco(){
		return this.nomeBanco;
	}
	
	public String getClassDriver(){
		return this.classDriver;
	}
	
	public String getTipoBanco()
	{
		return this.tipoBanco;
	}
}


