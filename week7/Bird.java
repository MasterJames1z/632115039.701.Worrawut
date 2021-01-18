public class Bird extends Pet{
    
    public Bird(String type, String name, String specie, String color, int age){
        this.Age = age;
        this.Type = type;
        this.Color = color;
        this.Specie = specie;
        this.Name = name;
    }

    public void Speed(Double speed){   
        System.out.println("My brid "+Name+" is fly "+speed+ " mile/hr");
    }

    public void Contry(String contry,String said){
        System.out.println(contry+" he can said " +said);
    }

    public boolean Fly(String fly) {
        if (fly == "can"){
            System.out.println("Yes can fly");
        }else{
            System.out.println("No can't fly");
        }
        return false;
    }
}
