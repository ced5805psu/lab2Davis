package monsters;

public class Attacks {
    /**What does line 3 do, why do we need it?
     * Is it good practice to create multiple classes in one file?
     * What does Field weapons may be final mean? **/
    private Weapons weapons;
    public Attacks(Weapons weapons) {
        this.weapons = weapons;
    }
    public Weapons getWeapons() {
        return weapons;
    }
}
