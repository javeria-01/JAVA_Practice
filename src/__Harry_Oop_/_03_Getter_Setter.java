package __Harry_Oop_;

class MyEmploye{
    private String name;
    private int id;

    public String getName(){
        return name;
    }
    public void setName(String n){

        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id =i;
    }
}
public class _03_Getter_Setter {
    public static void main(String[] args) {
        MyEmploye e1 = new MyEmploye();
        e1.setId(2234);
        System.out.println(e1.getId());
        e1.setName("Kim taehyung");
        System.out.println(e1.getName());
    }
}
