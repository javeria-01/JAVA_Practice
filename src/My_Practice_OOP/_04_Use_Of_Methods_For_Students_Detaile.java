package My_Practice_OOP;

class Students{
    int id;
    String name;
public void method1(){
    System.out.println(id + " " + name);
    }
}
public class _04_Use_Of_Methods_For_Students_Detaile {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        s1.id = 45;
        s1.name = "javeria";
        s2.id = 56;
        s2.name = "Farhan";
        s1.method1();
        s2.method1();
    }
}
