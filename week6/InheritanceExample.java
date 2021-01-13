package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20, "Male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        Doctor doc = new Doctor("James", 28, "Male");
        doc.genre2 = "doctor";
        doc.introduce();
        doc.Task();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        Gamer gam =  new Gamer("HRK", 24, "Male");
        gam.genre3 = "HRK";
        gam.introduce();
        gam.Task();
        System.out.println("- - - - - - - - - - - - - - - - - -");
        
        Football foo = new Football("Bruno", 28, "Male");
        foo.genre4 = "Manu";
        foo.introduce();
        foo.Task();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        Business bue = new Business("Yit", 22, "Female");
        bue.genre5 = "Business women";
        bue.introduce();
        bue.Task();
        System.out.println("- - - - - - - - - - - - - - - - - -");

        Youtuber you = new Youtuber("Kimmy", 19, "Female");
        you.genre6 = "Kitty kimmy";
        you.introduce();
        you.Task();
        System.out.println("- - - - - - - - - - - - - - - - - -");
    }
    
}
