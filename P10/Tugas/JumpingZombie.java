package P10.Tugas;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    @Override 
    public void heal(){
        if(level == 1){
            health+=30;
        }
        else if(level == 2){
            health+=40;
        }
        else if(level == 3){
            health+=50;
        }
    }

    @Override 
    public void destroyed(){
        health -= (int)(health * 0.10);
    }

    public String getZombieInfo(){
        return "Jumping Zombie Data\n" + super.getZombieInfo() + "\n";
    }
}
