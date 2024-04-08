/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTree;

/**
 *
 * @author 0056837
 */
public class TreeEvolution {

    private Node root;
    private int length;

    public TreeEvolution(Node root) {
        this.root = root;
        length = 1;
    }

    //Insercao Remocao Contagem Busca
    public boolean add(int value) {
        if (length == 0) {
            length++;
            this.root.value = value;
            return true;
        }
        length++;
        Node pointer = this.root;
        return put(value, pointer);
    }

    private boolean put(int value, Node root) {

        if (value > root.value) {
            if (root.next != null) {
                return put(value, root.next);
            } else {
                Node next = new Node(value, null, null);
                root.next = next;
                return true;
            }
        } else if (value < root.value) {
            if (root.previous != null) {
                return put(value, root.previous);
            } else {
                Node previous = new Node(value, null, null);
                root.previous = previous;
                return true;
            }
        }
        return false;

    }

    public boolean contains(int target) {
        if (length == 0) {
            return false;
        }
        Node pointer = this.root;
        return search(target, pointer);
    }

    private boolean search(int target, Node root) {
        if (root == null) {
            return false;
        }
        if (target == root.value) {
            return true;
        }
        if (target > root.value) {
            return search(target, root.next);
        }
        return search(target, root.previous);

    }
    
    public int length(){
        Node pointer = this.root;
        return size(pointer);
        
    }
    private int size(Node root){
        if(root==null) return 0;
        return size(root.previous)
                + 1 
                + size(root.next);
        
    }
    @Override
    public String toString(){
        Node pointer = this.root;
        return inString(pointer);
    }
    private String inString(Node root){
        if(root!=null){
            System.out.print(root.value);
            System.out.print("(");
            inString(root.previous);
            inString(root.next);
            System.out.print(")");
        }
        return "";
    }
}

class Node {

    int value;
    Node next;
    Node previous;

    public Node(int value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}

class Teste {

    public static void main(String[] args) {

        TreeEvolution arvore = new TreeEvolution(new Node(5, null, null));
        System.out.println(arvore.contains(5));
        arvore.add(7);
        arvore.add(3);
        arvore.add(2);
        arvore.add(4);
        System.out.println(arvore.contains(9));
        System.out.println(arvore.length());
        arvore.toString();
    }
}
