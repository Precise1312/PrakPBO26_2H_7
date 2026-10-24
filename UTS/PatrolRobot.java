package UTS;

public class PatrolRobot extends Robot{
    public Battery robotBattery;
    public PatrolRobot(String name, int cpuspeed, int power, Battery battery){
        super.name += name;
        this.CPUSpeed = cpuspeed;
        this.power = power;
        this.robotBattery = battery;
    }
    public void increasePower(){
        power += 20;
    }
}
