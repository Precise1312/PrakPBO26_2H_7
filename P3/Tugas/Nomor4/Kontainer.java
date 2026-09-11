package P3.Tugas.Nomor4;

public class Kontainer {
    private String id;
    private  String namaPemilik;
    private int kapasitasMaks;
    private int beratMuatan;

    Kontainer(String id, String nama, int kapasitas){
        this.id = id;
        namaPemilik = nama;
        kapasitasMaks = kapasitas;
    }

    public String getNamaPemilik(){
        return namaPemilik;
    }

    public int getKapasitasMaksimal(){
        return kapasitasMaks;
    }

    public int getBeratMuatanSaatIni(){
        return beratMuatan;
    }

    public void tambahMuatan(int berat){
        if (kapasitasMaks >= (beratMuatan + berat)){
        beratMuatan += berat;
        }
        else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }
        
    }

    public void turunkanMuatan(int berat){
        if(berat < (beratMuatan/2)){
        beratMuatan -= berat;
        }
        else{
        System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        }
        
    }
}
