package P1.Tugas;

public class AlatTulis {
    private String jenis;
    private String merk;

    public void setJenis (String jenisAlat){
        jenis = jenisAlat;
    }
    public void setMerk (String merkAlat){
        merk = merkAlat;
    }
    public void printInfo(){
        System.out.println("jenis : " + jenis);
        System.out.println("merk : " + merk);
    }
}
