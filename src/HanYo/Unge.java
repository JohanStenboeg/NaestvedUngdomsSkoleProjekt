package HanYo;

import java.util.ArrayList;

public class Unge extends Bruger {

    private int alder;
    private String klasse;
    private String skole;
    ArrayList<Kurser> kursuses = new ArrayList<Kurser>();
    ArrayList<EnumUgedag> dageMedFagAL = new ArrayList<EnumUgedag>();

    public Unge(String forNavn, String efterNavn, int telefonnummer) {
        super(forNavn, efterNavn, telefonnummer);
    }

    public void joinKursus(Unge unge, Kurser kurser){
        if(kursuses.contains(kurser)) {
            System.out.println("Du er allerede tilmeldt dette fag og kan derfor ikke tilføjes igen");
        }else{
            if(dageMedFagAL.contains(kurser.getKursusDag())){
                System.out.println("Du er allerede tilmeldt et fag denne dag og kan derfor ikke tilføjes til endnu et kursus");
            }
            else{
                dageMedFagAL.add(EnumUgedag.Mandag);
                kursuses.add(kurser);
                kurser.addUngTilKursus(unge);
                System.out.println("Du er nu tilmeldt kursus " + kurser);
            }
        }
    }
    public void leaveKursus(Unge unge, Kurser kurser){
        if(kursuses.contains(kurser)) {
            kurser.removeUngFraKursus(unge);
            kursuses.remove(kurser);
            System.out.println("Du er nu frameldt kursus " + kurser);
        }else{
            System.out.println("Du er ikke tilmeldt dette kursus og kan derfor ikke frameldes fra det, fucking idiot");
        }
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

