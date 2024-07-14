package poker_paralelo_linhas;

import poker_paralelo_arquivo.*;
import pokerhpc_sequencial.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PokerHPC {


    public static void main(String[] args) {

        int numCpu = Runtime.getRuntime().availableProcessors();
        
        Trabalhador trabs[] = new Trabalhador[numCpu];
        
        for(int i = 0; i < numCpu;i++){
            trabs[i] = new Trabalhador();
        }
        
        
        long tempoInicial = System.currentTimeMillis();
        
        //gerar a carga do workpool
        File caminho = new File("C:\\Users\\saulo.cabral\\Downloads\\SeuJosePokerHistory\\SeuJosePokerHistory");

        File arquivosLog[] = caminho.listFiles();
        
        //add todas as linhas para o Workpool
        int indiceTrab = 0;
        for (int i = 0; i < arquivosLog.length; i++) {

            try {

                if (arquivosLog[i].isFile() && arquivosLog[i].canRead()) {
                    FileReader marcaArquivoLeitura
                            = new FileReader(arquivosLog[i]);

                    BufferedReader bufLeitura
                            = new BufferedReader(marcaArquivoLeitura);

                    String linha = null;
                    
                    do {
                        linha = bufLeitura.readLine();
                        
                        if(linha == null){
                            break;
                        }
                        
                        trabs[indiceTrab].addLinha(linha);
                        
                    }while(true);
                    //indiceTrab = indiceTrab == numCpu -1 ? 0 : indiceTrab++;
                    
                    indiceTrab++;
                    
                    //temos que recomecar a divisao
                    if(indiceTrab == numCpu){
                        indiceTrab = 0;
                    }
                    
                }
            }catch(FileNotFoundException ex){
                System.err.println("arquivo não existe");
            } catch (IOException ex) {
                Logger.getLogger(PokerHPC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        long tempoFinal = System.currentTimeMillis();
        
        System.out.println((tempoFinal - tempoInicial)/1000);
        
        for(Trabalhador t: trabs){
            t.start();
        }
        
        //barrareira de sincronizacao
        for(Trabalhador t: trabs){
            try {
                t.join();
            } catch (InterruptedException ex) {
                System.err.println("Threads filhas não haviam terminado sua tarefa");
            }
        }
        

    }

}
