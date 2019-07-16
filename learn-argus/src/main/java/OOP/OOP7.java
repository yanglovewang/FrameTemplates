package OOP;

/**
 * 有抽象方法的类必须是抽象类
 * 抽象方法不能private修饰，因为抽象方法的设计目的是为了让子类重写
 * 抽象方法不能被static修饰，因为抽象方法的设计目的是为了让子类重写，static不能被重写
 * 没有抽象局部变量和抽象静态变量的说法
 */
public abstract class OOP7 {
   public abstract void test();
   //private abstract void test2();
   //static abstract test2();
}
