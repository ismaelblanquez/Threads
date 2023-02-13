public class AvionLider extends Avion  {

    public AvionLider(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        super.girarDerecha();
        super.girarIzquierda();
    }
}