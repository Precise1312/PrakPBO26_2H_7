package P10.Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    @Override 
    public void heal(){
        if(level == 1){
            health+=10;
        }
        else if(level == 2){
            health+=30;
        }
        else if(level == 3){
            health+=40;
        }
    }

    @Override 
    public void destroyed(){
        health -= (int)(health * 0.20);
    }

    public String getZombieInfo(){
        return "Walking Zombie Data\n" + super.getZombieInfo() + "\n";
    }

}
