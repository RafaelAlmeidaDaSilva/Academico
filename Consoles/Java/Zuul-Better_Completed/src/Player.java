

public class Player {
	
	private String nome;
	private Room currentRoom;
	public CollectionItem itensOfPlayer;
	private double peso;

	
	public Player(String nome, double peso)
	{
		this.peso = peso;
		this.itensOfPlayer = new CollectionItem();
		this.nome = nome;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}
	public String getNome() {
		return nome;
	}
	
	public void setCurrentRoom(Room currentRoom) 
	{
		this.currentRoom = currentRoom;
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setItensOfPlayer(Item item) {
		this.peso -= item.getPeso();
		this.itensOfPlayer.addItem(item);
		System.out.println("item: "+item.getDescriptionItem()+"\ntaked\n");
	}
	

		
}
