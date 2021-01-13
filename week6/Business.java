//Worawut Aunkham 632115039

package week6;

public class Business extends Person {
    String genre5;

    public Business(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void Task() {
        System.out.println(name + " is a big " + genre5);
    }

}
