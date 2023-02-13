import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
    // MULTI-THREADING
     // MENSAJE
    private Buffer buffer;
 
    // standard constructors
    public Sender(Buffer buffer){
        this.buffer = buffer;
    }
    public void run() {
        String packets[] = {
          "First packet",
          "Second packet",
          "Third packet",
          "Fourth packet",
          "End"
        };
        for (String packet : packets) {
            buffer.sender(packet);
            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().
                       nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted"); 
            }
        }
    }
}