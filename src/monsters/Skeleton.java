package monsters;

public class Skeleton extends Monster {
    public Skeleton(Weapons weaponAttacks, Integer eyes, String color, String name, Integer health) {
        super(weaponAttacks, eyes, color, name, health);
    }

    public void move() {
        System.out.println("The skeleton ran at you!");
    }
    public void superpower() {
        System.out.println("The skeleton used its super speed and hit you!");
    }
}
