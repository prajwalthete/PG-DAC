package practicequestions;

public enum Enums {

    A, B, C,D;
    private Enums() {
        System.out.println(10);
    }

    public static void main(String[] args) {
        Enums en = Enums.B;
    }
}
