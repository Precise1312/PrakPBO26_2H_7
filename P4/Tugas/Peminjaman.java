package P4.Tugas;

public class Peminjaman {
    String tanggal;

    public Peminjaman(String tanggal){
    this.tanggal = tanggal;
    }

    public void infoPeminjaman(Anggota anggota){
        System.out.println("peminjaman tanggal " + tanggal + "oleh " + anggota.getNama());
    }
}
