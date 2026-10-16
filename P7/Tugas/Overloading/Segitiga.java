package P7.Tugas.Overloading;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180-(sudutA - sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling;
        return keliling = sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB){
        double c =  Math.sqrt((sisiA*sisiA) + (sisiB*sisiB));
        return c + sisiA + sisiB;
    }
}
