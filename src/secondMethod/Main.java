package secondMethod;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int random = new Random().nextInt(1000)+ 1;
        int attempts =0;
        int guess;
        Scanner input = new Scanner(System.in);
        do {
            guess=input.nextInt();
            if(guess<random)
                System.out.println("Introduceti un nr mai mare decat random");
            else if(guess>random)
                System.out.println("Introduceti un nr mai mic decat random");
            attempts++;
        }while(guess!=random);
        System.out.println("Numarul este"+ random+ ".L-ati nimerit din "+attempts +" incercari.");
    }
}
