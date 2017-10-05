
public class Singleton {
	
	private static Singleton unicaInst�ncia;
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
		if(unicaInst�ncia == null)
		{
			
			return new Singleton();
		}
		
		return unicaInst�ncia;
	}
	
	public static Singleton getInstanceSafe()
	{
		if(unicaInst�ncia == null)
		{
			synchronized (Singleton.class) {
				if(unicaInst�ncia == null)
				{
					return new Singleton();
				}
			}
		
		}
		
		return unicaInst�ncia;
	}
	
	

	public void ExibirValor()
	{
		
		System.out.println(" valor :"+valor);
	}
	
	
}
