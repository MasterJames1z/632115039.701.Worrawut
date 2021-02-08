package week10;

public class Main {
    public static void main(String[] args) {
        Shape a1;
        Rectangle a2;
        Cube a3;

        a1 = new Shape(5,10);
        a2 = new Rectangle(5, 10);
        a3 = new Cube(5, 10, 15);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}