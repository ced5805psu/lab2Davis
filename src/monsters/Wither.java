package monsters;

public class Wither extends Monster {
    public Wither(Weapons weapons, SpecialPowers specialPowers,Integer eyes, String color, String name, Integer health) {
        super(weapons, specialPowers,eyes, color, name, health);
    }

    @Override
    public void move() {
        System.out.println("The Wither menacingly lumbers toward you!");
    }

    @Override
    public void superpower() {
        System.out.println("The Wither used its " + getSpecialPowers() + " and hit you with its " + getWeapons() + "!");
    }
}
