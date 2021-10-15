import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App3 {
    public static void main(String[] args) {
        final int a = 5;

        final Cat cat = new Cat();

        cat.name = "Kajtek";

        cat.name = "Janusz";

        //Gui.showCos();
        Gui.a = 5;

        Gui gui = new Gui();
        Gui gui2 = new Gui();

        System.out.println(gui.a);
        System.out.println(gui2.a);

        gui.a = 6;

        System.out.println(gui.a);
        System.out.println(gui2.a);

        Cos cos = new Cos();
        cos.showCos();

        int q = 5;
        Integer q2;

        q2 = q;

    }
}
