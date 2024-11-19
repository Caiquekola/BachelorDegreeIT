package com.caiquekola;

import com.caiquekola.ListaEncadeada.ListaDuplamenteEncadeada;
import com.caiquekola.ListaEncadeada.ListaEncadeada;

public class Main {
    public static void main(String[] args) {

        //Iniciação da lista encadeada
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        //Adição de nós
        listaEncadeada.addHead(5);
        listaEncadeada.addHead(6);
        listaEncadeada.addHead(7);
        //Impressão
        listaEncadeada.printLinkedList();
        //Remoção
        listaEncadeada.removeElement(6);
        listaEncadeada.printLinkedList();

        System.out.println("------=-------=-------");

        //Criação da lista duplamente encadeada
        ListaDuplamenteEncadeada<Integer> listaDuplaEncadeada = new ListaDuplamenteEncadeada<>();
        listaDuplaEncadeada.addHead(5);
        listaDuplaEncadeada.addHead(6);
        listaDuplaEncadeada.addTail(7);
        //Impressão após adição de elementos
        listaDuplaEncadeada.printLinkedList();

        listaDuplaEncadeada.removeElement(7);
        listaDuplaEncadeada.printLinkedList();
    }
}