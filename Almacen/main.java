package Ejercicio2.Rebajas;

import Ejercicio2.Rebajas.Clases.Almacen;

public class main {
    public static void main(String[] args) {
        int clientes = 300;
        Almacen tienda = new Almacen(clientes);
        tienda.start();
    }
}
