
public class Main{
    public static void main (String[] args) {
        Tree arvore = new Tree(5);
        System.out.println(arvore.size());
        System.out.println(arvore.add(3));
        System.out.println(arvore.size());
        
    }
}
class Tree {

    Node root;
    private int size;

    public Tree(int item) {
        this.root = createRoot(item);
        this.size = 1;
    }

    public Tree() {
        this.root = createRoot(0);
        this.size = 0;
    }
    
    public int size(){
        return this.size;
    }
    private Node createRoot(int item) {
        Node root = new Node(item, null, null);
        return root;
    }
    
    public boolean add(int item){
        Node pointer = this.root;
        return insert(item,pointer);
    }
    //Suponhamos que não há valores duplicados
    //We imagine there are not duplicate values
    private boolean insert(int item, Node root){
        if(size()==0){
            this.root = createRoot(item);
            size++;
            return true;
        } else if(item>root.key){
            
            if(root.right==null){
                Node aux = new Node(item,null,null);
                root.right = aux;
                size++;
                return true;
            }else{
                return insert(item,root.right);
            }
            
        } else {
            if(root.left==null){
                Node aux = new Node(item,null,null);
                root.left = aux;
                size++;
                return true;
            }else{
                return insert(item,root.left);
            }
        }
        
    }
    
    public boolean valueExist(int item){
        Node pointer = this.root;
        return searchValue(item,pointer);
    }
    
    private boolean searchValue(int item, Node root){
        
        if(size()==0){
            return false;
        }
        if(item==root.key){
            return true;
        }
        if(item>root.key){
            if(root.right==null){
                return false;
            }else{
                return (searchValue(item,root.right));
            }
        }else{
            if(root.left==null){
                return false;
            }else{
                return searchValue(item,root.left);
            }
        }
        
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
