public class Fish extends Pet{
    public Fish(String type, String name, String specie, String place, int age){
        this.Age = age;
        this.Type = type;
        this.Color = place;
        this.Specie = specie;
        this.Name = name;
    }

    public void Run(double d){   
        System.out.println("My fish "+Name+" is speed "+d+" km/hr");
    }

    public void Swim(String size,String swim){
        System.out.println(size+" in the " +swim);
    }

    public boolean Place(String place) {
        if (place == "salt"){
            System.out.println("Salt water");
        }else{
            System.out.println("Fresh");
        }
        return false;
    }
}
