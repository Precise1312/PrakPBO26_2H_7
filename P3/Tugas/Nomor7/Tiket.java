package P3.Tugas.Nomor7;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    Tiket(String judul, double harga) {
        judulFilm = judul;
        if (harga < 0) {
            hargaDasar = 35000;
        } else {
            hargaDasar = harga;
        }

        statusPembayaran = false;
    }

    public boolean isStatusPembayaran(){
        return statusPembayaran;
    }

    public void lakukanPembayaran(){
    statusPembayaran = true;
    }

    public String getJudulFilm(){
        return judulFilm;
    }

    public double getHargaDasar(){
        return hargaDasar;
    }
}
