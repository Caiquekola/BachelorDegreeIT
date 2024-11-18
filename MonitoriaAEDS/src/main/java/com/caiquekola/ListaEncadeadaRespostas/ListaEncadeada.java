package com.caiquekola.ListaEncadeada;

import java.util.LinkedList;

public class ListaEncadeada <E>{
    private Item<E> lista;
    private int size;

    public ListaEncadeada() {
        lista = null;
    }

    public Item<E> getLista() {
        return lista;
    }

    public int getSize() {
        return size;
    }

    public void addHead(E item) {
        if (lista == null) {
            lista = new Item<E>(item, null);
        } else {
            Item<E> novoItem = new Item<E>(item, lista);
            lista = novoItem;
        }
        size++;
    }

    public void addTail(E item) {
        if (lista == null) {
            lista = new Item<E>(item, null);
        } else {
            Item<E> ponteiro = lista;
            for (; ponteiro.proximo != null; ponteiro = ponteiro.proximo) {
            }
            ponteiro.proximo = new Item<E>(item, null);
        }
        size++;
    }

    public boolean removeElement(E item) {
        if (lista == null) {
            return false;
        }
        if(lista.elemento.equals(item)) {
            lista = lista.proximo;
            size--;
            return true;
        }
        Item<E> ponteiro = lista;
        while(ponteiro.proximo != null) {
            if(ponteiro.proximo.elemento.equals(item)) {
                ponteiro.proximo = ponteiro.proximo.proximo;
                size--;
                return true;
            }
            ponteiro = ponteiro.proximo;
        }
        return false;
    }

    public boolean elementExist(E item) {
        if (lista == null)
            return false;
        Item<E> ponteiro = lista;
        for (; ponteiro != null; ponteiro = ponteiro.proximo) {
            if (item.equals(ponteiro.elemento)) {
                return true;
            }
        }
        return false;
        // Checar se um elemento existe na lista
    }

    public boolean isEqual(ListaEncadeada<E> other) {
        if(size != other.size) {
            return false;
        }

        Item<E> ponteiro1 = lista;
        Item<E> ponteiro2 = other.lista;

        while(ponteiro1.proximo != null) {
            if(!(ponteiro1.equals(ponteiro2.proximo))) {
                return false;
            }
            ponteiro1 = ponteiro1.proximo;
            ponteiro2 = ponteiro2.proximo;
        }
        return true;
    }

    public ListaEncadeada<E> mergeList(ListaEncadeada<E> outraLista) {
        ListaEncadeada<E> novaLista = new ListaEncadeada<>();
        Item<E> ponteiro = this.lista;

        while(ponteiro.proximo != null) {
            novaLista.addHead(ponteiro.elemento);
            ponteiro = ponteiro.proximo;
        }

        ponteiro = outraLista.lista;
        while(ponteiro.proximo != null) {
            novaLista.addHead(ponteiro.elemento);
            ponteiro = ponteiro.proximo;
        }
        return novaLista;
    }

    public void printLinkedList() {
        Item<E> ponteiro = lista;
        System.out.println("Imprimindo a Lista encadeada");
        for (; ponteiro != null; ponteiro = ponteiro.proximo) {
            System.out.println(ponteiro.elemento);
        }
    }


    public static class Item<T> {
        T elemento;
        Item<T> proximo;

        Item(T item, Item<T> prox) {
            elemento = item;
            proximo = prox;
        }
    }

}

class ListaEncadeadaManipulada<E>{
    public boolean isEqual(ListaEncadeada<E> l1, ListaEncadeada<E> l2){
        if(l1 == null && l2 == null){
            return true;
        }else if(l1 == null || l2 == null){
            return false;
        }
        ListaEncadeada.Item<E> ponteiro1 = l1.getLista();
        ListaEncadeada.Item<E> ponteiro2 = l2.getLista();
        while(ponteiro1 != null && ponteiro2 != null){
            if(!(ponteiro1.elemento.equals(ponteiro2.elemento))){
                return false;
            }
        }
        return true;
    }

}
