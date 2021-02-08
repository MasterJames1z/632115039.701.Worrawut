package week10;

class Cube extends Rectangle {
    int width;
    int heigh;
    int length;
    String shape;

    public Cube(int width, int heigh, int length) {
        super(width, heigh);
        this.length = length;
        this.shape = "Cube";
    }

    public String toString(){
        return "This is a " +shape+ " with the side of " + length;
    }
}
