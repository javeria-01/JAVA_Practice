package __Harry_Oop_;

class Student{
     int id;
     String name;
     String gender;
    public void detail(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
        System.out.println("My gender is "+gender);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        //Setting Attributes:
        s1.id = 34;
        s1.name = "hello world ";
        s1.gender = "male ";
        //Printing Attributes by calling method:
        s1.detail();
    }
}