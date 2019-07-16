package OOP;

public class OOP3 {

    static OOP3 o = new OOP3();

    //加载顺序和成员变量顺序有关， 只加载运行一次
    static {
        System.out.println("static block");
    }

    {
        System.out.println("block");
    }

    public OOP3() {
        System.out.println("struct OOP3");
    }

    public static void main(String[] args) {

    }
}
