package P2.Lingkaran;

public class TestLingkaran {
    public static void main(String[] args) {
      Lingkaran bangun1 = new Lingkaran();
      bangun1.r = 10;
      double luasBangun1 = bangun1.hitungLuas();  
      double kelilingBangun1 = bangun1.hitungKeliling();
      System.out.println();
      System.out.println("Luas Bangun1 adalah      : "+luasBangun1);
      System.out.println("Keliling Bangun1 adalah : "+ kelilingBangun1);

      Lingkaran bangun2 = new Lingkaran();
      bangun2.r = 5;
      double luasBangun2 = bangun2.hitungLuas();  
      double kelilingBangun2 = bangun2.hitungKeliling();
      System.out.println();
      System.out.println("Luas Bangun2 adalah      : "+luasBangun2);
      System.out.println("Keliling Bangun2 adalah : "+ kelilingBangun2);
    }
    }

