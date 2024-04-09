package memoriacompartilhada;
public class TrabalhadorSoma extends Thread{
    private static long CONTADOR_GLOBAL = 0L;
    private long contadorLocal = 0L;
    private static Object lock = new Object();
    
    private long qSoma1;

    public TrabalhadorSoma(long qSoma1) {
        this.qSoma1 = qSoma1;
    }

    @Override
    public void run() {
        for (long i = 0; i < qSoma1; i++) {
            add1();
        }
    }
    private void add1(){
//        synchronized (lock){
//        CONTADOR_GLOBAL++;
        contadorLocal++;
//    }
    }
    public static long getCONTADOR_GLOBAL() {
        return CONTADOR_GLOBAL;
    }
    
    public long getContadorLocal(){
        return contadorLocal;
    }
    
    
    
}
