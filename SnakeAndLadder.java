
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to snake and Ladder");
		int players_position = 0;
		int number_on_die = 1 + (int) Math.floor(Math.random() * 6);
	    System.out.println("Number on die : "+ number_on_die);
	    int option = (int) Math.floor(Math.random() * 2);
	    if (option == 0) {
	    	System.out.println("Not Playing");
	    }
	    else if (option == 1) {
    		System.out.println("Ladder");
    		players_position += number_on_die;
	    }
	    else {
			System.out.println("Snake");
			players_position -= number_on_die;
	    }
	    System.out.println("Players Position : "+players_position);

	    


	}

}
