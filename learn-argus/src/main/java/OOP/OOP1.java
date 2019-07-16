package OOP;

public class OOP1 {

    int a = 3;

    {
        System.out.println(a);
        //成员变量和代码块之心顺序和元程序顺序有关
        //System.out.println(c);
        int b = 5;
    }

    public OOP1() {
        System.out.println(a);
        System.out.println(c);
    }
    int c = 55;
    public static void main(String[] args) {

    }
}
