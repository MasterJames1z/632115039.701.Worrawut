//Worawut Aunkham 632115039

/* package week7; */

public class Pet {
    String Type;
    String Name;
    String Specie;
    String Color;
    int Age;

    public Pet(){
    }

    public Pet(String type, String name, String specie, String color, int age){
        this.Age = age;
        this.Type = type;
        this.Color = color;
        this.Specie = specie;
        this.Name = name;
    }

    public void isMain(){
        System.out.println("My " +Type);
        System.out.println("Name: "+Name+" Species: "+Specie+" Color: "+Color+" Age: "+Age );
    }
}