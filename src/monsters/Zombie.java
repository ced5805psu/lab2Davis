package monsters;

public class Zombie extends Monster {
    public Zombie(Weapons weaponAttacks, Integer eyes, String color, String name, Integer health) {
        super(weaponAttacks, eyes, color, name, health);
    }
    @Override
    public void move() {
        System.out.println("The zombie is sprinting at you!");
    }
    @Override
    public void superpower() {
        System.out.println("The zombie used its super strength & hit you!");
    }
}
