package P2.Peminjaman;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    private int hargaSewa;
    public int lamaSewa;
    public int hargaBarang;

    public void tampilData() {
        System.out.println();
        System.out.println("id            : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Harga Game    : " + hargaBarang);
        System.out.println("lama Sewa     : " + lamaSewa);
    }

    public int hitungTotal(){
        int hargaSewa = lamaSewa * hargaBarang;
        return hargaSewa;
    }
}
