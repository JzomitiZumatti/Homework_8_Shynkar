import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt(10);
        System.out.println("Number, which you need to guess: " + randNumber);
        int counter = 0;
        System.out.print("Try to guess the number: ");
        do {
            int temp = random.nextInt(10);
            System.out.print(temp);
            if (randNumber == temp) {
                System.out.println("\nYou win!");
                break;
            } else {
                if (counter < 3) {
                    System.out.print("\nYou didn't guess, try again: ");
                } else {
                    System.out.println("\nYou lose!");
                }
            }
            counter++;
        } while (counter < 4);
    }
}
