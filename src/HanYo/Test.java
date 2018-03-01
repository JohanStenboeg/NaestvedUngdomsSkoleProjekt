package HanYo;

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
    }

}
