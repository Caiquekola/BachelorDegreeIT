package paralelismo;

import java.util.Random;

public class Jogadores extends Thread{
    private long qDardos;
    private long acertos = 0;
    
    public Jogadores(long qDardos){
        this.qDardos = qDardos;
    }
    @Override
    public void run(){
        double x,y;
        Random random = new Random();
        for (int i = 0; i < qDardos; i++) {
            x = random.nextDouble();
            y = random.nextDouble();
            
            if(Math.sqrt((x*x)+(y*y))<1){
                acertos++;
            }
        }
    }

    public long getAcertos() {
        return acertos;
    }
    
    
    
}
