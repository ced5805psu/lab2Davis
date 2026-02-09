/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Create a Parent Class and Child Classes that inherit methods and characteristics from the parent
 * Course: IST 242 Section 001
 * Author: Conner Davis
 * Date Developed: 2/8/2026
 * Last Date Changed: 2/9/2026
 * Rev: 2/9/2026

 */

package monsters;

public class Spider extends Monster {
    private Integer legs;
    public Spider(Weapons weapons, SpecialPowers specialPowers,Integer eyes, String color, String name, Integer health, Integer legs) {
        super(weapons, specialPowers,eyes, color, name, health);
        this.legs = legs;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    @Override
    public void move() {
        System.out.println("The Spider crawled up the wall!");
    }

    @Override
    public void superpower() {
        System.out.println("The spider used its " + getSpecialPowers() + " and hit you with its " + getWeapons() + "!");
    }
}
