package HanYo;


public abstract class Bruger {

    private String forNavn;
    private String efterNavn;
    private String kodeOrd;
    private int telefonnummer;

    public Bruger(){

    }
    public Bruger(String forNavn, String efterNavn, int telefonnummer) {
        this.forNavn = forNavn;
        this.efterNavn = efterNavn;
        this.kodeOrd = kodeOrd;
        this.telefonnummer = telefonnummer;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    public void setEfterNavn(String efterNavn) {
        this.efterNavn = efterNavn;
    }

    public String getForNavn() {
        return forNavn;
    }

    public void setForNavn(String forNavn) {
        this.forNavn = forNavn;
    }

    public String getKodeOrd() {
        return kodeOrd;
    }

    public void setKodeOrd(String kodeOrd) {
        this.kodeOrd = kodeOrd;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    
}
