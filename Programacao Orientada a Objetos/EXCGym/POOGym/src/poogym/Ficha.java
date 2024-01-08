package poogym;

import java.util.ArrayList;
public class Ficha {
    //Exercicios, séries do Exc, quantidade de realizacao,peso
    String nomeFicha;
    ArrayList<String> exercicio = new ArrayList<String>();
    ArrayList<Integer> serieExc = new ArrayList<Integer>();
    ArrayList<Integer> repeticao = new ArrayList<Integer>();
    ArrayList<Float> peso = new ArrayList<Float>();
    private int qntExerc=0;

    
    public void adcExercicio(String exc) {
        this.exercicio.add(exc);
        this.setQntExer(getQntExer()+1);
    }
    public void adcRepeticao(int rep) {
        this.repeticao.add(rep);
    }
    
    public void adcSerieExc(int serie) {
        this.serieExc.add(serie);
    }
    public void adcPeso(float peso) {
        this.peso.add(peso);
    }

    public int getQntExer() {
        return qntExerc;
    }

    public void setQntExer(int qntExer) {
        this.qntExerc = qntExer;
    }
    public void fichaFinal(){
        for (int i = 0; i < qntExerc; i++) {
            System.out.println("Exercicio: "+exercicio.get(i)
                    +" "+serieExc.get(i)+"X"+repeticao.get(i)+" "+peso.get(i)+"KG");
        }
    }
    
    
}
