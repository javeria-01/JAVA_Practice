package __Harry_Oop_;

import java.util.Random;
import java.util.Scanner;

class _5_Guessing_numbers_Games {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Guessing Number Game! ");
        System.out.println("DO You Want to Play ");
        String play = s.next();
        if (play.contains("yes")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Ok Fine");
        }
        Random rand = new Random(1);
        System.out.println("Choose your Number plz ");
        int guess = s.nextInt();
        if(rand.equals(guess)){
            System.out.println("You Won");
        }
        else{
            System.out.println("You Lose");
        }
    }
}




