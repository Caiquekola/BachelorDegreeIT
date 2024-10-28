package org.example.Observer;

import java.util.ArrayList;

public interface Sujeito {
    public void registra(Observador o);

    public void apagar(Observador o);

    public void notificar();

}

interface Observador {
    public void atualiza(int precoIBM,
                         int precoIntel,
                         int precoApple,
                         int precoGoogle);

}

class Bolsa implements Sujeito {

    private ArrayList<Observador> observadores = new ArrayList<Observador>();
    private int pApple, pIntel, pGoogle, pIbm;

    public Bolsa() {

    }

    @Override
    public void registra(Observador o) {
        observadores.add(o);
    }

    @Override
    public void apagar(Observador o) {
    }

    @Override
    public void notificar() {
        for (Observador atual : observadores) {
            atual.atualiza(pApple, pIntel, pGoogle, pIbm);
        }
    }


    public void setPrecoIBM(int novoPreco) {
        this.pIbm = novoPreco;
        notificar();
    }

    public void setPrecoIntel(int novoPreco) {
        this.pIntel = novoPreco;
        notificar();

    }

    public void setPrecoApple(int novoPreco) {
        this.pApple = novoPreco;
        notificar();

    }

    public void setPrecoGoogle(int novoPreco) {
        this.pGoogle = novoPreco;
        notificar();

    }

}

class Investidor implements Observador {
    private int pApple, pIntel, pGoogle, pIbm, IDObservador;
    private static int contador;
    private Sujeito bolsa;

    public Investidor(Sujeito bolsa) {
        this.bolsa = bolsa;
        this.IDObservador=++contador;
        System.out.println("Novo observador registrado: "+this.IDObservador);
        bolsa.registra(this);
    }

    public void exibirPrecos(){
        System.out.println("Observador"+this.IDObservador+" IBM: "+pIbm+"Intel: "+pIntel+" Google: "+pGoogle+"Apple: "+pApple);
    }

    public void atualiza(int pApple, int pIntel,int pGoogle,int pIbm){
        this.pIbm=pIbm;
        this.pApple=pApple;
        this.pIntel=pIntel;
        this.pGoogle=pGoogle;
        exibirPrecos();
    }
}

 class Principal{
    public static void main(String[] args) {
        Bolsa b1 = new Bolsa();

        Investidor i1 = new Investidor(b1);
        Investidor i2 = new Investidor(b1);
        Investidor i3 = new Investidor(b1);
        Investidor i4 = new Investidor(b1);
        Investidor i5 = new Investidor(b1);


        b1.setPrecoApple(100);
        b1.setPrecoGoogle(800);
        b1.setPrecoIBM(300);
        b1.setPrecoIntel(250);

    }
}