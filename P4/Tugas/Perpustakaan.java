package P4.Tugas;

public class Perpustakaan {
    private String nama;
    private Buku buku;
    private Peminjaman peminjaman;

    public Perpustakaan(String nama, Buku buku){
        this.nama = nama;
        this.buku = buku;
        this.peminjaman = new Peminjaman("18/09/2026 ");
    }

    public void tampilInfo(){
        System.out.println("Nama Perpus: " + nama);
        System.out.println("Jenis Buku : " + buku.getJudul());
    }

    public void prosesPeminjaman(Anggota anggota){
        peminjaman.infoPeminjaman(anggota);
    }
}
