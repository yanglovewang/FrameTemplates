package thread;

public class ThreadJoin extends Thread {

    @Override
    public void run() {
        for (int i = 0; i< 100; i++) {
            System.out.println("线程2号" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i< 100; i++) {
            System.out.println("main" + i);
            if (i == 20) {
                ThreadJoin t = new ThreadJoin();
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
