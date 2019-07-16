package OOP;

public class StaticTest {

    private static StaticTest st = new StaticTest();

    static {
        System.out.println("static block");
    }

    public StaticTest() {
        System.out.println("struct");
    }

    public static void main(String[] args) {
        new StaticTest();

    }

}
