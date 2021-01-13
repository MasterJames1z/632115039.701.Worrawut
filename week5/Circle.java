//Worawut Aunkham 632115039

package week5;

public class Circle {

    double x;
    double y;
    double radius;
    double cc;
    double ar;

    public Circle(double x, double y) {
    }

    public void Radius(double rad) {
        radius = rad;
    }

    public double Area() {
        ar = Math.PI * Math.pow(radius, 2);
        return ar;
    }

    public double Circum() {
        cc = 2 * Math.PI * radius;
        return cc;
    }

    public boolean Intersec(Circle cep) {
        double d = Math.sqrt(Math.pow(x - cep.x, 2) + Math.pow(y - cep.y, 2));
        if (d > radius - cep.radius) {
            return true;
        } else {
            return false;
        }

    }

}
