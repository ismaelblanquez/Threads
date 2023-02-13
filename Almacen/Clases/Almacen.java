package Ejercicio2.Rebajas.Clases;

public class Almacen extends Thread {
    private String producto;
    private int unidadesIphone;
    private boolean hayUnidades;
    private int Clientes;
    private boolean tiendaLibre;

    public Almacen(int clientesEsperando) {
        this.tiendaLibre = true;
        this.producto = "Iphone 14";
        this.unidadesIphone = 100;
        this.hayUnidades = true;
        this.Clientes = clientesEsperando;
    }

    public synchronized boolean comprar() {
        if (this.unidadesIphone - 1 == 0) {
            //Solo quedaba 1 y se lo lleva el cliente
            this.unidadesIphone = 0;
            this.hayUnidades = false;
            return true;
        } else if (this.unidadesIphone - 1 > 0) {
            //Aun quedan unidades
            this.hayUnidades = true;
            this.unidadesIphone = this.unidadesIphone - 1;
            return true;
        } else {
            //Ya no hay unidades
            this.hayUnidades = false;
            return false;
        }
    }

    public synchronized void salir() {
        this.tiendaLibre = true;
    }

    public synchronized boolean entrar() {
        if (tiendaLibre) {
            tiendaLibre = false;
            //le paso al cliente que si consiguio entrar
            return true;
        } else {
            //Si esta ocupada no puede entrar
            return false;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < Clientes; i++) {
            String nombre;
            String numero = Integer.toString(i);
            nombre = "Cliente nº " + numero;
            Cliente cliente = new Cliente(nombre, this);
            cliente.start();
        }

    }
}

