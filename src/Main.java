import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int attempts;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int random = new Random().nextInt(1000)+1;
        int guess = input.nextInt();
        input.nextLine();
        attempts=0;

        while (guess != random) {
            if (guess > random) {
                System.out.print("The number should be lower");
                attempts += 1;
            }
            else {
                System.out.print("The number should be higher!");
                attempts +=1;
            }
            guess = input.nextInt();
            input.nextLine();
        }

        System.out.print(random + "is the correct answer and it took you" + attempts + "attempts to guess it!");

    }
}

