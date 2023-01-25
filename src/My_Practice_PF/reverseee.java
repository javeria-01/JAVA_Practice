package My_Practice_PF;

import java.util.Scanner;

public class reverseee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your String ");
        String str = s.next();
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse = reverse+str.charAt(i);
            System.out.print(str.charAt(i));
        }
    }
}
