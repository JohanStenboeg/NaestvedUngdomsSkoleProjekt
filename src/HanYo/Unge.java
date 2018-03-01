package HanYo;

public class Unge {
    private String navn;
    private int alder;
    private String klasse;
    private int telefonnummer;
    private String skole;

    public Unge(String navn, int alder, String klasse, int telefonnummer, String skole) {
        this.navn = navn;
        this.alder = alder;
        this.klasse = klasse;
        this.telefonnummer = telefonnummer;
        this.skole = skole;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public String getKlasse() {
        return klasse;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public String getSkole() {
        return skole;
    }
}

