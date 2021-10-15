import java.util.*;

public class App5 {
    public static void main(String[] args) {
        List<String> set = new Vector<>();

        set.add("Janusz");
        set.add("Karol");
        set.add("Andrzej");
        set.add("Bartek");

        System.out.println(set);

        set.add("Janusz");

        System.out.println(set);

        for(String element : set) {
            System.out.println(element);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        cos1(set);

        cos2(set);

        cos3(set);

        cos4(set);
    }

    public static void cos1(List<String> list) {
        //???
    }

    public static void cos2(List<String> list) {
        //???
    }

    public static void cos3(List<String> list) {
        //???
    }

    public static void cos4(List<String> list) {
        //???
    }
}
