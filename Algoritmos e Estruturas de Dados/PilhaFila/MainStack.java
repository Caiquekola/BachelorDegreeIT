package PilhaFila;

public class MainStack {

    
    public static void main(String[] args) {
        Pilha<Object> pilha = new Pilha<>();
        pilha.push(1);
        pilha.push(3);
        pilha.push(2);
        pilha.push("careca");
        System.out.println(pilha.toString());
        pilha.pop();
        pilha.pop();
        System.out.println(pilha.toString());
    }

}
