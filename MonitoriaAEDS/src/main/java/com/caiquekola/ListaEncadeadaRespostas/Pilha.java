package com.caiquekola.ListaEncadeada;

public class Pilha {
    // Pilha com inteiros
    private final int tamanhoPilha = 100;
    private int topo = 0;

    private int itens[];
    public Pilha(){
        itens = new int[tamanhoPilha];
    }

    public void push(int valor){
        if(!isFull()){
            itens[topo] = valor;
            topo++;
        }else{
            System.out.println("Pilha cheia");
        }

    }

    public void pop(){
        if(!isEmpty()){
            topo--;
        }else{
            System.out.println("Pilha vazia");
        }
    }

    public boolean isEmpty(){
        return topo == 0;
    }

    public boolean isFull(){
        return topo == tamanhoPilha;
    }

    public int getTopo() {
        return topo;
    }

    public int[] getItens() {
        return itens;
    }

    public int getTamanhoPilha() {
        return tamanhoPilha;
    }
}

class ManipulacaoPilha{
    //Exercício 1:
    //Retornar
    public int ehMaior(Pilha p1, Pilha p2){
        if(p1.getTopo() > p2.getTopo()){
            return 1;
        }
        return 0;
    }

    //Exercício 2:
    public int transferirElementos(Pilha p1, Pilha p2){

//        System.arraycopy(p1.getItens(), 0, p2.getItens(), p2.getTopo(), p1.getItens().length);
//        if(p2.getTamanhoPilha()-p2.getTopo()<p1.getTamanhoPilha()){
//            //Nesse caso o tamanho restante da pilha 2 não suportará a quantidade de itens
//            return 0;
//        }
//        return 1;


        Pilha ponteiro = p1;
        int topoPilha1 = p1.getTopo();
        int contador = 0;

        while(!p2.isFull()){
            p2.push(ponteiro.getItens()[contador]);
            contador++;
        }
        if(p2.isFull()&&(contador!=topoPilha1)){
            return 0;
        }
        return 1;


    }

    public void inverter(Pilha p1){

        Pilha invertida = new Pilha();

        while (!p1.isEmpty()) {
            int valor = p1.getItens()[p1.getTopo() - 1]; // Pegar o elemento do topo
            invertida.push(valor); // Empilhar na pilha invertida
            p1.pop(); // Remover da pilha original
        }

        // Transferir os elementos de volta para p1
        while (!invertida.isEmpty()) {
            int valor = invertida.getItens()[invertida.getTopo() - 1]; // Pegar o elemento do topo
            p1.push(valor); // Empilhar de volta na pilha original
            invertida.pop(); // Remover da pilha invertida
        }
    }


    public static void main(String[] args) {
        Pilha p = new Pilha();

        // Adicionando elementos na pilha
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);

        ManipulacaoPilha manipulador = new ManipulacaoPilha();

        System.out.println("Pilha original:");
        for (int i = 0; i < p.getTopo(); i++) {
            System.out.print(p.getItens()[i] + " ");
        }
        System.out.println();

        // Invertendo a pilha
        manipulador.inverter(p);

        System.out.println("Pilha invertida:");
        for (int i = 0; i < p.getTopo(); i++) {
            System.out.print(p.getItens()[i] + " ");
        }
        System.out.println();
    }
}