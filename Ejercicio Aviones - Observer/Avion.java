import java.util.ArrayList;

public abstract class Avion extends Thread implements IAvion {
    private String nombre;
    private ArrayList<IAvion> aviones = new ArrayList<IAvion>();

    // ---------------------------------

    public Avion(String nombre) {
        this.nombre = nombre;
        System.out.println("Avión [" + this.nombre + "] creado");
    }

    // ---------------------------------

    public String getNombre() {
        return nombre;
    }

    // ---------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ---------------------------------

    public void agregarAvion(IAvion a) {
        aviones.add(a);
    }

    // ---------------------------------

    public void eliminarAvion(IAvion a) {
        aviones.remove(a);
    }

    // ---------------------------------

    @Override
    public void girarDerecha() {
        System.out.println("Avión [" + this.getNombre() + "] girando a la derecha");
        // Enviar la notificación a cada observador a través de su propio método
        for (IAvion avion : aviones) {
            avion.girarDerecha();
        }
    }

    // ---------------------------------

    @Override
    public void girarIzquierda() {
        System.out.println("Avión [" + this.getNombre() + "] girando a la izquierda");
        // Enviar la notificación a cada observador a través de su propio método
        for (IAvion avion : aviones) {
            avion.girarIzquierda();
        }
    }
}