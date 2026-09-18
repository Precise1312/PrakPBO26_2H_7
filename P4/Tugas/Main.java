package P4.Tugas;

public class Main {
    public static void main(String[] args) {
        Anggota A1 = new Anggota("Yayo");
        Buku B1 = new Buku("Islam Ala Prabowo");
        Perpustakaan P1 = new Perpustakaan("Perpustakaan Kota",B1);
        P1.tampilInfo();
        P1.prosesPeminjaman(A1);
    }
}
