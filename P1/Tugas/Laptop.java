package P1.Tugas;

public class Laptop {
   private String Warna;
   private String merk;

    public void setJenis (String warnaLaptop){
        Warna = warnaLaptop;
    }
    public void setMerk (String merkAlat){
        merk = merkAlat;
    }
    public void printInfo(){
        System.out.println("warna : " + Warna);
        System.out.println("merk : " + merk);
    } 
}
