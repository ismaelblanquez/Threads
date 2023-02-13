public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();


        Thread sender = new Thread(new Sender(buffer));
        Thread receiver = new Thread(new Receiver(buffer));
        
        sender.start();
        receiver.start();
    }
}
