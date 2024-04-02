
package aeds;

/**
 *
 * @author Caiquekola
 */
public class Tree<E> {
    
    private Node root;
    
    public Tree(E key){
        createRoot(key);
    }
    public Tree(){
        root = new Node(null,null,null);
    }
    
    public void createRoot(E root){
        this.root = new Node(root, null,null);
    }
    
    
    
    
    
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