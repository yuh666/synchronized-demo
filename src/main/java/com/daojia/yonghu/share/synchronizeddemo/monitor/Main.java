package com.daojia.yonghu.share.synchronizeddemo.monitor;

/**
 * @author yuh
 * @date 2019-01-08 20:56
 **/
public class Main {

    private static int i;
    private static volatile Object obj;

    static synchronized void lock() {
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void monitor() {
        synchronized (Main.class) {
            for (int j = 0; j < 100000; j++) {
                i++;
            }
        }
    }

    static void monitor1() {
        i++;
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> monitor(), "Angel Han");
        thread.start();
        Thread thread1 = new Thread(() -> monitor(), "Angel Juan");
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(i);
    }
}
