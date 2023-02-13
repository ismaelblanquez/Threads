package patron_adapter;

public class Lampara implements Conectable{

    private boolean encendida;

    @Override
    public boolean estaEncendida() {
        return encendida;
    }

    @Override
    public void encender() {
        encendida = true;
    }

    @Override
    public void apagar() {
        encendida = false;
    }

}
