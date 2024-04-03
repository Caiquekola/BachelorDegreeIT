package AEDS2;

public class Tree {

    Node root;
    private int length;

    public Tree(int item) {
        this.root = createRoot(item);
        this.length = 1;
    }

    public Tree() {
        this.root = createRoot(0);
        this.length = 0;
    }
    
    private int length(){
        return this.length;
    }
    private Node createRoot(int item) {
        Node root = new Node(item, null, null);
        return root;
    }
    
    public void add(int item){
        Node pointer = this.root;
        insert(item,pointer);
    }
    //Suponhamos que não há valores duplicados
    //We imagine there are not duplicate values
    private boolean insert(int item, Node root){
        if(length()==0){
            this.root = createRoot(item);
            return true;
        } else if(item>root.key){
            
            if(root.right==null){
                Node aux = new Node(item,null,null);
                root.right = aux;
            }else{
                return insert(item,root.right);
            }
            
        } else {
            if(root.left==null){
                Node aux = new Node(item,null,null);
                root.left = aux;
            }else{
                return insert(item,root.left);
            }
        }
        return false;
    }
}

class Node {

    int key;
    Node left, right;

    public Node(int key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}
