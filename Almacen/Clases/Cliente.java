package Ejercicio2.Rebajas.Clases;

public class Cliente extends Thread {
    private String nombre;
    private int intentos;
    private Almacen tiendaApple;
    private boolean pudeComprar;

    public Cliente(String nombre, Almacen tienda) {
        this.nombre = nombre;
        this.intentos = 10;
        this.tiendaApple = tienda;
    }

    @Override
    public void run() {
        while (intentos > 0) {
            if (tiendaApple.entrar()) {
                System.out.println("El cliente " + nombre + " ha entrado en la tienda Apple");
                pudeComprar = tiendaApple.comprar();
                if (pudeComprar) {
                    System.out.println("El cliente " + nombre + " ha comprado un iphone14");
                } else {
                    System.out.println("El cliente " + nombre + " se ha quedado sin unidades del iphone 14");
                }
                this.intentos=0;
                this.tiendaApple.salir();

            }else{
                intentos=intentos-1;
                System.out.println("Cliente "+nombre+" : ¡Vaya! toca seguir esperando para entrar a comprar");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("El cliente "+nombre+" se ha ido");
    }
}