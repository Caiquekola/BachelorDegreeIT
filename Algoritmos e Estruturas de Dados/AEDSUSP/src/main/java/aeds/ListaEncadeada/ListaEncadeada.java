package aeds.ListaEncadeada;

public class ListaEncadeada<T> {
    ItemEncadeado<T> lista;
    int nElementos;
    ListaEncadeada(){
        lista = new ItemEncadeado<>(null,null,null);
        nElementos = 0;
    }
    ListaEncadeada(T item){
        lista = new ItemEncadeado<>(item,null,null);
        nElementos = 1;
    }
    public boolean vazio(){
        return nElementos ==0;
    }
    public int tamanho(){
        return nElementos;
    }
    public void add(T item){
        if(vazio()){
            nElementos++;
            lista = new ItemEncadeado<>(item,null,null);
        }
        ItemEncadeado<T> ponteiro = lista;
        for(;ponteiro.proximo!=null;ponteiro=ponteiro.proximo){
            ponteiro.proximo = new ItemEncadeado(item,ponteiro,null);

        }
    }
    public void exibir(){
        ItemEncadeado<T> ponteiro = lista;
        for(;ponteiro.proximo!=null;ponteiro=ponteiro.proximo){
            System.out.print(ponteiro.item+" ");

        }
    }
}

class ItemEncadeado<T>{
    T item;
    ItemEncadeado proximo;
    ItemEncadeado anterior;
    ItemEncadeado(T item, ItemEncadeado anterior, ItemEncadeado proximo){
        this.item = item;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    @Override
    public String toString(){
        return "["+item+"]";
    }
}
