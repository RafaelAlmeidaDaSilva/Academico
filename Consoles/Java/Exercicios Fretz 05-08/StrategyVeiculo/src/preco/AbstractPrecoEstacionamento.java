package preco;

public abstract class AbstractPrecoEstacionamento implements IPrecoEstacionamento {
	protected double preco;
	
	protected AbstractPrecoEstacionamento(double preco)
	{
		this.preco = preco;
	}
	
	public void getPreco()
	{
		if(this.preco == 0.0)
		{
			System.out.println("Pre�o / Entidade n�o atribuido: Valor nulo");
		}else
			System.out.println("Pre�o: R$ "+this.preco);
		
	}
}
