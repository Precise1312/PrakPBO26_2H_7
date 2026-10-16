package P7.Latihan1;

public class perkalianKu {
        void perkalian(int a, int b) {
            System.out.println(a * b);
        }

        void perkalian(int a, int b, int c) {
            System.out.println(a * b * c);
        }

        public static void main(String args[]) {
            perkalianKu objek = new perkalianKu();

            objek.perkalian(25, 43);
            objek.perkalian(34, 23, 56);
    }
}
