
package threads01;


public class SoldierRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + 
                    Thread.currentThread().getName());
            System.out.println("Termina Thread" 
                    + Thread.currentThread().getName());
        }
    }
    
}
