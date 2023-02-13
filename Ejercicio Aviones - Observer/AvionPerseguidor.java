public class AvionPerseguidor implements IAvion {
    private String nombre;

    // ---------------------------------

    public AvionPerseguidor(String nombre) {
        this.setNombre(nombre);
        System.out.println("AviónPerseguidor [" + this.nombre + "] creado");
    }

    // ---------------------------------

    public String getNombre() {
        return this.nombre;
    }

    // ---------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ---------------------------------

    @Override
    public void girarDerecha() {
        System.out.println("AviónPerseguidor [" + this.getNombre() + "] girando a la derecha");
    }

    // ---------------------------------

    @Override
    public void girarIzquierda() {
        System.out.println("AviónPerseguidor [" + this.getNombre() + "] girando a la izquierda");
    }
}