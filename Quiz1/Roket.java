package Quiz1;

public class Roket {
    private String Tipe;
    private int Power;

    public Roket (String tipe, int pwr){
        Tipe = tipe;
        Power = pwr;
    }

    public void setTipe(String tipe){
        Tipe = tipe;
    }

    public void setPower(int power){
        Power = power;
    }

    public String getTipe(){
        return Tipe;
    }

    public int getPower(){
        return Power;
    }
}
