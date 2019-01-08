package com.daojia.yonghu.share.synchronizeddemo.ipp;

/**
 * i plus plus
 *
 * @author yuh
 * @date 2019-01-08 13:05
 **/
public class IPP implements Runnable {

    private int cycle;
    private int i;

    public IPP(int cycle) {
        this.cycle = cycle;
    }

    public int get() {
        return i;
    }

    @Override
    public void run() {
        for (int j = 0; j < cycle; j++) {
            synchronized (this){
                i++;
            }
        }
    }
}
