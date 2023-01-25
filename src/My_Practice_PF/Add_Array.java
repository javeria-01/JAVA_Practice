package My_Practice_PF;
import java.util.Arrays;

public class Add_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arrr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrr[i] = arr[i];
        }
        arrr[3] = arr[1] + arr[5];
            System.out.println("Before adding Array is: "+Arrays.toString(arr));
            System.out.println("After adding Array is: "+Arrays.toString(arrr));
        }
    }
