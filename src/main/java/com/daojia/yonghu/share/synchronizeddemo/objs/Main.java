package com.daojia.yonghu.share.synchronizeddemo.objs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuh
 * @date 2019-01-09 10:53
 **/
public class Main {


    static class User{
        long balance;
        int age;

        public User(long balance, int age) {
            this.balance = balance;
            this.age = age;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new User(18,100000000));
        }
        Thread.sleep(1000000000);
    }
}
