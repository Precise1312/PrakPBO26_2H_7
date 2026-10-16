package P5Teori;

public class Human extends Character {
    protected int Strength;

    public Human (String name, int level, int health, int strength){
        Name = name;
        Level = level;
        Health = health;
        Strength = strength;
    }

    public void specialAttack (Character target){
        target.Health -= 10 + Strength;
    }
}
