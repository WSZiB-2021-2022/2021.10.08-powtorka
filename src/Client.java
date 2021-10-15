public class Client {
    public String imieJakieosGoscia;
    String surname;
    int age;
    long pesel;

    int add(int a, int b) {
        return a+b;
    }

    void a() {
        return;
    }

    @Override
    public String toString() {
        return "Client{" +
                "imieJakieosGoscia='" + imieJakieosGoscia + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Client)) {
            return false;
        }
        return this.pesel == ((Client) obj).pesel;
    }
}
