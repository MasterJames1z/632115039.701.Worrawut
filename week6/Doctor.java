package week6;

public class Doctor extends Person {
    String genre2;
    public Doctor(String name, int age, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void Task(){
        System.out.println(name + " is job a " +genre2);
    }

    
}
