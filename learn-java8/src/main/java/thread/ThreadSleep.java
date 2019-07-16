package thread;

import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;

public class ThreadSleep extends Thread {


    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println("main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        String sss = "hng";
        String name = sss.getClass().getName();
        System.out.println(name);
        Field[] fields = sss.getClass().getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        TypeVariable<? extends Class<? extends String>>[] typeName = sss.getClass().getTypeParameters();
        System.out.println(typeName);
    }
}
