package Multithreading;

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program Started");
        int x = 20 + 30;
        System.out.println("Sum is :"+x);
        //Get Name
        Thread t = Thread.currentThread();
        String tName = t.getName();
        System.out.println("Current running thread is: "+tName);

        //Set Name
        t.setName("My Main");
        System.out.println("Renamed to: "+t.getName());

        //Sleep
        try{
            Thread.sleep(2000);
        } catch(Exception e){

        }

        //Get ID
        System.out.println("Thread ID: "+t.threadId());
        System.out.println("Program terminated");
    }
}
