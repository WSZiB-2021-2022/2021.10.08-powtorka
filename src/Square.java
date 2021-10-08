class Square {
    private int side;
    private int field;
    private int circuit;


    public Square(int side, int field, int circuit) {
        this(side);
        this.circuit = circuit;
    }

    private Square(int side) {
        this.side = side;
    }

    private Square(double field) {
        this.field = (int) field;
    }

    int getSide() {
        return side;
    }

    public int getField() {
        return field;
    }

    public int getCircuit() {
        return circuit;
    }

    void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }
}
