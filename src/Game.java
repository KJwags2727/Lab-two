import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		int state = 1;
		//boolean cont = true;
		
		String name = "";
		
		Scanner scan1 = new Scanner(System.in);
		boolean play = true;
		String option = " ";
		
		
		while (play){
	
		switch (state) {
		case 1:
		System.out.println("Welcome!  What is your name?");
		name = scan1.next();
		System.out.println("Welcome" + name);
		System.out.println("Would you like to play a game? (enter yes or no)");
		
		option = scan1.nextLine();
		option = scan1.nextLine();
		
		
		if (option.equalsIgnoreCase("yes"))
			state = 2;
		else
			play = false;
		break;
		case 2:
		System.out.println("Excellent!  You are walking across a field and you encounter a fire breathing dragon!  What would you do? (enter 'face the beast' or 'run away')");;
		option = scan1.nextLine();
		
		if (option.equalsIgnoreCase("face the beast"))
			state = 3;
		else
			play = false;
		break;
		
		case 3:
			System.out.println("You approach the dragon, you see that he has _ heads. (enter '1' or '2' or '3')");
			
			option = scan1.nextLine();
			
			if (option.equalsIgnoreCase("3"))
				state = 4;
			else
				play = false;
			break;
		case 4:
			System.out.println("No one has ever faced a three headed dragon before!  Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow'");
			
			option = scan1.nextLine();
			
			if (option.equalsIgnoreCase("bow and arrow"))
				state = 5;
			else
				play = false;
			break;
		case 5:
			System.out.println("Armed with your bow and arrow, you approach the dragon.  You can feel its fiery breath as you get closer.  It stares at you with its _ eyes. (enter 'red' or 'blue'");
			
			option = scan1.nextLine();
			
			if (option.equalsIgnoreCase("red"))
				state = 6;
			else
				play = false;
			break;
		case 6:
			System.out.println("Oh thank goodness!  Red-eyed dragons are friendly.  You pet it and become friends.  You name the dragon _. (enter a name)");
			option = scan1.nextLine();
			System.out.println(name + "and" + option + "live happily ever after.");
			play = false;
			break;
			
		//play = scan1.hasNext();
		
		//scan1.close();
	}
		}
	
	}
}
