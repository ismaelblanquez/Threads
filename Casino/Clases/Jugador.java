package Ejercicio1.JuegoCasino.Clases;

import java.util.Random;

public class Jugador extends Thread {
    private String nombre;
    private Banca casino;
    private boolean nuevoNumero;
    private int saldo;
    private boolean soyGanador;
    private boolean tengoDinero;
    private int numeroJugador;
    private Random generador;

    public Jugador(int saldo, Banca banca, String nombre) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.casino = banca;
        this.tengoDinero = true;
        this.generador = new Random();
    }

    public void sumarDinero(int dinero) {
        saldo += dinero;
    }

    public void restarDinero(int dinero) {
        if (saldo - dinero <= 0) {
            saldo = 0;
            tengoDinero = false;
        }
        saldo -= dinero;
    }


    public void numeroGanador(int numeroBanca) {
        if (numeroBanca == numeroJugador) {
            System.out.println("El jugador " + nombre + " suma 36 veces lo apostado");
            casino.restarBanca(360);
            sumarDinero(360);
        } else if (numeroBanca == 0) {
            casino.sumarBanca(10);
            System.out.println("No soy el ganador, le doy a la banca lo in");
        } else {
            casino.sumarBanca(10);
            System.out.println(nombre+ "Elegiste el " + numeroJugador + " y salio el " + numeroBanca);
        }
        System.out.println("El jugador " + nombre + "tiene de saldo " + saldo);
        nuevoNumero = false;
    }

    @Override
    public void run() {
        while (tengoDinero && !casino.estoyArruinado()) {
            if (!casino.estamosJugando() && !nuevoNumero) {
                this.numeroJugador = this.generador.nextInt(36) + 1;
                this.restarDinero(10);
                nuevoNumero = true;
            }
        }
    }
}
