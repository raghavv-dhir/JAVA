package Multithreading;

public class company {
    int n;
    boolean f = false;
    synchronized public void produce_items(int n) throws Exception{
        if (f){
            wait();
        }
        this.n = n;
        System.out.println("Produced item:"+this.n);
        f=true;
        notify();
    }
    synchronized public int consume_items() throws Exception {
        if (!f){
            wait();
        }
        System.out.println("Consumed item: "+this.n);
        f=false;
        notify();
        return this.n;
    }
}
