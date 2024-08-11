import java.util.*;

public class EXC12 {
    public static void main(String[] args) {
        ABB arvore = new ABB();
        arvore.add(new Node(1,1));
        arvore.add(new Node(2,10));
        arvore.add(new Node(3,13));
        arvore.add(new Node(4,14));
        arvore.add(new Node(5,11));
        arvore.add(new Node(6,19));

        System.out.println("Árvore inicializada:");
        arvore.showInOrder();

        System.out.println("\nÁrvore organizada pelos acessos:");
        arvore.reorganizeTreeByAccesses();
        arvore.showInOrder();
    }
}

class Node{
    int value, views;
    Node left, right;

    public Node(int value, int views) {
        this.value = value;
        this.views = views;
    }

    public Node(int value) {
        this.value = value;
        this.views = 0;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                ", views=" + views +
                '}';
    }
}

class ABB{
    Node root;

    public ABB(Node root) {
        this.root = root;
    }

    public ABB() {
        root = null;
    }

    //insert
    //search
    //reogarnize

    void add(Node node){
        if(this.root == null){
            this.root = node;
            return;
        }
        add(node, this.root);
    }
    void add(Node node, Node root) {
        if(root == null){
            return;
        }
        if(node.value<root.value){
            if(root.left == null){
                root.left = node;
            }else{
                add(node, root.left);
            }
        }else{
            if(root.right == null){
                root.right = node;
            }else {
                add(node, root.right);
            }
        }
    }

    Node search(int value){
            return search(value, this.root);
    }
    Node search(int value, Node root){
        if(root == null){
            return null;
        }
        if(root.value==value){
            root.views ++;
        }
        if(value<root.value){
            return search(value, root.left);
        }else{
            return search(value, root.right);
        }

    }

    //Percorrer toda a árvore (inOrder) e adiciono em uma lista

    void inOrderList(Node root, List<Node> nodes){
        if(root == null){
            return;
        }

        inOrderList(root.left, nodes);
        nodes.add(root);
        inOrderList(root.right, nodes);
    }

    //Ordenacao dos Nós baseado nas quantidades de views

    List<Node> sortNodes(List<Node> nodes){
        Collections.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.views, o2.views);
            }
        });
        return nodes;
    }

    Node buildBalancedTree(List<Node> nodes, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node root = nodes.get(mid);

        root.left = buildBalancedTree(nodes, start, mid - 1);
        root.right = buildBalancedTree(nodes, mid + 1, end);

        return root;
    }


    void reorganizeTreeByAccesses() {
        List<Node> nodes = new ArrayList<>();
        inOrderList(this.root, nodes);
        sortNodes(nodes);
        this.root =  buildBalancedTree(nodes, 0, nodes.size() - 1);
    }



    void showInOrder(){
        showInOrder(this.root);
    }

    void showInOrder(Node root){
        if(root == null){
            return;
        }
        showInOrder(root.left);
        System.out.println(root);
        showInOrder(root.right);

    }


}