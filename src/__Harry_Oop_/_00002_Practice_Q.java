package __Harry_Oop_;

class Employee{
    int Salary;
    String name;

    public void getSalary(){
        System.out.println("Employee Sallery is "+Salary);
    }
    public void getName(){
        System.out.println("Employee Name is "+name);
    }
    public void setName(){
        System.out.println("Set name is "+name);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.Salary = 400000;
        e1.name = "Kim Taehyung";
        e1.getSalary();
        e1.getName();
        e1.setName();

    }
}
