package monsters;

public class Witch extends Monster {
    public Witch(Weapons weaponAttacks, Integer eyes, String color, String name, Integer health) {
        super(weaponAttacks, eyes, color, name, health);
    }

    @Override
    public void move() {
        System.out.println("The Witch teleports with a potion!");
    }

    @Override
    public void superpower() {
        System.out.println("The Witch used its potions and turned you into a frog!");
    }
}
