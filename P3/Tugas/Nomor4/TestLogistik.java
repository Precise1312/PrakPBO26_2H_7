package P3.Tugas.Nomor4;

import java.util.Scanner;;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        while (true) {
        System.out.println();
        System.out.println("Masukkan nomor menu");
        System.out.println("1. Tambah Muatan");
        System.out.println("2. kurang Muatan");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("masukkan jumlah tambah muatan");
                int tambah = sc.nextInt();
                System.out.println("\nMemasukkan muatan baru seberat "+tambah+" ...");
                kontainerAlfa.tambahMuatan(tambah);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                break;

            case 2:
                System.out.println("masukkan jumlah kurang muatan");
                int kurang = sc.nextInt();
                System.out.println("\nmengurangi muatan seberat "+kurang+" ...");
                kontainerAlfa.turunkanMuatan(kurang);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                break;
            
            default:
                System.out.println("nomor invalid");
                break;
        }
        }
        
    }
}
