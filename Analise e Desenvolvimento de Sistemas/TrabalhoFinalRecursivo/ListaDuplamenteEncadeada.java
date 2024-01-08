/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinalRecursivo;

class Item2<O> {

    O item;
    Item2<O> proximo;
    Item2<O> anterior;

    public Item2(O item, Item2 anterior, Item2 proximo) {
        this.item = item;
        this.anterior = anterior;
        this.proximo = proximo;
    }
}

public class ListaDuplamenteEncadeada<O> {

    private int numerosNo = 0;
    private Item2<O> lista;

    public ListaDuplamenteEncadeada() {
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
            Item2<O> ponteiro = lista;
            int contador = 1;
            while (contador != index) {
                ponteiro = ponteiro.proximo;
                contador++;
            }
            System.out.println("\n"+ponteiro.anterior.item+" "+ponteiro.item+" "+ponteiro.proximo.item);
        }

    }

    //EXC 4;
    public Item2<O> removerNo(int index) {
        Item2<O> ponteiro = lista;
        Item2<O> anterior = null;
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
        Item2<O> novoItem = new Item2<>(item, null, null);
        if (vazio()) {
            lista = new Item2(item, null, null);
        } else {
            Item2<O> ponteiro = lista;
            while (ponteiro.proximo != null) {
                ponteiro = ponteiro.proximo;
            }
            ponteiro.proximo = novoItem;
            novoItem.anterior = ponteiro;
        }
        numerosNo++;
    }

    public void listar() {
        Item2 ponteiro = lista;
        while (ponteiro != null) {
            System.out.print(ponteiro.item + " ");
            ponteiro = ponteiro.proximo;
        }
    }
}
