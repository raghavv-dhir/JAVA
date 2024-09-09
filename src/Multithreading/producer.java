package Multithreading;

public class producer extends Thread{
    company c;
    producer(company c){
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        int i =1;
        while (true){
            try {
                this.c.produce_items(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{
              Thread.sleep(1000);
            }catch(Exception e){

            }
            i++;
        }
    }
}
