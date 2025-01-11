package com.caiquekola.ListaEncadeadaRespostas;

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
            // 5 2 3
            // 0 1 2
            itens[topo] = valor;
            topo++;
        }else{
            System.out.println("Pilha cheia");
        }

    }

    public void pop(){
        if(!isEmpty()){
            // 5 2 3
            // 0 1 2
            topo--;
        }else{
            System.out.println("Pilha vazia");
        }
    }

    public void print(){
        for(int i = 0; i < topo; i++){
            System.out.println(itens[i]);
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
        System.arraycopy(p1.getItens(), 0, p2.getItens(), p2.getTopo(), p1.getItens().length);
        if(p2.getTamanhoPilha()-p2.getTopo()<p1.getTamanhoPilha()){
            //Nesse caso o tamanho restante da pilha 2 não suportará a quantidade de itens
            return 0;
        }
        return 1;

    }



        public void inverter(Pilha P) {
            // Criar uma pilha auxiliar
            Pilha auxiliar = new Pilha();
            Pilha auxiliar2 = new Pilha();

            // Transferir todos os elementos de P para a pilha auxiliar
            while (!P.isEmpty()) {
                auxiliar.push(P.getItens()[P.getTopo() - 1]); // Adicionar o elemento do topo à auxiliar
                P.pop(); // Remover da pilha original
            }

            while(!auxiliar.isEmpty()){
                auxiliar2.push(auxiliar.getItens()[auxiliar.getTopo() - 1]); // Adicionar o elemento do topo à auxiliar
                auxiliar.pop(); // Remover da pilha original
            }

            // Transferir os elementos de volta para a pilha original (P)
            while (!auxiliar2.isEmpty()) {
                P.push(auxiliar2.getItens()[auxiliar2.getTopo() - 1]); // Adicionar o elemento do topo de volta a P
                auxiliar2.pop(); // Remover da pilha auxiliar
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