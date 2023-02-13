public class Main {
    public static void main(String[] args) {
        // Instanciar el objeto que será Observado
        AvionLider avionLider = new AvionLider("Avión Lider");

        // Instanciar y registrar tres Observadores
        AvionPerseguidor avionPerseguidor1 = new AvionPerseguidor("Boeing 747");
        AvionPerseguidor avionPerseguidor2 = new AvionPerseguidor("Airbus A380");
        AvionPerseguidor avionPerseguidor3 = new AvionPerseguidor("B-52");
        avionLider.agregarAvion(avionPerseguidor1);
        avionLider.agregarAvion(avionPerseguidor2);
        avionLider.agregarAvion(avionPerseguidor3);

        avionLider.start();
    }
}