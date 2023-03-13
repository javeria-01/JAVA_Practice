package __Harry_Oop_;
class SuperClass {
    private int x;
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void print() {
        System.out.println("I am a SuperClass ");
    }
}
class SubClass extends SuperClass {
    private int y;
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void prints() {
        System.out.println("I am a Sub Class");
    }
    public static void main(String[] args) {
        SuperClass i = new SubClass();
        i.setX(45);
        System.out.println(i.getX());
        i.print();
        SubClass s = new SubClass();
        s.setY(90);
        System.out.println(s.getY());
        s.prints();
    }
}
