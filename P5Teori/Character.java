package P5Teori;

public class Character {
    protected String Name;
    protected int Level;
    protected int Health;

    public void attack (Character target){
        target.Health -= 10;
    }

    public void showStatus(){
        System.out.println();
        System.out.println("Name : " + Name);
        System.out.println("Level : " + Level);
        System.out.println("Health : " + Health);
    }
}
