package My_Practice_OOP;

import java.util.Scanner;

class students{
    int id;
    String name;
    String gender;
}
public class _03_Printing_Two_Student_Details {
    public static void main(String[] args) {
        System.out.println("Enter 1st student detail: ");
        students s1 = new students();
        Scanner s = new Scanner(System.in);
        System.out.println("ENter student 1 id ");
        s1.id = s.nextInt();
        System.out.println("Entter Student 1 name ");
        s1.name = s.next();
        System.out.println("ENter student 1 gender ");
        s1.gender = s.next();

        System.out.println("ENter 2nd Student details: ");
        students s2 = new students();
        System.out.println("Enter student 1 id ");
        s2.id = s.nextInt();
        System.out.println("Enter student 2 name ");
        s2.name = s.next();
        System.out.println("Entter student 2 gender ");
        s2.gender = s.next();
        System.out.println("Process has been Completed! Thankyou.");
    }
}
