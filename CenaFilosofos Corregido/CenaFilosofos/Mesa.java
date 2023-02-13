public class Mesa{
    private boolean[] tenedores;
    private boolean[] jarras;

    public Mesa(int numTenedores){
        this.tenedores = new boolean[numTenedores];
        this.jarras = new boolean[2];

    }

    public int tenedorIzquierda(int comensal){
        return comensal;
    }
    public int tenedorDerecha(int comensal){
        if(comensal==1){
            return this.tenedores.length;
        }else{
            return comensal -1;
        }
    }

    public synchronized int cogerJarra(){
        boolean jarra1 = jarras[0];
        boolean jarra2 = jarras[1];

        while(jarra1 && jarra2){
            try {
                wait();
                jarra1 = jarras[0];
                jarra2 = jarras[1];
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(!jarra1){
            jarras[0] = true;
            return 0;
        }else{
            jarras[1] = true;
            return 1;
        }
    }

    public synchronized void dejarJarra(int indiceJarra){
        jarras[indiceJarra] = false;
        notifyAll();
    }

    public synchronized void cogerTenedores(int comensal){
        boolean izquierda = tenedores[tenedorIzquierda(comensal)-1];
        boolean derecha = tenedores[tenedorDerecha(comensal)-1];

        // TENEDORES OCUPADOS
        while(izquierda || derecha){
            try {
                wait();
                izquierda = tenedores[tenedorIzquierda(comensal)-1];
                derecha = tenedores[tenedorDerecha(comensal)-1];
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // O TENEDORES LIBRES
        tenedores[tenedorIzquierda(comensal)-1] = true;
        tenedores[tenedorDerecha(comensal)-1] = true;
    }
    public synchronized void dejarTenedores(int comensal){
        tenedores[tenedorIzquierda(comensal)-1] = false;
        tenedores[tenedorDerecha(comensal)-1] = false;
         notifyAll();
        
    }
}