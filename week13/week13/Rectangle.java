package week13;
//Worawut Aunkham SID 632115039

public class Rectangle extends Shape {
    double width;
    double height;
    double area;

    Rectangle(){
        super();
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void cal() {  
        area = width*height;
        System.out.println("Rectangle : " +area);
    }
}

