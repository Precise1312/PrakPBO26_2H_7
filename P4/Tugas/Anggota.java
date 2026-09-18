package P4.Tugas;

public class Anggota {
    private String nama;
    public Anggota (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void tampilNama(){
        System.out.println("Nama Anggota: "+nama);
    }
}
