package main.com.thread.threaddemo;

import java.sql.SQLOutput;

/**
 * @Author: HayLi pwx520500
 * @Date: 2021/7/19 22:50
 */
public class DemoThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        DemoThread demoThread = new DemoThread();
        new Thread(demoThread, "myDefineThreadName").start();

        //Main thread
        System.out.println(Thread.currentThread().getName());
    }
}
