package week8;

class Tech extends Person {
    
        String workState;
    
        public Tech(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
        }
    
        public void introduce(){
            super.introduce();
            System.out.println("I'm a techer and work in " +workState + ".");
        }
    
}
