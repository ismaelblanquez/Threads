import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private Buffer buffer;
 
    // standard constructors
    public Receiver(Buffer buffer){
        this.buffer = buffer;
    }
    public void run() {
        for(String receivedMessage = buffer.receive(); !"End".equals(receivedMessage); receivedMessage = buffer.receive()) {
            System.out.println(receivedMessage);
            //Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted"); 
            }
        }
    }
}