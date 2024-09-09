package Multithreading;
//Creating thread using Runnable interface (Method 1)
public class MyThread implements Runnable {
    @Override
    public void run() {
        //task for thread
        for (int i = 1; i < 11; i++) {
            System.out.println("Thread 1: "+i);
            try{
                Thread.sleep(1000);
            } catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        //Create object of MyThread class
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        thr.start();
        t2.start();
    }
}
