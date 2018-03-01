package HanYo;

public class Kurser {
    private String kursusNavn;
    private double mødeTidspunktTime;
    private double mødeTidspunktMinut;
    private String kursusDag;
    private double kursusAldersKrav;
    private int maxKursusDeltagere;
    private String underviser;
    public Kurser(String kursusNavn, double mødeTidspunktTime, double mødeTidspunktMinut, String kursusDag, double kursusAldersKrav, int maxKursusDeltagere, String underviser) {
        this.kursusNavn = kursusNavn;
        this.mødeTidspunktTime = mødeTidspunktTime;
        this.mødeTidspunktMinut = mødeTidspunktMinut;
        this.kursusDag = kursusDag;
        this.kursusAldersKrav = kursusAldersKrav;
        this.maxKursusDeltagere = maxKursusDeltagere;
        this.underviser = underviser;
    }

    public String getKursusNavn() {
        return kursusNavn;
    }

    public double getMødeTidspunktTime() {
        return mødeTidspunktTime;
    }

    public double getMødeTidspunktMinut() {
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
    //String kursusNavn, double mødeTidspunktTime, double mødeTidspunktMinut,
    // String kursusDag, String kursusAldersKrav, int maxKursusDeltagere, boolean underviserTilStede
    Kurser parkour = new Kurser("Parkour", 17, 15, "Mandag", 15, 20, "Henrik");



}
