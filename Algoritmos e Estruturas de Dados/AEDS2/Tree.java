
package aeds;

/**
 *
 * @author Caiquekola
 */
public class Tree {
    
    private Node root;
    private int length;

    public Tree(int key){
        createRoot(key);
    }
    public Tree(){
        createRoot(0);
    }
    
    private void createRoot(int root){
        this.root = new Node(root, null,null);
    }
    
    public int length(){
        return this.length;
    }
    private void addRight(Node root, int item){
        Node rt = new 
    }
    private void addLeft(Node root, int item){
        
    }
    public void add(int item){
        Node ponter = this.root; 
        insert(item,ponter);
    }
    private boolean insert(int item, Node root){
        if(length()==0){
            createRoot(item);
            return true;
        }
        if(item>root.key){
            if(root.next==null){
                addRight(root.next,item);
            }
                
        }
        
    }
    
}

class Node{
    int key;
    Node next;
    Node left;
    public Node(int key, Node next, Node left){
        this.key = key;
        this.next = next;
        this.left = left;
    }
}