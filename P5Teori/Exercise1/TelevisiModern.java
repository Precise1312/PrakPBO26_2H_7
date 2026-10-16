package P5Teori.Exercise1;

public class TelevisiModern extends Televisi {
    private String displayMode;
    private String dvd;

    public TelevisiModern(String mrk, int channelCount){

    }

    public void changeDisplayMode(String mode){
        displayMode = mode;
    }

    public void playDVD(){
        if(dvd == null){
            dvd = "kosong";
        }
        System.out.println("Sedang memainkan DVD: "+ dvd);
    }

    public void insertDVD(String dvdTitle){
        dvd = dvdTitle;
    }
}
