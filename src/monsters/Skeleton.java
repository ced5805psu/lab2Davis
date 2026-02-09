/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Create a Parent Class and Child Classes that inherit methods and characteristics from the parent
 * Course: IST 242 Section 001
 * Author: Conner Davis
 * Date Developed: 2/8/2026
 * Last Date Changed: 2/9/2026
 * Rev: 2/9/2026

 */

package monsters;

public class Skeleton extends Monster {
    private Integer bones;
    public Skeleton(Weapons weapons, SpecialPowers specialPowers, Integer eyes, String color, String name, Integer health, Integer bones) {
        super(weapons, specialPowers, eyes, color, name, health);
        this.bones = bones;
    }

    public Integer getBones() {
        return bones;
    }

    public void setBones(Integer bones) {
        this.bones = bones;
    }
    @Override
    public void move() {
        System.out.println("The Skeleton ran at you!");
    }
    @Override
    public void superpower() {
        System.out.println("The skeleton used its " + getSpecialPowers() + " and hit you with its " + getWeapons() + "!");
    }
}
