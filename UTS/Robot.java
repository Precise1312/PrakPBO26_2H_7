package UTS;

public class Robot {
    public String name = "PATROL<07> ";
    public int CPUSpeed;
    public int power;



    public void increasePower(){
        this.power += 10;
    }
    public void reducePower(){
        this.power -= 10;
    }
}
