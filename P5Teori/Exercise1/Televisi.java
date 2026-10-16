package P5Teori.Exercise1;

public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi(){
    }

    public void switchChannel(int newChannel){
        channelAktif = newChannel;
    }

    public int getActiveChannel(){
        if (channelAktif == 0){
            channelAktif = 1;
        }
        return channelAktif;
    }
}
