package com.daojia.yonghu.share.synchronizeddemo.vol;

/**
 * @author yuh
 * @date 2019-01-09 15:52
 **/
public class Main {

    static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag) {
                    System.out.println("hahaha");
                }
            }
        }).start();

        Thread.sleep(1000);
        flag = false;
    }

}
