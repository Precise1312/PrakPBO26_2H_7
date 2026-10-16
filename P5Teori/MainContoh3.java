package P5Teori;

public class MainContoh3 {
    public static void main(String[] args) {
        Angel esther = new Angel("Esther", 10, 100, 5);
        Human jackal = new Human("Jackal", 13, 100, 7);
        Wizard quistis = new Wizard("Quistis", 20, 100, 3);

        System.out.println("Begin Game...");

        esther.showStatus();
        jackal.showStatus();
        quistis.showStatus();

        System.out.println("Jackal special attack to quistis, " + "\nesther cure jackal, " + "quistis attack esther...");

        jackal.specialAttack(quistis);
        quistis.magic(jackal);
        esther.cure(jackal);
        quistis.attack(esther);

        esther.showStatus();
        jackal.showStatus();
        quistis.showStatus();
    }
}
