package My_Practice_PF;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Array: ");
        int[] arr = new int[10];
        for(int i=0; i< arr.length; i++) {
            arr[i] = s.nextInt();
        }
            System.out.println("Enter your Element for searching: ");
            int search = s.nextInt();
            int start =0;
            int end = arr.length;
            boolean found= false;
            while(start<=end){
                int mid = (start+end)/2;
                if(search>arr[mid]){
                    start = mid+1;
                }
                else if(search ==arr[mid]){
                    System.out.println("Index found at "+mid);
                    found = true;
                    break;
                }
                else{
                    end = mid-1;
                }
            }
            if(found==false){
                System.out.println("Element not found! ");
            }
        }
    }

