package com.caiquekola.ListaEncadeadaRespostas;

public class LinkedList<E> {
    private Item<E> lista;
    private int size;

    public LinkedList() {
        lista = null;
    }

    public Item<E> getLista() {
        return lista;
    }

    public int getSize() {
        return size;
    }

    public void addHead(E item) {
        // Se a lista estiver vazia, ela será o início de toda a lista
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
            // 1 2 3 --> (4)
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
        // 1 2 3
        //Se o elemento a ser removido é o primeiro item.
        if(lista.elemento.equals(item)){
            lista = lista.proximo;
            size--;
            return true;
        }
        Item<E> ponteiro = lista;
        // 1 2 (3) 4 5
        // Varredura da lista
        while (ponteiro.proximo != null) {
            // Verifica se o próximo nó contém o elemento a ser removido
            if (ponteiro.proximo.elemento.equals(item)) {
                // Remove o próximo nó
                ponteiro.proximo = ponteiro.proximo.proximo;
                size--; // Reduz o tamanho da lista
                return true;
            }
            // Avança para o próximo nó
            ponteiro = ponteiro.proximo;
        }
        return false;
        // Implementar a remocao de um elemento na lista
    }

    public boolean elementExist(E item) {
        if (lista == null)
            return false;
        Item<E> ponteiro = lista;
        while(ponteiro!=null){
            if(ponteiro.elemento.equals(item)){
                return true;
            }
            ponteiro = ponteiro.proximo;
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

    // Integer, Boolean, String
    public static class Item<T> {
        T elemento;
        Item<T> proximo;

        Item(T item, Item<T> prox) {
            elemento = item;
            proximo = prox;
        }
    }



}

