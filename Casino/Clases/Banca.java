package Ejercicio1.JuegoCasino.Clases;

import java.util.ArrayList;
import java.util.Random;

public class Banca extends Thread {
    private int saldo;
    private boolean tengoDinero;
    private boolean jugando = false;
    private Random generador;
    private int numeroBanca;
    private ArrayList<Jugador> apostadores;

    public Banca(int dinero) {
        this.saldo = dinero;
        this.tengoDinero = true;
        this.generador = new Random();
        apostadores = new ArrayList<>();
    }

    public synchronized boolean estoyArruinado() {
        return !tengoDinero;
    }

    public synchronized void sumarBanca(int apuestaJugador) {
        this.saldo = saldo + apuestaJugador;
    }

    public synchronized void restarBanca(int dinero) {
        if (saldo - dinero <= 0) {
            this.saldo = 0;
            tengoDinero = false;
            System.out.println("La banca esta en bancarota y se termina el juego");
            return;
        }
        this.saldo = this.saldo - dinero;
    }

    public synchronized void anyadirJugador(Jugador apostador) {
        apostadores.add(apostador);
    }

    public synchronized boolean estamosJugando() {
        return this.jugando;
    }

    public void hayGanador() {
        int numApostadores = apostadores.size();
        for (Jugador apostador : apostadores) {
            apostador.numeroGanador(numeroBanca);
        }
    }

    @Override
    public void run() {
        int numeroJugadores = 4;
        int dineroJugador = 1000;
        for (int i = 0; i < numeroJugadores; i++) {
            String numero = Integer.toString(i);
            String nombre = "Jugador  " + numero;
            Jugador jugador = new Jugador(dineroJugador, this, nombre);
            this.anyadirJugador(jugador);
            jugador.start();
        }

        while (tengoDinero == true) {
            System.out.println("Comienza la partida");
            this.jugando = false;
            this.numeroBanca = generador.nextInt(37);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.jugando = true;
            System.out.println("El numero ganador es el ... ¡" + numeroBanca + "!");
            this.hayGanador();
            System.out.println("El dinero actual del banco es de " + saldo + "€");

        }
    }
}

