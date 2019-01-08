package com.daojia.yonghu.share.synchronizeddemo.eightlocks;

/**
 * @author yuh
 * @date 2019-01-08 14:13
 **/
public class Main {

    /*
     * 题目：判断打印的 "one" or "two" ？
     *
     * 1. 两个普通同步方法  两个线程    一个number对象  打印?
     * 2. 新增 Thread.sleep() 给 getOne()  两个线程    一个number对象  打印?
     * 3. 新增普通方法 getThree()     三个线程    一个number对象  打印?
     * 4. 两个普通同步方法  两个Number对象  两个线程 一个number对象 打印?
     * 5. 修改 getOne()为静态同步方法    一个number对象  打印?
     * 6. 修改两个方法均为静态同步方法，一个 Number 对象?
     * 7. 一个静态同步方法  一个非静态同步方法   两个 Number 对象  打印?
     * 8. 两个静态同步方法  两个 Number 对象  打印?
     *
     * 特殊情况
     * 1. 两个普通同步方法  两个线程 getOne抛出异常   一个number对象  打印?
     *
     */

    static class Number {
        public void getOne() {
            int a = 1 / 0;
            System.out.println("one");
        }

        public synchronized void getTwo() {
            System.out.println("two");
        }

        public void getThree() {
            System.out.println("three");
        }
    }

    public static void main(String[] args) {
        Number number = new Number();
        Number number2 = new Number();

        new Thread(() -> number.getOne()).start();
        new Thread(() -> number.getTwo()).start();
//        new Thread(() -> number.getThree()).start();
    }
}
