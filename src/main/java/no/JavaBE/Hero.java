package no.JavaBE;

public abstract class Hero {
    String name;
    int level;
    HeroAttribute LevelAttribtues = new HeroAttribute();
    String[] Equipment;

    String[] ValidWeaponTypes;
    String[] ValidArmorTypes;

    abstract void LevelUp();
}
