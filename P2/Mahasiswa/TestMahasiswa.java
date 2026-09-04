package P2.Mahasiswa;

public class TestMahasiswa {
    public static void main (String args[]){
        Mahasiswa mhs1=new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Testari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2=new Mahasiswa();
        mhs2.nim=102;
        mhs2.nama="Yayo";
        mhs2.alamat="Jl. Perusahaan No 1";
        mhs2.kelas="2H";
        mhs2.tampilBiodata();

        Mahasiswa mhs3=new Mahasiswa();
        mhs3.nim=103;
        mhs3.nama="Lembah";
        mhs3.alamat="Jl. Cakalang";
        mhs3.kelas="2H";
        mhs3.tampilBiodata();
    }
}