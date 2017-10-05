
public class Item {
	private String descricao, name;
	private double peso;
	
	public Item(String name, String descricao, double peso)
	{
		this.name = name;
		this.descricao = descricao;
		this.peso= peso;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescricao()
	{
		return this.descricao;
	}
	
	public double getPeso()
	{
		return this.peso;
	}
	
	public String getDescriptionItem()
	{
		return "\n Description: "+this.getDescricao()+"\n Weight: "+this.getPeso();
	}
	
}
