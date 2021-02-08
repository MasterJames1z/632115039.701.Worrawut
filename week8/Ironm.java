package week8;

public class Ironm extends Person {
    String workState;

    public Ironm(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a ironman and work in " + workState + ".");
    }
}
