package week10;

class Cube extends Rectangle {
    int width;
    int heigh;
    int length;

    public Cube(int width, int heigh, int length) {
        super(width, heigh);
        this.length = length;
    }

    public String toString(){
        return "This is a cube with the side of " + length;
    }
}
