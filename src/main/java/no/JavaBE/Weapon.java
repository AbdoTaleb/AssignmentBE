package no.JavaBE;

public class Weapon {
    private String weaponType;
    private int WeaponDamage;

    public Weapon(String weaponType, int weaponDamage) {
        super();

        this.weaponType = weaponType;
        this.WeaponDamage = weaponDamage;
    }

    enum WeaponType{
        Axes,
        Bows,
        Daggers,
        Hammers,
        Staffs,
        Swords,
        Wands

    }
}
