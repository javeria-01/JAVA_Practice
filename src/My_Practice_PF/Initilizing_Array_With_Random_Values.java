package My_Practice_PF;

import java.util.Arrays;

public class Initilizing_Array_With_Random_Values {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        }
    }
