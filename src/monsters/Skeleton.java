/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Create a Parent Class and Child Classes that inherit methods and characteristics from the parent
 * Course: IST 242 Section 001
 * Author: Conner Davis
 * Date Developed: 2/8/2026
 * Last Date Changed: 2/9/2026
 * Rev:

 */

package monsters;

public class Skeleton extends Monster {
    public Skeleton(Weapons weapons, SpecialPowers specialPowers, Integer eyes, String color, String name, Integer health) {
        super(weapons, specialPowers, eyes, color, name, health);
    }

    public void move() {
        System.out.println("The Skeleton ran at you!");
    }
    public void superpower() {
        System.out.println("The skeleton used its " + getSpecialPowers() + " and hit you with its " + getWeapons() + "!");
    }
}
