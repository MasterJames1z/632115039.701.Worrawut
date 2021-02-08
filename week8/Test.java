package week8;

public class Test {
    public static void main(String[] args) {
        Person person1;
        Person person2;
        Person person3;
        Person person4;
        Person person5;
        Person person6;

        person1 = new Person("Mark", 2001);
        person2 = new Sheriff("Meteo", 1988,"Callifornia");
        person3 = new Tech("Ball", 1977, "CMU");
        person4 = new Tu("Tu", 1954, "Thailand");
        person5 = new Messi("Messi", 1987, "Bacelona football club");
        person6 = new Ironm("Tony", 1985, "Avengers");

        person1.introduce();
        person2.introduce();
        person3.introduce();
        person4.introduce();
        person5.introduce();
        person6.introduce();
    }
    
}
