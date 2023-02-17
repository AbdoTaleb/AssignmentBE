package no.JavaBE;

public class Main {

    public static void main(String[] args) {
//        Mage m = new Mage("abdmo");
//        System.out.println(m.name);
//        Weapon w = new Weapon("Common Axe", 1, "Axes", 2 );
//        //Weapon w = new Weapon();
//        System.out.println("Name " + w.getName() + " " + w.getRequiredLevel()
//               + " Slot " + w.slot + " Type " + w.weaponType + " damage " + w.getWeaponDamage());

        Mage hero = new Mage("my hero");
        HeroAttribute h = new HeroAttribute(1,0,0);
        //Weapon w2 = new Weapon("Common Axe2", 1, "Axes", 2 );

       Armor a =  new Armor("Common Cloth77", 1,
               "Body", "Cloth", h);

       hero.equip(a);
        System.out.println(a.getName() + " " + a.slot + " " + a.armorType +
                " " + a.ArmorAttribute.getStrength());


        //hero.equip(w);
        //hero.equip(w2);


    }
}