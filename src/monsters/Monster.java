/** Project: Solo Lab2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Create a Parent Class and Child Classes that inherit methods and characteristics from the parent
 * Course: IST 242 Section 001
 * Author: Conner Davis
 * Date Developed: 2/8/2026
 * Last Date Changed: 2/9/2026
 * Rev:

 */

package monsters;

public abstract class Monster {
    private Weapons weapons;
    private Integer eyes;
    private final String enemy;
    private String color;
    private String name;
    private Integer health;
    private SpecialPowers specialPowers;
    public Monster(Weapons weapons, SpecialPowers specialPowers,Integer eyes, String color, String name, Integer health) {
        this.weapons = weapons;
        this.eyes = eyes;
        this.enemy = "human";
        this.color = color;
        this.name = name;
        this.health = health;
        this.specialPowers = specialPowers;
    }

    //Getters & Setters
    public Weapons getWeapons() {return weapons;}
    public void setWeapons(Weapons weapons) {this.weapons = weapons;}

    public Integer getEyes() {
        return eyes;
    }

    public void setEyes(Integer eyes) {
        this.eyes = eyes;
    }

    public String getEnemy() {
        return enemy;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getHealth() {
        return health;
    }
    public void setHealth(Integer health) {
        this.health = health;
    }
    public SpecialPowers getSpecialPowers() {return specialPowers;}
    public void setSpecialPowers(SpecialPowers specialPowers) {this.specialPowers = specialPowers;}

    //Abstract
    public abstract void move();
    public abstract void superpower();
}
