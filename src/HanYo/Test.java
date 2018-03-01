package HanYo;

public class Test {

    public static void test1(Kurser kurser) {
        System.out.println("Hello world");

        //String navn, int alder, String klasse, int telefonnummer, String skole
        Unge unge1 = new Unge(18, "3X", "JuleSkolen");
        System.out.println(unge1.getNavn());
        Undervisere u1 = new Undervisere();
        System.out.println(u1.getNavn());
    }

}
