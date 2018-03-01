package HanYo;

public class Test {

    public static void test1(Kurser kurser) {
        System.out.println("Hello world");

        //String navn, int alder, String klasse, int telefonnummer, String skole
        Unge unge1 = new Unge("Mikkel", 16, "3X", 11223344,"Sct. Jørgens Skole");
        System.out.println(unge1.getAlder());
        System.out.println(unge1.getNavn());
        //String navn, int telefonnummer, String email
        Undervisere underviser1 = new Undervisere("Henrik", 22112211, "HenrikUnderviser@email.com");
        System.out.println(underviser1.getEmail());
        System.out.println(underviser1.getNavn());
        Kurser parkour = new Kurser("Parkour", 17, 15, "Mandag", 15, 20, "Henrik");
        System.out.println(parkour.getKursusAldersKrav());
        System.out.println(parkour.getKursusNavn());
    }

}
