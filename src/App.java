public class App {
    public static void main(String[] args) {
        Client c = new Client();
        c.imieJakieosGoscia = "ABC";

        int i = c.add(5,7);

        System.out.println(i);

        int a = 6;
        int b = 6;

        Client c1 = new Client();
        c1.imieJakieosGoscia = "Mateusz";
        c1.surname = "Bereda";
        c1.pesel = 43534534;
        c1.age = 12;

        Client c2 = c1;

        /*Client c2 = new Client();
        c2.imieJakieosGoscia = "Mateusz";
        c2.surname = "Bereda";
        c2.pesel = 43534534;
        c2.age = 12;*/

        System.out.println(a == b);
        System.out.println(c1 == c2);

        String s1 = "ABC";
        String s2 = new String("ABC");

        System.out.println(s1.equals(s2));

        c1.surname = "jsahdgfsa";

        c1.surname = "jsahdgfsa";
        c1.surname = "jsahdgfsa";
        c1.surname = "jsahdgfsa";c1.surname = "jsahdgfsa";


    }
}
