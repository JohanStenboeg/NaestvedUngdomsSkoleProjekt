package HanYo;

import java.util.ArrayList;

public class Kurser {
    private String kursusNavn;
    private int mødeTidspunktTime;
    private int mødeTidspunktMinut;
    private EnumUgedag kursusDag;
    private String kursusAldersKrav;
    private int maxKursusDeltagere;
    private String underviser;
    ArrayList<Unge> ungePaaKursusAL = new ArrayList<Unge>();



    public Kurser(String kursusNavn) {
        this.kursusNavn = kursusNavn;
        System.out.println("Kursus:" + kursusNavn + " er oprettet.");

    }



    public Kurser(String kursusNavn, EnumUgedag kursusDag, String underviser, String kursusAldersKrav, int maxKursusDeltagere, int mødeTidspunktTime, int mødeTidspunktMinut) {
        this.kursusNavn = kursusNavn;

        this.underviser = underviser;
        this.kursusAldersKrav = kursusAldersKrav;
        this.maxKursusDeltagere = maxKursusDeltagere;
        this.mødeTidspunktTime = mødeTidspunktTime;
        this.mødeTidspunktMinut = mødeTidspunktMinut;
        System.out.println("Kursus: " + kursusNavn + " Dag: " + kursusDag + " Underviser: " + underviser + " Alderskrav: " + kursusAldersKrav + " Max deltagere: " + maxKursusDeltagere + " Mødetidspunkt: " + mødeTidspunktTime + ":" + mødeTidspunktMinut + " Oprettet.");
    }

    void addUngTilKursus(Unge unge){
        ungePaaKursusAL.add(unge);
        System.out.println("Ung tilføjet til kursus");
    }

    void removeUngFraKursus (Unge unge){
        ungePaaKursusAL.remove(unge);
        System.out.println("Ung fjernet fra kursus");
    }
    public void getKursusDag() {
    }

    public void setKursusDag(EnumUgedag kursusDag) {
        this.kursusDag = kursusDag;
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

    public void setKursusAldersKrav(double kursusAldersKrav) {
        this.kursusAldersKrav = "Kursus alderskrav sat til:" + kursusAldersKrav;
    }

    public void setMaxKursusDeltagere(int maxKursusDeltagere) {
        this.maxKursusDeltagere = maxKursusDeltagere;
    }

    public void setUnderviser(String underviser) {
        this.underviser = "Underviser for dette kursus er: " + underviser;
    }

    public int getMødeTidspunktMinut() {
        return mødeTidspunktMinut;
    }

    public String getKursusAldersKrav() {
        return kursusAldersKrav;
    }

    public int getMaxKursusDeltagere() {
        return maxKursusDeltagere;
    }

    public String underviser() {
        return underviser;
    }



}
