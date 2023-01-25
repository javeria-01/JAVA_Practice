package My_Practice_PF;

import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your String ");
        String str = s.next();
        String reverse = "";
        try {
            for (int i = str.length(); i >= 0; i--) {
                reverse = reverse + str.charAt(i);
                System.out.print(str.charAt(i));
            }
        }
        catch(Exception e){
                System.out.println("Exception is coming!! "+e.getMessage());
            }
    }
}
