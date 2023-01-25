package My_Practice_PF;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Array: ");
        int[] arr = new int[5];
        int search =0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter an Element: ");
        search = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Element not found! ");
        }
    }
}