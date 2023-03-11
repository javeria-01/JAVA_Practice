package __Harry_Oop_;
//Access modifiers specify where a property/method is accessible.
//There are four types of access modifiers.
//1)Private
//2)Default
//3)Protected
//4)Public
//Filhl sirf private dekhlo.
 class MyEmployee {
    private int id;     // inpr private likhe ge to hum directly access ni kr pay ge id or name
    private String name;  //inko hum methods se acccess kr skte getter and setter age dekhe ge isko.
}
public class _3_Access_Modifiers{

    public static void main(String[] args) {
        MyEmployee e = new MyEmployee();
//        e.id = 345;
//        e.name = "Kim tae";
//        System.out.println(e.id);
//        System.out.println(e.name);
    }
}

