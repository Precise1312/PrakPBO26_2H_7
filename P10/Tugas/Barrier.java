package P10.Tugas;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int Strength){
        this.strength = Strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    @Override 
    public void destroyed(){
        strength -= (strength * 0.10);
    }

    public String getBarierInfo(){
        return "Barrier Strength = " + strength;
    }
}
