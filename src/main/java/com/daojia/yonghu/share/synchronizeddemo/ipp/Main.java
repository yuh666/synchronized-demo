package com.daojia.yonghu.share.synchronizeddemo.ipp;

import com.daojia.yonghu.share.synchronizeddemo.ipp.IPP;

/**
 * @author yuh
 * @date 2019-01-08 13:06
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {
        int cycle = 10000;
        IPP ipp = new IPP(cycle);
        Thread thread1 = new Thread(ipp, "Angel Han");
        Thread thread2 = new Thread(ipp, "Angel Juan");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.err.println("expect: " + cycle * 2 + ",actual: " + ipp.get());
    }
}
