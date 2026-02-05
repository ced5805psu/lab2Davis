package monsters;

public class Main {
    public static void main(String[] args) {
        Monster z1 = new Zombie(Weapons.SWORD, 2, "Green", "Guy Fieri");
        System.out.println("Mob 1: " + z1.getName());
        System.out.println(z1.getColor());
    }
}
