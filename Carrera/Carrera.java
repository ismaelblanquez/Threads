public class Carrera {
    public static void main(String[] args) {
        Liebre liebre = new Liebre();
        Tortuga tortuga = new Tortuga();

        liebre.start();
        tortuga.start();
    }
}

class Liebre extends Thread {
    private static final int META = 5000;
    private static final int VELOCIDAD = 400;
    private int pasos = 0;

    @Override
    public void run() {
        while (pasos < META) {
            pasos += VELOCIDAD;
            System.out.println("La liebre ha dado " + pasos + " pasos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("La liebre ha llegado a la meta!");
    }
}

class Tortuga extends Thread {
    private static final int META = 5000;
    private static final int VELOCIDAD = 10;
    private int pasos = 0;

    @Override
    public void run() {
        while (pasos < META) {
            pasos += VELOCIDAD;
            System.out.println("La tortuga ha dado " + pasos + " pasos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("La tortuga ha llegado a la meta!");
    }
}
