package monsters;

public abstract class Monster {
    private Attacks attacks;
    private Integer eyes;
    private String enemy;
    private String color;
    public Monster(Weapons weaponAttacks, Integer eyes, String color) {
        this.attacks = new Attacks(weaponAttacks);
        this.eyes = eyes;
        this.enemy = "human";
        this.color = color;
    }

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
}
