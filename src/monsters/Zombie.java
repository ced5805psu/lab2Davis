/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Create a Parent Class and Child Classes that inherit methods and characteristics from the parent
 * Course: IST 242 Section 001
 * Author: Conner Davis
 * Date Developed: 2/8/2026
 * Last Date Changed: 2/9/2026
 * Rev: 2/9/2026

 */

package monsters;

public class Zombie extends Monster {
    private Integer hoardSize;
    public Zombie(Weapons weapons, SpecialPowers specialPowers,Integer eyes, String color, String name, Integer health, Integer hoardSize) {
        super(weapons, specialPowers , eyes, color, name, health);
        this.hoardSize = hoardSize;
    }

    public Integer getHoardSize() {
        return hoardSize;
    }

    public void setHoardSize(Integer hoardSize) {
        this.hoardSize = hoardSize;
    }

    @Override
    public void move() {
        System.out.println("The Zombie sprinted towards you!");
    }
    @Override
    public void superpower() {
        System.out.println("The zombie used its " + getSpecialPowers() + " & hit you with its " + getWeapons() + "!");
    }
}
