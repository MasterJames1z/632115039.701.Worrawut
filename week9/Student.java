package week9;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";

    Student(String firstnam, String lastname){
        this.firstname = firstnam;
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        Student p = new Student("Hello","World");
        Student j = new Student("Worawut","Aunkham");
        System.out.println(p.toString());
        System.out.println(j.toString());
    }

    public String toString(){
        return "My first name " +firstname +" last name " +lastname;
    }

}