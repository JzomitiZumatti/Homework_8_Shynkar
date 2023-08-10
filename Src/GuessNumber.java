import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int counter = 0;
        int maxAttempts = 4;

        int randNumber = random.nextInt(10);

        System.out.println("Number, which you need to guess: " + randNumber);
        System.out.print("Try to guess the number (attempt: " + (counter + 1) + "/ 4): ");
        counter++;

        do {
            int temp = random.nextInt(10);
            System.out.print(temp);
            if (randNumber == temp) {
                System.out.println("\nYou win!");
                break;
            } else {
                if (counter < maxAttempts) {
                    System.out.print("\nYou didn't guess, try again (attempt: " + (counter + 1) +
                            "/ 4): ");
                } else {
                    System.out.println("\nYou lose!");
                }
            }
            counter++;
        } while (counter <= maxAttempts);
    }
}
