package patron_adapter;

public class PATRON_ADAPTER {

    public static void main(String[] args) {
        /*  Lampara lampara = new Lampara();
        
        lampara.encender();
        System.out.println("Está encendida: " + lampara.isEncendida());
        ordenador.encender();
        System.out.println("Está encendida: " + ordenador.isEncendida());*/

        Conectable l1 = new Lampara();
        encenderAparato(l1);
        
        Conectable o1 = new Ordenador();
        encenderAparato(o1);
        
        Conectable l2 = new AdaptadorLampara();
        encenderAparato(l2);

    }

    private static void encenderAparato(Conectable l1) {
        l1.encender();
        System.out.println(l1.estaEncendida());
    }

}
