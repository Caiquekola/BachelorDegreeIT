package com.caiquekola.ListaEncadeadaRespostas;



public class ListaDuplamenteEncadeada<E> {

    private Item<E> lista;
    private int size;

    public ListaDuplamenteEncadeada() {
        lista = null;
        size = 0;
    }

    public void addHead(E item) {
        if (lista == null) {
            lista = new Item<>(item, null, null);
        } else {
            Item<E> novoItem = new Item<>(item, null, lista);
            lista.anterior = novoItem;
            lista = novoItem;
        }
        size++;
    }

    public void addTail(E item) {
        if (lista == null) {
            lista = new Item<>(item, null, null);
        } else {
            Item<E> ponteiro = lista;
            while (ponteiro.proximo != null) {
                ponteiro = ponteiro.proximo;
            }
            ponteiro.proximo = new Item<>(item, ponteiro, null);
        }
        size++;
    }

    public boolean removeElement(E item) {
        if (lista == null || item == null) return false;

        if (lista.elemento.equals(item)) {
            lista = lista.proximo;
            if (lista != null) lista.anterior = null;
            size--;
            return true;
        }

        Item<E> ponteiro = lista;
        while (ponteiro.proximo != null) {
            if (ponteiro.proximo.elemento.equals(item)) {
                ponteiro.proximo = ponteiro.proximo.proximo;
                if (ponteiro.proximo != null) ponteiro.proximo.anterior = ponteiro;
                size--;
                return true;
            }
            ponteiro = ponteiro.proximo;
        }
        return false;
    }

    public boolean isEqual(ListaDuplamenteEncadeada<E> lista2) {
        if (size != lista2.size) return false;

        Item<E> ponteiro1 = this.lista;
        Item<E> ponteiro2 = lista2.lista;

        while (ponteiro1 != null && ponteiro2 != null) {
            if (!ponteiro1.elemento.equals(ponteiro2.elemento)) return false;
            ponteiro1 = ponteiro1.proximo;
            ponteiro2 = ponteiro2.proximo;
        }
        return ponteiro1 == null && ponteiro2 == null;
    }

    public ListaDuplamenteEncadeada<E> merge(ListaDuplamenteEncadeada<E> lista2) {
        if (lista2 == null || lista2.lista == null) return this;

        Item<E> tail = getTail();
        if (tail != null) {
            tail.proximo = lista2.lista;
            lista2.lista.anterior = tail;
        } else {
            lista = lista2.lista;
        }

        size += lista2.size;
        return this;
    }

    public Item<E> getTail() {
        if (lista == null) return null;
        Item<E> ponteiro = lista;
        while (ponteiro.proximo != null) ponteiro = ponteiro.proximo;
        return ponteiro;
    }

    public void clear() {
        lista = null;
        size = 0;
    }

    public static class Item<T> {
        T elemento;
        Item<T> proximo;
        Item<T> anterior;

        Item(T elemento, Item<T> anterior, Item<T> proximo) {
            this.elemento = elemento;
            this.anterior = anterior;
            this.proximo = proximo;
        }

        @Override
        public String toString() {
            return elemento.toString();
        }
    }
}




