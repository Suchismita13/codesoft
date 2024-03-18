import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("enter input string:");
        String str = v.nextLine();
        System.out.println("number of words present=" + word(str));
    }

    public static int word(String str) {
        int count = 0;
        boolean wordStarted = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!wordStarted) {
                    count++;
                    wordStarted = true;
                }
            } else {
                wordStarted = false;
            }
        }

        return count;
    }
}
