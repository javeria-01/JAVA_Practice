package __Harry_Oop_;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int num;
    private int rand;
    public Game(){
        Random rand  = new Random(100);
    }
    public int takeUserInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number plz ");
        num = s.nextInt();
        return takeUserInput();
    }
    public int isCorrectNumber(){
        if(num == rand){
            System.out.println("Congrats! you won");
        }
        if(num > rand){
            System.out.println("Sorry your guessed is greater then original number  ");
        }
        else{
            System.out.println("Sorry your guessed number is lower then original  ");
        }
        return isCorrectNumber();
    }


    public static void main(String[] args) {
        Game g = new Game();
        g.takeUserInput();
        g.isCorrectNumber();

    }
}