package HanYo;

public class Undervisere {
    private String navn;
    private int telefonnummer;
    private String email;


    public Undervisere(String navn, int telefonnummer, String email) {
        this.navn = navn;
        this.telefonnummer = telefonnummer;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public String getEmail() {
        return email;
    }
}
