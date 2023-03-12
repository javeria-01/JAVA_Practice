package __Harry_Oop_;

class MyEmployeee {
    private String name;
    private int id;

//    public MyEmployeee(){
//        id = 456;             //Constructor ko return krne ki zaroort ni prti ye automatically invoke
//        name = "kim";         //hojata main m set krne ki zaoort ni h sirf get kro
//    }
    public MyEmployeee(String neme , int id){
        id = 453;
        name = "kim";          //Constructor m arguments b pass krskte but phr object m b argument pass krni pre gi
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}
public class _4_Constructors {
    public static void main(String[] args) {
        MyEmployeee e = new MyEmployeee("kim", 453);
//        e.setId(234);
//        e.setName("kim");
        System.out.println(e.getName());
        System.out.println(e.getId());
    }
}
