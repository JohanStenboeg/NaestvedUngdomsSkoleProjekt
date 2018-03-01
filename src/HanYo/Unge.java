package HanYo;

public class Unge extends Bruger {
    private int alder;
    private String klasse;
    private String skole;


    public Unge(int alder, String klasse, String skole) {
        super("Johan", "12345", "johan@email.com", 55443322);
        this.alder = alder;
        this.klasse = klasse;
        this.skole = skole;

    }
}

