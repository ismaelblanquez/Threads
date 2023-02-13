package Ejercicio1.JuegoCasino.main;

import Ejercicio1.JuegoCasino.Clases.Banca;

public class main {
    public static void main(String[] args) {
        int dineroCasino = 50000;
        Banca casino = new Banca(dineroCasino);
        casino.start();

    }
}
