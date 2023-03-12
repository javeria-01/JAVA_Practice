package __Harry_Oop_;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(){
        this.radius = 345;
        this.height = 56;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Cylinder s = new Cylinder();
        System.out.println(s.getRadius());
        System.out.println(s.getHeight());
    }
}
