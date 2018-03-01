package HanYo;

public class Undervisere extends Bruger {
    private String eMail;

    public Undervisere(String forNavn, String efterNavn, int telefonnummer) {
        super(forNavn, efterNavn, telefonnummer);
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
