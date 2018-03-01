package HanYo;

public class Unge extends Bruger {

    private int alder;
    private String klasse;
    private String skole;

    public Unge(String forNavn, String efterNavn, int telefonnummer) {
        super(forNavn, efterNavn, telefonnummer);
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public String getSkole() {
        return skole;
    }

    public void setSkole(String skole) {
        this.skole = skole;
    }
}

