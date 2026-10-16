package Quiz1;

public class Generator {
    private int Daya;
    private int Voltase;

    public Generator(int dy, int volt){
        Daya = dy;
        Voltase = volt;
    }

    public void setDaya(int dy){
        Daya = dy;
    }

    public void setVoltase(int volt){
        Voltase = volt;
    }

    public int getVoltase(){
        return Voltase;
    }

    public  int getDaya(){
        return Daya;
    }
}
