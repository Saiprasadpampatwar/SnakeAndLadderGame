
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game");
		int player1position = 0;
		int player2position = 0;
		while(player1position < 100 || player2position < 100)
		{
			if(player1position == 100)
			{
				System.out.println("Player 1 own the game");
				break;
			}
			else if (player2position == 100)
			{
				System.out.println("Player 2 own the game");
				break;
			}
			
			System.out.println("\nPlayer 1 Playing");

			player1position = decisiontaken(player1position);
			System.out.println("Position of player: "+player1position);
			System.out.println("\nPlayer 2 Playing");
			player2position = decisiontaken(player2position);
			System.out.println("Position of player: "+player2position);


		}
		

	}
		
	public static int decisiontaken(int a) {
		int players_position = a;
		int number_on_die = 1 + (int) Math.floor(Math.random() * 6);
	    System.out.println("Number on die : "+ number_on_die);
	    int option = (int) Math.floor(Math.random() * 2);
	    if (option == 0) {
	    	System.out.println("Not Playing");
	    	return players_position;
	    }
	    else if (option == 1) {
    		System.out.println("Ladder");
    		players_position += number_on_die;
    		if (players_position > 100) {
				players_position -= number_on_die;
			}
    		return decisiontaken(players_position);
	    }
	    else {
			System.out.println("Snake");
			players_position -= number_on_die;
			if (players_position < 0)
			{
				players_position = 0;
			}
			
			return players_position;
	    }
	    

	}
}
