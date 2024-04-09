package memoriacompartilhada;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SomaHPC {

    public static void main(String[] args) {
        long totalSoma = 12000000L;

        int nCores = Runtime.getRuntime().availableProcessors();
//        int nCores = 1;
        ArrayList<TrabalhadorSoma> trabalhadores = new ArrayList<>();
        
        for (int i = 0; i < nCores; i++) {
            TrabalhadorSoma temp = new TrabalhadorSoma(totalSoma/nCores);
            temp.start();
            trabalhadores.add(temp);
        }
        long ini = System.currentTimeMillis();
        //barreira de sincronização
        //"vamos aguardar todos os trabalhadores somarem +1's"
        long somaFinal = 0L;
        for(TrabalhadorSoma t: trabalhadores){
            try {
                t.join();
                somaFinal += t.getContadorLocal();
            } catch (InterruptedException ex) {
                System.err.println("que pena kk");
            }
        }
        
        long fim = System.currentTimeMillis();
        System.out.println(TrabalhadorSoma.getCONTADOR_GLOBAL());
        System.out.println(somaFinal);
        System.out.println("Tempo => "+(fim-ini));
    }
}
