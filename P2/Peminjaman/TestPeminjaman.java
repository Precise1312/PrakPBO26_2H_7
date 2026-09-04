package P2.Peminjaman;

public class TestPeminjaman {
    public static void main(String[] args) {
    Peminjaman member1 = new Peminjaman();
    member1.id = 100;
    member1.namaMember = "Sucipto";
    member1.namaGame = "how to ratatwang your panda";
    member1.hargaBarang = 30000;
    member1.lamaSewa = 5;
    member1.tampilData();
    int totalMember1 = member1.hitungTotal();
    System.out.println("total harga yang perlu dibayar adalah : " + totalMember1);
    
    Peminjaman member2 = new Peminjaman();
    member2.id = 101;
    member2.namaMember = "Seto Rawon";
    member2.namaGame = "Horeg Simulator";
    member2.hargaBarang = 10000;
    member2.lamaSewa = 100;
    member2.tampilData();
    int totalMember2 = member2.hitungTotal();
    System.out.println("total harga yang perlu dibayar adalah : " + totalMember2);
    }
}
