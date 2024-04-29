/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinalRecursivo;

class Item3<O> {

    O item;
    Item3<O> proximo;
    Item3<O> anterior;

    public Item3(O item, Item3 anterior, Item3 proximo) {
        this.item = item;
        this.anterior = anterior;
        this.proximo = proximo;
    }
}

public class ListaDuplamenteEncadeadaCircular<O> {

    private int numerosNo = 0;
    private Item3<O> lista;

    public ListaDuplamenteEncadeadaCircular() {
        lista = null;
    }

    public int tamanho() {
        return numerosNo;
    }

    public boolean vazio() {
        return (numerosNo == 0);
    }

    //EXC 2;
    public void exibirNo(int index) {
        if (index != 1 & index != tamanho()) {
            Item3<O> ponteiro = lista;
            int contador = 1;
            while (contador != index) {
                ponteiro = ponteiro.proximo;
                contador++;
            }
            System.out.println("\n"+ponteiro.anterior.item+" "+ponteiro.item+" "+ponteiro.proximo.item);
        }

    }

    //EXC 4;
    public Item3<O> removerNo(int index) {
        Item3<O> ponteiro = lista;
        Item3<O> anterior = null;
        if (index <= tamanho()) {
            int contador = 1;
            while (contador != index) {
                anterior = ponteiro;
                ponteiro = ponteiro.proximo;
                contador++;
            }
            anterior.proximo = ponteiro.proximo;
            ponteiro.proximo.anterior = anterior;
        }
        return anterior;
    }

    public void addFim(O item) {
        Item3<O> novoItem = new Item3<>(item, null, null);
        if (vazio()) {
            lista = new Item3(item, null, null);
        } else {
            Item3<O> ponteiro = lista;
            lista.anterior = novoItem;
            while (ponteiro.proximo != null) {
                ponteiro = ponteiro.proximo;
            }
            ponteiro.proximo = novoItem;
            novoItem.anterior = ponteiro;
        }
        numerosNo++;
    }
    //EXC 5;
    public void listar() {
        Item3 ponteiro = lista;
        int contador = 0;
        while (contador!=tamanho()) {
            System.out.print(ponteiro.item + " ");
            ponteiro = ponteiro.proximo;
            contador++;
        }
    }
}
