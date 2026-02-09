package monsters;

public class Zombie extends Monster {
    public Zombie(Weapons weapons, SpecialPowers specialPowers,Integer eyes, String color, String name, Integer health) {
        super(weapons, specialPowers , eyes, color, name, health);
    }
    @Override
    public void move() {
        System.out.println("The Zombie sprinted towards you!");
    }
    @Override
    public void superpower() {
        System.out.println("The zombie used its " + getSpecialPowers() + " & hit you with its " + getWeapons() + "!");
    }
}
