package P1.Tugas;

public class TugasDemo {
    public static void main(String[] args) {
        Pensil pensil1 = new Pensil();
        Pulpen pulpen1 = new Pulpen();
        Laptop laptop1 = new Laptop();
        Tas tas1 = new Tas();

        pensil1.setJenis("pensil");
        pensil1.setMerk("Staedler");
        pensil1.setTipePensil("2B");
        pensil1.printInfo();

        pulpen1.setJenis("pulpen");
        pulpen1.setMerk("Sarasa");
        pulpen1.setKetebalan(0.5);
        pulpen1.printInfo();

        laptop1.setJenis("Abu - abu");
        laptop1.setMerk("Acer");
        laptop1.printInfo();

        tas1.setJenis("Tas Kerja");
        tas1.setMerk("Eiger");
        tas1.printInfo();


    }
}
