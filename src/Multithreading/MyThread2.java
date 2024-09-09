package Multithreading;
//Creating thread using Thread class
public class MyThread2 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 10; i >=0 ; i--) {
            System.out.println("Thread 2: "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
