package OOP;

public class OOP4 {

    //加载顺序和成员变量顺序有关， 只加载运行一次
    static {
        System.out.println("static block");
    }

    {
        System.out.println("block");
    }

    static OOP4 o = new OOP4();

    public OOP4() {
        System.out.println("struct OOP4");
    }

    public static void main(String[] args) {

    }
}
