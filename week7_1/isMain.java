public class isMain {
    public static void main(String[] args) {
        System.out.println("Normal bicycle: ");
        Bicycle bic = new Bicycle();
        bic.isCurrent();
        bic.isBreak();
        bic.isUp();
        bic.isCurrent();
        System.out.println("------------------------");

        System.out.println("Moutain bicycle: ");
        Mountain mou = new Mountain();
        mou.isCurrent();
        mou.isGear(2);
        mou.isBreak();
        mou.isGear(3);
        mou.isGear(4);
        mou.isGear(5);
        mou.isGear(6);
        mou.isGear(7);

    }

}
