package My_Practice_PF;

import java.util.Scanner;

public class factt {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your number ");
        long num = s.nextInt();
        long fact =1;
        for (long i = 1; i <=num ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
