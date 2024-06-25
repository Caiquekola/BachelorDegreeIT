package aeds.dio;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getnome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class CarrinhoDeCompras{
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> removeList = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item item :itemList){
                if(item.getnome().equalsIgnoreCase(nome)){
                    removeList.add(item);
                }
            }
        }
        itemList.removeAll(removeList);
    }

    public double calcularValorTotal(){
        double precoTotal = 0;
        for(Item item: itemList){
            precoTotal += item.getPreco()*item.getQuantidade();
        }
        return precoTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
}

class Teste{
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("banana",2.6,4);
        carrinhoDeCompras.adicionarItem("abacate",4.5,4);
        carrinhoDeCompras.exibirItens();
        System.out.println("VALOR TOTAL: R$"+carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("banana");
        carrinhoDeCompras.exibirItens();
    }
}