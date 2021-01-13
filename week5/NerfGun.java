//Worawut Aunkham 632115039

package week5;

public class NerfGun {
    int ammo = 0;
    static int gunID = 0;

    NerfGun(int j) {
        ammo = j;
        gunID++;
    }

    public NerfGun() {
        gunID++;
    }

    public void fire() {
        if (ammo >= 1) {
            ammo--;
            System.out.println("BANG !!!");
        }
        if (ammo == 0) {
            System.out.println("There is no ammo");
        }
    }

    public void reload(int ammu) {
        if (ammo <= 15) {
            ammo += ammu;
        }
        if (ammo > 15) {
            System.out.println("Error!! the ammo is overload");
            ammo -= ammu;
        }
    }

    public void displayNumOfAmmunition() {
        System.err.println(ammo + " bullet left");
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + gunID);

    }

}