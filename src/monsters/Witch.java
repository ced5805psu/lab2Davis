/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Create a Parent Class and Child Classes that inherit methods and characteristics from the parent
 * Course: IST 242 Section 001
 * Author: Conner Davis
 * Date Developed: 2/8/2026
 * Last Date Changed: 2/9/2026
 * Rev: 2/9/2026

 */

package monsters;

public class Witch extends Monster {
    private Integer numPotions;
    public Witch(Weapons weapons, SpecialPowers specialPowers, Integer eyes, String color, String name, Integer health, Integer numPotions) {
        super(weapons, specialPowers, eyes, color, name, health);
        this.numPotions = numPotions;
    }

    public Integer getNumPotions() {
        return numPotions;
    }

    public void setNumPotions(Integer numPotions) {
        this.numPotions = numPotions;
    }

    @Override
    public void move() {
        System.out.println("The Witch teleported with a potion!");
    }

    @Override
    public void superpower() {
        System.out.println("The Witch used its " + getSpecialPowers() + " and hit you with its " + getWeapons() + "!");
    }
}
