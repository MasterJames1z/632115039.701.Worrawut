//Worawut Aunkham 632115039

public class MainCircle {
    public static void main(String[] args) {
        Circle cir1 = new Circle(0.0, 0.0);
        cir1.Radius(2.0);
        System.out.println("Area of cir1 = " + cir1.Area());
        System.out.println("Circumference of cir1 = " + cir1.Circum());

        Circle cir2 = new Circle(1.0, 2.0);
        cir2.Radius(3.0);
        System.out.println("Area of cir2 = " + cir2.Area());
        System.out.println("Circumference of cir2 = " + cir2.Circum());

        Circle cir3 = new Circle(3.0, 5.0);
        cir3.Radius(1.0);
        System.out.println("Area of cir3 = " + cir3.Area());
        System.out.println("Circumference of cir3 = " + cir3.Circum());

        Circle cir4 = new Circle(-1.0, -10.0);
        cir4.Radius(0.0);
        System.out.println("Area of cir = " + cir4.Area());
        System.out.println("Circumference of cir4 = " + cir4.Circum());

        System.out.println("Is circle 1 intersec circle 2: " + cir1.Intersec(cir2));
        System.out.println("Is circle 1 intersec circle 3: " + cir1.Intersec(cir3));
    }
}
