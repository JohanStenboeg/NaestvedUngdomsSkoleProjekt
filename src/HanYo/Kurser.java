package HanYo;

public class Kurser {
    private String kursusNavn;
    private int mødeTidspunktTime;
    private int mødeTidspunktMinut;
    private String kursusDag;
    private double kursusAldersKrav;
    private int maxKursusDeltagere;
    private String underviser;
    private Unge[] = arrayUnge;
    


    public Kurser(String kursusNavn) {
        this.kursusNavn = kursusNavn;
        arrayUnge = new Unge[getMaxKursusDeltagere()];


    }

    public String getKursusNavn() {
        return kursusNavn;
    }

    public int getMødeTidspunktTime() {
        return mødeTidspunktTime;
    }

    public void setKursusNavn(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public void setMødeTidspunktTime(int mødeTidspunktTime) {
        this.mødeTidspunktTime = mødeTidspunktTime;
    }

    public void setMødeTidspunktMinut(int mødeTidspunktMinut) {
        this.mødeTidspunktMinut = mødeTidspunktMinut;
    }

    public void setKursusDag(String kursusDag) {
        this.kursusDag = kursusDag;
    }

    public void setKursusAldersKrav(double kursusAldersKrav) {
        this.kursusAldersKrav = kursusAldersKrav;
    }

    public void setMaxKursusDeltagere(int maxKursusDeltagere) {
        this.maxKursusDeltagere = maxKursusDeltagere;
    }

    public void setUnderviser(String underviser) {
        this.underviser = underviser;
    }

    public int getMødeTidspunktMinut() {
        return mødeTidspunktMinut;
    }

    public String getKursusDag() {
        return kursusDag;
    }

    public double getKursusAldersKrav() {
        return kursusAldersKrav;
    }

    public int getMaxKursusDeltagere() {
        return maxKursusDeltagere;
    }

    public String underviser() {
        return underviser;
    }



}
