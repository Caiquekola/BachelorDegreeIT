package testehpc_wait;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteHPC_wait {

    public static void main(String[] args) {
        
        int numCpu = Runtime.getRuntime().availableProcessors();
        
        Trabalhadores trabs[] = new Trabalhadores[numCpu];
        
        for(int i = 0; i < numCpu;i++){
            trabs[i] = new Trabalhadores();
            trabs[i].start();
        }

        
        for(int i = 0; i < 50000;i++){
            Trabalhadores.addTarefa(100);
        }
        
        //vamos aguardar 2 segundos
        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteHPC_wait.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i = 0; i < 50000;i++){
            Trabalhadores.addTarefa(100);
        }
        
        Trabalhadores.encerraApp();
        
        for(int i = 0; i < numCpu;i++){
            try {
                trabs[i].join(); //aguardar a finalizacao das threads filhas para seguir o processamento
            } catch (InterruptedException ex) {
                System.err.println("Uma thread filha não foi finalizada");
            }
        }
        
    }
    
}
