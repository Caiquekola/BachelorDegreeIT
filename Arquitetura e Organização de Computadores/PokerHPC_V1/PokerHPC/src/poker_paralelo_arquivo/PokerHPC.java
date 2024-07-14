package poker_paralelo_arquivo;

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
        
        //gerar a carga do workpool
        File caminho = new File("C:\\Users\\saulo.cabral\\Downloads\\SeuJosePokerHistory\\SeuJosePokerHistory");

        File arquivosLog[] = caminho.listFiles();
        
        //add todos os arquivos para o Workpool
        Trabalhador.addArquivos(arquivosLog);
        
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
