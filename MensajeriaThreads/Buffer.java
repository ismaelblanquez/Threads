public class Buffer {
    //MENSAJE TIPO CADENA  
        //QUE COMPARTEN LOS HILOS
    private String packet;

    private boolean puedoRecibir = false;
    private boolean puedoEnviar = true;

    public synchronized void sender(String packet){
        while (!puedoEnviar && puedoRecibir) {
            try {
                wait();//alguien está recibiendo el mensaje
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //EN CASO DE QUE PUEDA ENVIAR!!!!
        puedoEnviar = false;
        puedoRecibir = true;

        this.packet = packet;
        notifyAll();
    }

    public synchronized String receive(){
        while (puedoEnviar && !puedoRecibir) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //EN CASO DE QUE PUEDA RECIBIR!!!!
        puedoEnviar = true;
        puedoRecibir = false;

        String returnPacket = this.packet;
        notifyAll();
        return returnPacket;
    }

}
