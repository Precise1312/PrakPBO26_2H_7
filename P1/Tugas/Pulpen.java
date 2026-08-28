package P1.Tugas;

public class Pulpen extends AlatTulis{
    private double width;

    public void setKetebalan(double width) {
    this.width = width; 
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Ketebalan Pulpen : " + width + " mm");
        System.out.println("Tipe Alat Tulis : Pulpen");
    }
}
