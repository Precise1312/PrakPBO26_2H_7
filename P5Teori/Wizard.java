package P5Teori;

public class Wizard extends Character{
    protected int Spell;

    public Wizard (String name, int level, int health, int spell){
        Name = name;
        Level = level;
        Health = health;
        Spell = spell;
    }

    public void magic (Character target){
        target.Health -= 50;
        System.out.println("Berhasil menyerang musuh, spell sisa : " + Spell);
    }
}
