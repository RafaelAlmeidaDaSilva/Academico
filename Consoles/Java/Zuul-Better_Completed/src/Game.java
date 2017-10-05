
class Game {
	private Parser parser;
	private Player player1;

	/**
	 * Create the game and initialise its internal map.
	 */
	public Game(Player player1) {
		this.player1 = player1;
		System.out.println("Player(1) " + this.player1.getNome() + " Joined the Game");

		createRooms();
		parser = new Parser();
	}

	/**
	 * Create all the rooms and link their exits together.
	 */
	private void createRooms() {
		Room outside, theatre, pub, lab, office;

		// create the rooms
		outside = new Room("outside the main entrance of the university");
		theatre = new Room("in a lecture theatre");
		pub = new Room("in the campus pub");
		lab = new Room("in a computing lab");
		office = new Room("in the computing admin office");

		outside.itensOfRoom.addItem(new Item("frame", "Frame Leonardo da Vinci - Monalisa", 20.0));
		outside.itensOfRoom.addItem(new Item("statue", "Statue de algum cara qualquer", 100.0));
		theatre.itensOfRoom.addItem(new Item("scenario", "Scenario's theatre musical", 500.0));
		theatre.itensOfRoom.addItem(new Item("clothes", "Clothes for theatre", 20.0));
		pub.itensOfRoom.addItem(new Item("bed", "Bed for sleep", 25.0));
		pub.itensOfRoom.addItem(new Item("wardrobe", "Wardrobe set a item", 23.0));
		lab.itensOfRoom.addItem(new Item("server", "Server's file ", 60.0));
		lab.itensOfRoom.addItem(new Item("cookie", "Cookie's chocolate ", 0.2));
		lab.itensOfRoom.addItem(new Item("table", "Teacher's table", 4.0));
		office.itensOfRoom.addItem(new Item("table", "Office's table", 4.0));
		office.itensOfRoom.addItem(new Item("pen", "Boss's pen", 0.2));

		// initialise room exits
		outside.setExit("east", theatre);
		outside.setExit("south", lab);
		outside.setExit("west", pub);

		theatre.setExit("west", outside);

		pub.setExit("east", outside);

		lab.setExit("north", outside);
		lab.setExit("east", office);

		office.setExit("west", lab);

		player1.setCurrentRoom(outside); // start game outside
	}

	/**
	 * Main play routine. Loops until end of play.
	 */
	public void play() {

		printWelcome(player1.getCurrentRoom());

		// Enter the main command loop. Here we repeatedly read commands and
		// execute them until the game is over.

		boolean finished = false;
		while (!finished) {
			Command command = parser.getCommand();
			finished = processCommand(command);
		}
		System.out.println("Thank you for playing.  Good bye.");
	}

	/**
	 * Print out the opening message for the player.
	 */
	private void printWelcome(Room currentRoom) {
		System.out.println();
		System.out.println("The Game starded: \n");
		System.out.println("Welcome to Adventure " + player1.getNome() + "!");
		System.out.println("Adventure is a new, incredibly boring adventure game.");
		System.out.println("Type 'help' if you need help.");
		System.out.println();
		System.out.println(currentRoom.getLongDescription());
	}

	/**
	 * Given a command, process (that is: execute) the command. If this command
	 * ends the game, true is returned, otherwise false is returned.
	 */
	private boolean processCommand(Command command) {
		boolean wantToQuit = false;

		if (command.isUnknown()) {
			System.out.println("I don't know what you mean...");
			return false;
		}

		String commandWord = command.getCommandWord();

		switch (commandWord) {
		case "help":
			printHelp();
			break;
		case "go":
			goRoom(command);
			break;
		case "take":
			takeItem(player1, command.getSecondWord());
			break;
		case "drop":
			dropItem(player1, command.getSecondWord());
			break;
		case "eat":
			eatItem(player1, command.getSecondWord());
			break;
		case "quit":
			wantToQuit = quit(command);
			break;
		}
		return wantToQuit;
	}

	private void takeItem(Player play, String nameItem) {
		Item item = play.getCurrentRoom().itensOfRoom.getItem(nameItem);
		try {
			if ((play.getPeso() - item.getPeso()) >= 0)
				play.setItensOfPlayer(play.getCurrentRoom().itensOfRoom.transportItem(play.itensOfPlayer, item));
			else
				System.out.println("Very heavy item!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void dropItem(Player play, String nameItem) {
		Item item = play.itensOfPlayer.getItem(nameItem);
		try {
			play.getCurrentRoom()
					.setItensOfRoom(play.itensOfPlayer.transportItem(play.getCurrentRoom().itensOfRoom, item));
			play.setPeso(item.getPeso()); // tira o peso
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void eatItem(Player play, String nameItem) {
		if (nameItem.equals("cookie")) {
			Item item = play.itensOfPlayer.getItem(nameItem);
			play.itensOfPlayer.removeItem(item);
			System.out.println("Item cookie eated");

		}
	}

	// implementations of user commands:

	/**
	 * Print out some help information. Here we print some stupid, cryptic
	 * message and a list of the command words.
	 */
	private void printHelp() {
		System.out.println("You are lost. You are alone. You wander");
		System.out.println("around at the university.");
		System.out.println();
		System.out.println("Your command words are:");
		System.out.println(CommandWords.getCommandList());

	}

	/**
	 * Try to go to one direction. If there is an exit, enter the new room,
	 * otherwise print an error message.
	 */
	private void goRoom(Command command) {
		Room currentRoom = player1.getCurrentRoom();

		if (!command.hasSecondWord()) {
			// if there is no second word, we don't know where to go...
			System.out.println("Go where?");
			return;
		}

		String direction = command.getSecondWord();

		// Try to leave current room.
		Room nextRoom = currentRoom.getExit(direction);

		if (nextRoom == null)
			System.out.println("There is no door!");
		else {
			currentRoom = nextRoom;
			player1.setCurrentRoom(currentRoom);
			System.out.println(currentRoom.getLongDescription());

		}
	}

	/**
	 * "Quit" was entered. Check the rest of the command to see whether we
	 * really quit the game. Return true, if this command quits the game, false
	 * otherwise.
	 */
	private boolean quit(Command command) {
		if (command.hasSecondWord()) {
			System.out.println("Quit what?");
			return false;
		} else
			return true; // signal that we want to quit
	}
}
