//Worawut Aunkham 632115039

package week6;

public class Gamer extends Person {
    String genre3;
    public Gamer(String name, int age, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void Task(){
        System.out.println(name + " is steaming in " +genre3 + " channel");
    }

    
}


