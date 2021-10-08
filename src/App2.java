public class App2 {
    public static void main(String[] args) {
        Square square = new Square(5, 25, 20);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        square.setSide(6);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        square.setSide(6);

        square.setSide(6);

        square.setSide(6);

        Pet cat = new Cat();

        C c = new C();
        c.a();
    }
}
