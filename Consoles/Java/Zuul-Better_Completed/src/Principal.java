

public class Principal {
	public static void main(String[] args) {
		
		Player play1 = new Player("Rafael Almeida da Silva",10.0);
		Game game = new Game(play1);
		game.play();
	}
}
