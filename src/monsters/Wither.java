package monsters;

public class Wither extends Monster {
    public Wither(Weapons weaponAttacks, Integer eyes, String color, String name, Integer health) {
        super(weaponAttacks, eyes, color, name, health);
    }

    @Override
    public void move() {
        System.out.println("The wither slowly stumbles around!");
    }

    @Override
    public void superpower() {
        System.out.println("The Wither used its super strength and hit you!");
    }
}
