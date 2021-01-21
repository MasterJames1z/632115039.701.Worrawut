public class Mountain extends Bicycle{
    int spped;
    public Mountain() {
    }

    public void isCurrent(){
        System.out.println(spped);
    }

    public int isBreak(){
        this.spped -= 5;
        System.out.println("Break!!");
        System.out.println("Current speed is "+spped);
        return spped;
    }
    
    public int isUp() {
        this.spped += 5;
        System.out.println("Boost speed!!");
        System.err.println("Current speed is " + spped);
        return spped;
    }

    public int isGear(int Gear){
       this.spped = spped + (Gear * 5);
       System.out.println("Get Gear " +Gear);
       if(spped >= 99){
            System.out.println("Over control!! Because at now speed is " +spped+ " over 100 km/hr");
        }else{
            System.out.println("Current speed is "+spped);
        }
     return spped;
    }

}
