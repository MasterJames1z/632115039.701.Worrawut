public class Bicycle {
    int spped;

    public Bicycle() {
        this.spped = 10;
    }
    
    public void isCurrent() {
        if (this.spped <= 99) {
            System.out.println("Start speed is " + spped);
        } else {
            System.err.println("Over speed!!");
        }
    }

    public int isBreak() {
        this.spped -= 5;
        System.out.println("Break!!");
        System.out.println("Current speed is " + spped);
        return spped;
    }

    public int isUp() {
        this.spped += 5;
        System.out.println("Boost speed!!");
        System.err.println("Current speed is " + spped);
        return spped;
    }

}