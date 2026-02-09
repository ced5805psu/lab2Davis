package monsters;

public abstract class Monster {
    private Attacks attacks;
    private Integer eyes;
    private final String enemy;
    private String color;
    private String name;
    private Integer health;
    public Monster(Weapons weaponAttacks, Integer eyes, String color, String name, Integer health) {
        this.attacks = new Attacks(weaponAttacks);
        this.eyes = eyes;
        this.enemy = "human";
        this.color = color;
        this.name = name;
        this.health = health;
    }

    //Getters & Setters
    public Attacks getAttacks() {
        return attacks;
    }

    public void setAttacks(Attacks attacks) {
        this.attacks = attacks;
    }

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

    //Abstract
    public abstract void move();
    public abstract void superpower();
}
