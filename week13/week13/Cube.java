package week13;
//Worawut Aunkham SID 632115039

public class Cube extends Shape {
    double width;
    double height;
    double area;

    Cube(){
        super();
    }
    
    Cube(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void cal() {
        area = width*height;   
        System.out.println("Cube : " +area);
    }
}