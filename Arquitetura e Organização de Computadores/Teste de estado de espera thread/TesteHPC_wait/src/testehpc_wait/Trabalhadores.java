package testehpc_wait;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trabalhadores extends Thread {

    private static final Vector<Integer> tarefas = new Vector<>();
    private static boolean executando = true;
    

    @Override
    public void run() {

        while (!tarefas.isEmpty() || executando) {
            Integer numTarefa = acessarTarefa();
            
            if(numTarefa == null){
                dormir();
            }else{
                long cont = 0;
                
                //teste apenas para gerar carga de CPU
                for(double i = 0.0; i < numTarefa;i+= 0.0001){
                    cont++;
                }
            }
        }
    }
    
    private void dormir(){
        synchronized(tarefas){
            try {
                tarefas.wait();
            } catch (InterruptedException ex) {
                System.err.println("Alguma thread nao foi devidamente enc.");
            }
        }
    }

    private Integer acessarTarefa() {
        synchronized (tarefas) {
            if(tarefas.isEmpty()){
                return null;
            }else{
                return tarefas.remove(tarefas.size() - 1);
            }
        }
    }
    
    public static void addTarefa(Integer novaTarefa){
        synchronized (tarefas) {
            tarefas.add(novaTarefa);
            tarefas.notify(); //um dos trab. volta para estado pronto (run)
        }
        
    }

    public static void encerraApp(){
        synchronized (tarefas) {
            executando = false;
            tarefas.notifyAll();
        }

    }
    
}
