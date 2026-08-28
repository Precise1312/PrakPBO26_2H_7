package P1.Tugas;

public class Tas {
    private String jenis;
    private String merk;

    public void setJenis (String jenisTas){
        jenis = jenisTas;
    }
    public void setMerk (String merkTas){
        merk = merkTas;
    }
    public void printInfo(){
        System.out.println("jenis : " + jenis);
        System.out.println("merk : " + merk);
    }
}
