
package aeds;

/**
 *
 * @author Caiquekola
 */
public class Tree<E> {
    
    public Tree(E key){
        this.root = new Node(key,null,null);
    }
    public Tree(){
        root = new Node(null,null,null);
    }
    
    private Node root;
    
    
}

class Node<E>{
    E key;
    Node next;
    Node left;
    public Node(E key, Node next, Node left){
        this.key = key;
        this.next = next;
        this.left = left;
    }
}