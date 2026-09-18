package P4.Tugas;

public class Buku {
    private String judul;
    
    public Buku(String judul){
        this.judul = judul;
    }

    public void tampilInfo(){
        System.out.println("Judul: " + judul);
    }

    public String getJudul(){
        return judul;
    }
}
