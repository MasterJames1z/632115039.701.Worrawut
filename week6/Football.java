package week6;

public class Football extends Person {
    String genre4;
    public Football(String name, int age, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void Task(){
        System.out.println(name + " is football player at " +genre4);
    }

    
}