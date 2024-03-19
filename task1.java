import java.util.Scanner;

 

public class task1 {

      public static void main(String[] args) {

            int num;

            num = (int) (Math.random() * 99 + 1);

            Scanner k = new Scanner(System.in);

            int guess;

            do {

                  System.out.print("Enter your a guess");

                  guess = k.nextInt();

                  if (guess == num)

                        System.out.println("guess is correct");

                  else if (guess < num)

                        System.out.println("too small");

                  else if (guess > num)

                        System.out.println("too high");

            } while (guess != num);

      }

}