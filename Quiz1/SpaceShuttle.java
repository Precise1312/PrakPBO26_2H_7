package Quiz1;

public class SpaceShuttle {
    private String Kode;
    private int Berat;
    private Roket RoketUtama;
    private Generator GeneratorUtama;

    public SpaceShuttle(String kd, int brt, Roket rkt, Generator gnt){
        Kode = kd;
        Berat = brt;
        RoketUtama = rkt;
        GeneratorUtama = gnt;
    }

    public void setKode(String kd){
        Kode = kd;
    }

    public void  setBerat(int brt){
        Berat = brt;
    }

    public void setRoket(Roket rkt){
        RoketUtama = rkt;
    }

    public void setGenerator(Generator gnrt){
        GeneratorUtama = gnrt;
    }

    public String getKode(){
        return Kode;
    }

    public int getBerat(){
        return Berat;
    }

    public Roket getRoketUtama(){
        return RoketUtama;
    }

    public Generator getGeneratorUtama(){
        return GeneratorUtama;
    }
}
