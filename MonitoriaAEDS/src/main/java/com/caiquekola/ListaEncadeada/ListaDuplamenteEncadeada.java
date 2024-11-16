package com.caiquekola.ListaEncadeada;



public class ListaDuplamenteEncadeada <E>{
    private Item<E> lista;
    private int size;

    public ListaDuplamenteEncadeada() {
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
            lista = new Item<E>(item, null,null);
        } else {
            Item<E> novoItem = new Item<E>(item, null,lista);
            lista.anterior = novoItem;
            lista = novoItem;
        }
        size++;
    }

    public void addTail(E item) {
        if (lista == null) {
            lista = new Item<E>(item, null,null);
        } else {
            Item<E> ponteiro = lista;
            for (; ponteiro.proximo != null; ponteiro = ponteiro.proximo) {
            }
            ponteiro.proximo = new Item<E>(item, ponteiro,null);
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
                ponteiro.proximo.anterior = ponteiro;
                size--;
                return true;
            }
            ponteiro = ponteiro.proximo;
        }
        return false;
    }

    public boolean isEqual(ListaDuplamenteEncadeada<E> lista2) {
        if(size != lista2.getSize()) {
            return false;
        }
        Item<E> ponteiroLista1 = this.lista;
        Item<E> ponteiroLista2 = lista2.lista;

        while(ponteiroLista1.proximo != null) {
            if(!(ponteiroLista1.elemento.equals(ponteiroLista2))) {
                return false;
            }
            ponteiroLista2 = ponteiroLista2.proximo;
            ponteiroLista1 = ponteiroLista1.proximo;
        }
        return true;
    }

    public ListaDuplamenteEncadeada<E> merge(ListaDuplamenteEncadeada<E> lista2) {
        ListaDuplamenteEncadeada<E> novaLista = new ListaDuplamenteEncadeada<>();
        Item<E> ponteiro = this.lista;

        for(; ponteiro != null; ponteiro = ponteiro.proximo) {
            novaLista.addTail(ponteiro.elemento);
        }

        ponteiro = lista2.lista;

        for(; ponteiro != null; ponteiro = ponteiro.proximo) {
            novaLista.addTail(ponteiro.elemento);
        }

        return novaLista;
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
        Item<T> anterior;

        Item(T item, Item<T> anterior, Item<T> prox) {
            elemento = item;
            proximo = prox;
            this.anterior = anterior;
        }
    }

}



