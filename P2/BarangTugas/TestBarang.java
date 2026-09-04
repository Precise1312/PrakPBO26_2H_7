package P2.BarangTugas;

public class TestBarang {
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.kode = "A1";
        barang1.namaBarang = "Handphone";
        barang1.hargaDasar = 15000000;
        barang1.diskon = 30f;
        barang1.tampilData();

        Barang barang2 = new Barang();
        barang2.kode = "A2";
        barang2.namaBarang = "Televisi";
        barang2.hargaDasar = 300000;
        barang2.diskon = 10f;
        barang2.tampilData();
    }
}
