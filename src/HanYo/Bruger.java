package HanYo;

public abstract class Bruger {
    private String navn;
    private String pass;
    private String eMail;
    private int telefonnummer;
    public Bruger(String navn, String pass, String eMail, int telefonnummer) {
        this.navn=navn;
        this.eMail=eMail;
        this.pass=pass;
        this.telefonnummer = telefonnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    
}
