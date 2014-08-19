import java.util.Scanner;


public class TextAdventureGame
	{

	public static void main(String[] args)
		{
		int choiceToPickUp;
		System.out.println("One day you are walking and you see a hundred dollars on the ground do you pick it up?");
		System.out.println("1)pick up 2) leave it on the ground");
		Scanner userInput = new Scanner (System.in);
		choiceToPickUp = userInput.nextInt();
		if (choiceToPickUp == 1)
			{
			System.out.println("You are a hundred dollars richer");
			}
		else 
			{
			System.out.println("I guess you are the better person but you missed up on a hundred dollars.");
			}
		}

	}
