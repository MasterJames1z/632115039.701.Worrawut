public class Dog extends Pet{
    
    public Dog(String type, String name, String specie, String color, int age){
        this.Age = age;
        this.Type = type;
        this.Color = color;
        this.Specie = specie;
        this.Name = name;
    }

    public void Run(String run){   
        System.out.println("My dog "+Name+" is run "+run);
    }

    public void Bark(String size,String bark){
        System.out.println(size+" bark " +bark);
    }

    public boolean Hair(String hair) {
        if (hair == "short"){
            System.out.println("Short hair: true");
        }else{
            System.out.println("Short hair: false");
        }
        return false;
    }
}
