package P1.Tugas;

public class Pensil extends AlatTulis{
    private String Tipe;

    public void setTipePensil(String TipePensil) {
    Tipe = TipePensil; 
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tipe Pensil : " + Tipe);
        System.out.println("Tipe Alat Tulis : Pensil");
    }
}
