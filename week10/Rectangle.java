package week10;

class Rectangle extends Shape {
    int width;
    int heigh;
    String shape;

    public Rectangle(int width, int heigh){
        super(width, heigh);
        this.heigh = heigh;
        this.width = width;
        this.shape = "Rectangle";
    }

    public String toString(){
        return "This is a " +shape+ "wiht width as " +width +" and height as " +heigh;
    }
}
