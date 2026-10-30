package P10.Tugas;

public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public abstract void heal();

    @Override 
    public abstract void destroyed();

    public String getZombieInfo(){
        return "Health: " + health + "\n level: " + level;
    }
}
