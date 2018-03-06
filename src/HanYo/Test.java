package HanYo;

import com.sun.org.apache.xpath.internal.SourceTree;

import static HanYo.EnumUgedag.Mandag;

public class Test {

    public static void test1(Kurser kurser) {
        System.out.println("Hello world");

        Unge ung1 = new Unge("Mikkel", "Michael", 111111111);
        ung1.setAlder(13);
        ung1.setSkole("Sct. Jørgens");
        System.out.println(ung1.getForNavn());
        System.out.println(ung1.getAlder());


        Undervisere undervisere1 = new Undervisere("Erik", "Hansen", 12341234);
        undervisere1.seteMail("ErikHansen@mail.com");
        System.out.println(undervisere1.geteMail());
        System.out.println(undervisere1.getForNavn());


        Kurser kurser1 = new Kurser("TestAfKurser");
        kurser1.setKursusAldersKrav(13);
        kurser1.setMaxKursusDeltagere(25);
        System.out.println(kurser1.getKursusAldersKrav());
        System.out.println(kurser1.getMaxKursusDeltagere());


        Kurser kurser2 = new Kurser("Billedkunst", Mandag, "Henrik", "15", 25, 17, 30);
        Kurser kurser3 = new Kurser("Billedkunst2", Mandag, "Erik", "15", 25, 17, 30);
        kurser2.addUngTilKursus(ung1);
        kurser2.removeUngFraKursus(ung1);
        ung1.leaveKursus(ung1, kurser2);
        ung1.joinKursus(ung1, kurser1);
        ung1.joinKursus(ung1, kurser3);
        ung1.joinKursus(ung1, kurser2);
        System.out.println(kurser2.getKursusDag());
        System.out.println(kurser3.getKursusDag());





    }

}
