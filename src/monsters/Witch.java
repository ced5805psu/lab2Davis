package monsters;

public class Witch extends Monster {
    public Witch(Weapons weapons, SpecialPowers specialPowers, Integer eyes, String color, String name, Integer health) {
        super(weapons, specialPowers, eyes, color, name, health);
    }

    @Override
    public void move() {
        System.out.println("The Witch teleported with a potion!");
    }

    @Override
    public void superpower() {
        System.out.println("The Witch used its " + getSpecialPowers() + " and hit you with a " + getWeapons() + "!");
    }
}
