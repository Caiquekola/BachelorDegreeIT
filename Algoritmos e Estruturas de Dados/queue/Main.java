/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author 0056837
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> pilha = new Stack<Integer>();
        pilha.adicionar(1);
        pilha.adicionar(5);
        pilha.listar();
        pilha.remover();
        System.out.println("Removis");
        pilha.listar();
        System.out.println("Fila:");
        Queue<Integer> fila = new Queue<Integer>();
        fila.adicionarElemento(1);
        fila.adicionarElemento(2);
        fila.listar();
        fila.removerElemento();
        fila.listar();
    }
    
}
