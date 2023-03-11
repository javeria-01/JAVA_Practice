package __Harry_Oop_;

class Students{
    int id;
    String name;
public void show_record(){

    System.out.println(id + " " + name);
    }
public void insert_record(int rec_id, String rec_name){
  id = rec_id;
  name = rec_name;
   }
}
public class _0002_Use_Of_Methods_For_Students_Detaile {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        s1.insert_record(123 , "Javeria");
        s2.insert_record(345, "Farhan");
        s1.show_record();
        s2.show_record();
    }
}
