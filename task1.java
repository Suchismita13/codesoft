import java.util.Scanner;

public class task1 {
public static void game()
	{
	Scanner sc = new Scanner(System.in);
   int number = 1 + (int)(100* Math.random());
   int K = 5,i, guess;

		System.out.println("choose a number");

		
		for (i = 0; i < K; i++) {

			System.out.println("Guess the number:");

			
			guess = sc.nextInt();

			
			if (number == guess) {
				System.out.println("guess is correct");
				break;
			}
			else if (number > guess && i != K - 1) {
				System.out.println("too high");
			}
			else if (number < guess && i != K - 1) {
				System.out.println("too low");
			}
		}

		if (i == K) {
			System.out.println("You have exhausted" + " K trials.");

			System.out.println("number " + number);
		}
	}

	
	public static void
	main(String arg[])
	{

		game();
	}
}
