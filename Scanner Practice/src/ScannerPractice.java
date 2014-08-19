import java.util.Scanner;
public class ScannerPractice
	{
	static int age;
	static double weight;

	public static void main(String[] args)
		{
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("What is your age?");
		age = userInput.nextInt();
		System.out.println("Wow. Im, " + age + " also." );
		System.out.println("What is your weight in decimals?");
		weight = userInput.nextDouble();
		System.out.println("No way man your weight is " + weight + ".");
		

		}

	}
