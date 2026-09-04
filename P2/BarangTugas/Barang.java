package P2.BarangTugas;

public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    int hitungHargaJual(){
        return (int)(hargaDasar - ((diskon/100) * hargaDasar));
    }

    void tampilData(){
        System.out.println();
        System.out.println ("kode            : "+kode);
        System.out.println ("nama Barang     : "+namaBarang);
        System.out.println ("harga dasar     : Rp "+hargaDasar);
        System.out.println ("diskon          : "+diskon + " %");
        int hargaJual = hitungHargaJual();
        System.out.println("Harga jual barang adalah : Rp " + hargaJual);
        
    }
}
