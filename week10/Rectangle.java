class Rectangle extends Shape{
    int width;
    int heigh;

    public Rectangle(int width, int heigh){
        super(width, heigh);
        this.width = width;
        this.heigh = heigh;
    }

    public String toString(){
        return "This is a rectangle wiht width as " +width +" and height as " +heigh;
    }
}
