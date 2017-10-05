
public class Singleton {
	
	private static Singleton unicaInstância;
	private int valor;
	
	public void setValor(int valor) {
		this.valor += valor;
	}
	public int getValor() {
		return valor;
	}
	
	
	private Singleton(){}
	

	public static Singleton getInstance()
	{
		if(unicaInstância == null)
		{
			
			return new Singleton();
		}
		
		return unicaInstância;
	}
	
	public static Singleton getInstanceSafe()
	{
		if(unicaInstância == null)
		{
			synchronized (Singleton.class) {
				if(unicaInstância == null)
				{
					return new Singleton();
				}
			}
		
		}
		
		return unicaInstância;
	}
	
	

	public void ExibirValor()
	{
		
		System.out.println(" valor :"+valor);
	}
	
	
}
