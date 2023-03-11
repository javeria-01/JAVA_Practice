package __Harry_Oop_;

class Cellphone{

    public void ringing(){
        System.out.println("Your phone is ringing");
    }
    public void vibrating(){
        System.out.println("Your phone is vibrating ");;
    }
    public static void main(String[] args) {
        Cellphone c = new Cellphone();
        c.ringing();
        c.vibrating();

    }
}

