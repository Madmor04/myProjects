package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();
    }

}
class Thread1 extends Thread{
    @Override
    public void run() {
        if(isAlive())
            System.out.println(Thread.currentThread().getName());
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
