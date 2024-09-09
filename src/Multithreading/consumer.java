package Multithreading;

public class consumer extends Thread{
    company c;
    consumer(company c){
        this.c =c;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            try {
                this.c.consume_items();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{
               Thread.sleep(2000);
            }catch(Exception e){

            }
        }
    }
}
