package com.yang.learnjava8.test.Trader;

public class Daemon extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("daemon");
        }
    }

    public static void main(String[] args) {
        Daemon d = new Daemon();
        //d.setDaemon(true);
        for (int i = 1; i < 100; i++) {
            if (i == 20) {
                d.start();
            }
            System.out.println("main");
        }
    }
}
