package paralelismo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Paralelismo {
    public static void main(String[] args) {
        
        long dardos = 1000000000000L;
        long acertos = 0;
        
        List<Jogadores> jogadores = new ArrayList<>();
        int qntNucleos = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < qntNucleos; i++) {
            Jogadores jogador = new Jogadores((long)(dardos/qntNucleos));
            jogadores.add(jogador);
            jogador.start();
        }
        
        for(Jogadores j: jogadores){
            try {
                j.join();
                acertos += j.getAcertos();
            } catch (InterruptedException ex) {
                Logger.getLogger(Paralelismo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        double PI = ((double)acertos/dardos)*4;
        System.out.println(acertos);
        System.out.println(PI);
    }
    
}
