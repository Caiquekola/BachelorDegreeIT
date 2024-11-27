package com.caiquekola;

<<<<<<< HEAD

import com.caiquekola.ListaEncadeadaRespostas.LinkedList;
import com.caiquekola.ListaEncadeadaRespostas.LinkedListManipulation;
=======
import com.caiquekola.ListaEncadeada.ListaDuplamenteEncadeada;
import com.caiquekola.ListaEncadeada.ListaEncadeada;
>>>>>>> 5e126dd0cf1cee3b54f68dd11ba3caff0bae4d40

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
                System.out.println("Criando Lista");
                LinkedList<Integer> minhaLista = new LinkedList<Integer>();
                System.out.println("Inserindo Elemento");

                minhaLista.addHead(2);// 2, 33, 99, 1000
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
                LinkedList listaB = new LinkedList();
                listaB.addHead(1);// 1 , 3, 50, 60
                listaB.addTail(3);
                listaB.addTail(50);
                listaB.addTail(60);
                System.out.println("############ LISTA B");
                listaB.printLinkedList();
                System.out.println("############ minha lista");
                minhaLista.printLinkedList();
                System.out.println("------------- merge das listas ----------------");
                listaB = LinkedListManipulation.mergeLists(minhaLista, listaB);
                System.out.println("############ merge");
                listaB.printLinkedList();// 33, 2, 99, 1000, 1 , 50, 60

                boolean output = false;
                System.out.println("------------- Removendo Elementos ----------------");
                listaB.printLinkedList();
                System.out.println("############");
                output = listaB.removeElement(3);
                System.out.println(output);
                listaB.printLinkedList();
                output = listaB.removeElement(1);
                System.out.println(output);
                listaB.printLinkedList();
                output = listaB.removeElement(60);
                System.out.println(output);
                listaB.printLinkedList();
                output = listaB.removeElement(2);
                System.out.println(output);
                listaB.printLinkedList();
                output = listaB.removeElement(103);
                System.out.println(output);
                listaB.printLinkedList();
                output = listaB.removeElement(33);
                System.out.println(output);
                listaB.printLinkedList();

                System.out.println("------------- Verificando se duas listas são iguais ----------------");
                boolean equal = false;


                LinkedList<Integer> newList = new LinkedList<Integer>();
                newList.addHead(1);
                newList.addTail(3);
                newList.addTail(50);
                newList.addTail(60);

                LinkedList<Integer> newList2 = new LinkedList<Integer>();
                newList2.addHead(1);
                newList2.addTail(3);
                newList2.addTail(50);
                newList2.addTail(60);

                newList.printLinkedList();
                newList2.printLinkedList();
                System.out.println("As duas listas criadas são iguais?");
                System.out.println(LinkedListManipulation.isEqual(newList, newList2));
            }
        }


=======

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
>>>>>>> 5e126dd0cf1cee3b54f68dd11ba3caff0bae4d40
