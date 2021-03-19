package week13;
//Worawut Aunkham SID 632115039

public class rhombus extends Shape {
    double width;
    double height;
    double area;

    rhombus(){
        super();
    }

    rhombus(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void cal() {  
        area = width*height;
        System.out.println("Rhombus : " +area);
    }
}

