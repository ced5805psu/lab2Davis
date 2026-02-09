package monsters;

public class Skeleton extends Monster {
    public Skeleton(Weapons weapons, SpecialPowers specialPowers, Integer eyes, String color, String name, Integer health) {
        super(weapons, specialPowers, eyes, color, name, health);
    }

    public void move() {
        System.out.println("The Skeleton ran at you!");
    }
    public void superpower() {
        System.out.println("The skeleton used its " + getSpecialPowers() + " and hit you with its " + getWeapons() + "!");
    }
}
