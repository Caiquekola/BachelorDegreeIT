package LinkedList;
public class Main {

    
    public static void main(String[] args) {
        System.out.println("Criando Lista");
        DoublyLinkedList minhaLista = new DoublyLinkedList();
        System.out.println("Inserindo Elemento");

        minhaLista.addHead(2);
        minhaLista.addHead(33);
        minhaLista.addTail(99);
        minhaLista.addTail(1000);
        minhaLista.printLinkedList();   

        System.out.println("Checando se um elemento existe na lista");
        boolean exist = minhaLista.elementExist(99);
        System.out.println("O elemento 99 existe? " + exist);
        exist = minhaLista.elementExist(100);
        System.out.println("O elemento 100 existe? " + exist);

        // merge de lista
        DoublyLinkedList listaB = new DoublyLinkedList();
        listaB.addHead(1);
        listaB.addTail(3);
        listaB.addTail(50);
        listaB.addTail(60);

        listaB = DoublyLinkedListManipulation.mergeLists(minhaLista, listaB); 
        listaB.printLinkedList();   
    }

}
class DoublyLinkedListManipulation {
    public static DoublyLinkedList<Integer> mergeLists(DoublyLinkedList<Integer> listaA, DoublyLinkedList<Integer> listaB) {
        DoublyLinkedList<Integer> merge = new DoublyLinkedList<Integer>();
        DoublyLinkedList.Item<Integer> ponteiro = listaA.getLista();

        while (ponteiro != null) {
            merge.addTail(ponteiro.elemento);
            ponteiro = ponteiro.proximo;
        }
        ponteiro = listaB.getLista();
        while (ponteiro != null) {
            merge.addTail(ponteiro.elemento);
            ponteiro = ponteiro.proximo;
        }
        return merge;
    }
}

class DoublyLinkedList<E> {
    private Item<E> lista;
    private int size;

    public DoublyLinkedList() {
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
            lista = new Item<E>(item, null, null);
        } else {
            Item<E> novoItem = new Item<E>(item, lista, null);
            lista.anterior = novoItem;
            lista = novoItem;
        }
        size++;
    }

    public void addTail(E item) {
        if (lista == null) {
            lista = new Item<E>(item, null, null);
        } else {
            Item<E> ponteiro = lista;
            while (ponteiro.proximo != null) {
                ponteiro = ponteiro.proximo;
            }
            ponteiro.proximo = new Item<E>(item, null, ponteiro);
        }
        size++;
    }

    public boolean elementExist(E item) {
        if (lista == null)
            return false;
        Item<E> ponteiro = lista;
        do {
            if (ponteiro.elemento == item)
                return true;
            ponteiro = ponteiro.proximo;
        } while (ponteiro != null);
        return false;
    }

    public void printLinkedList() {
        Item<E> ponteiro = lista;
        System.out.println("Imprimindo a Lista duplamente encadeada");
        for (; ponteiro != null; ponteiro = ponteiro.proximo) {
            System.out.println(ponteiro.elemento);
        }
    }

    static class Item<T> {
        T elemento;
        Item<T> proximo;
        Item<T> anterior;

        Item(T item, Item<T> prox, Item<T> ant) {
            elemento = item;
            proximo = prox;
            anterior = ant;
        }
    }
}