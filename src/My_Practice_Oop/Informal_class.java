package My_Practice_Oop;

class Student {
    int id;
    String name;
    int age;
    public void details() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 3435;
        s1.name = "harry";
        s1.age = 45;
        s1.details();
    }
}