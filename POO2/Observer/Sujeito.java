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
    }

    public void setPrecoIntel(int novoPreco) {
        this.pIntel = novoPreco;
    }

    public void setPrecoApple(int novoPreco) {
        this.pApple = novoPreco;
    }

    public void setPrecoGoogle(int novoPreco) {
        this.pGoogle = novoPreco;
    }

}
