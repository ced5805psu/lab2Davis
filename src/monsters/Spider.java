package monsters;

public class Spider extends Monster {
    public Spider(Weapons weapons, SpecialPowers specialPowers,Integer eyes, String color, String name, Integer health) {
        super(weapons, specialPowers,eyes, color, name, health);
    }

    @Override
    public void move() {
        System.out.println("The Spider crawled up the wall!");
    }

    @Override
    public void superpower() {
        System.out.println("The spider used its " + getSpecialPowers() + " and hit you with its " + getWeapons() + "!");
    }
}
