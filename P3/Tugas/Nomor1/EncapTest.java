package P3.Tugas.Nomor1;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());

        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Yayo");
        encap2.setAge(25);

        System.out.println("Name : "+encap2.getName());
        System.out.println("Age : "+encap2.getAge());

         EncapDemo encap3 = new EncapDemo();
        encap3.setName("Hajid");
        encap3.setAge(17);

        System.out.println("Name : "+encap3.getName());
        System.out.println("Age : "+encap3.getAge());
    }
}
