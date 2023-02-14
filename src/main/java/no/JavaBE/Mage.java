package no.JavaBE;

public class Mage extends Hero{
    public Mage(String name) {
        super();
        this.name = name;
        this.LevelAttribtues.setStrength(1);
        this.LevelAttribtues.setDexterity(1);
        this.LevelAttribtues.setIntelligence(8);
        this.ValidWeaponTypes = new String[]{"Staff", "Wand"};
        this.ValidArmorTypes = new String[]{"Cloth"};
    }
    @Override
    void LevelUp() {
        this.level++;
        this.LevelAttribtues.setStrength(this.LevelAttribtues.getStrength() + 1);
        this.LevelAttribtues.setDexterity(this.LevelAttribtues.getDexterity() + 1);
        this.LevelAttribtues.setIntelligence(this.LevelAttribtues.getIntelligence() + 5);

    }

}
