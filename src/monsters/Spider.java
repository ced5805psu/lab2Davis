package monsters;

public class Spider extends Monster {
    public Spider(Weapons weaponAttacks, Integer eyes, String color, String name, Integer health) {
        super(weaponAttacks, eyes, color, name, health);
    }

    @Override
    public void move() {
        System.out.println("The spider crawled up the wall!");
    }

    @Override
    public void superpower() {
        System.out.println("The spider used its poisonous fangs and poisoned you!");
    }
}
