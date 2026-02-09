package monsters;

public class Main {
    public static void main(String[] args) {
        Monster z1 = new Zombie(Weapons.SWORD, 2, "Green", "Guy", 100);
        Monster s1 = new Skeleton(Weapons.BOW, 0, "White", "Gordon", 80);
        Monster w1 = new Wither(Weapons.SWORD, 2, "Gray", "Gary", 200);
        Monster s2 = new Spider(Weapons.FANGS, 6, "Red", "Peter", 150);
        Monster w2 = new Witch(Weapons.POTIONS, 2, "Green", "Griselda", 110);

        System.out.println("Mob 1: " + z1.getName());
        System.out.println(z1.getColor());
        z1.move();
        z1.superpower();

        System.out.println("Mob 2: " + s1.getName());
        s1.move();
        s1.superpower();

        System.out.println("Mob 3: " + w1.getName());
        w1.move();
        w1.superpower();

        System.out.println("Mob 4: " + s2.getName());
        s2.move();
        s2.superpower();

        System.out.println("Mob 5: " + w2.getName());
        w2.move();
        w2.superpower();
    }
}
