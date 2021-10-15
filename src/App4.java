import java.util.ArrayList;
import java.util.LinkedList;

public class App4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(list.size());
        list.add(5);
        System.out.println(list.size());
        list.add(10);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println(list.get(0));

        list.remove(0);

        System.out.println(list);
    }
}
