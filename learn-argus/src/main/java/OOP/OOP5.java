package OOP;

public class OOP5 {

    //执行空main只对类进行加载，没有在堆里面有对象
    OOP5 o = new OOP5();

    static {
        System.out.println("static block");
    }

    {
        System.out.println("oop5block");
    }


    public OOP5() {
        System.out.println("oop5 struct");
    }

    //执行空main
    public static void main(String[] args) {

    }
}
