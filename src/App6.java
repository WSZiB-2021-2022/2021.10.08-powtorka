import java.util.HashMap;
import java.util.Map;

public class App6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(87243658, "Mateusz");
        map.put(9873659, "Janusz");

        System.out.println(map);

        System.out.println(map.get(87243658));

        Map<String, String> properties = new HashMap<>();

        properties.put("serverDb", "123.123.123.123");
        properties.put("serverApp1", "123.123.123.123");
        properties.put("serverApp2", "123.123.123.123");

        System.out.println(properties.get("serverDb"));

        Client client = new Client();

        System.out.println(client);

        client.equals(new Client());

        client.hashCode();
    }
}
