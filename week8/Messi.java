package week8;

public class Messi extends Person {
        String workState;
    
        public Messi(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
        }
    
        public void introduce(){
            super.introduce();
            System.out.println("I'm a football player and work in " +workState + ".");
        }
    }
    

