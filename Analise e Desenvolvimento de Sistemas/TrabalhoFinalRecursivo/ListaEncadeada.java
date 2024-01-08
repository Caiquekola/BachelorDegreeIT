package TrabalhoFinalRecursivo;

class Item<O>{
    
    O elemento;
    Item<O> proximo;
    
    public Item(O elemento, Item<O> proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }
}
public class ListaEncadeada<O> {
    private int tamanho = 0;
    private Item<O> lista;
    
    public ListaEncadeada(){
        lista = null;
    }
    //EXC 1 Listas Encadeadas
    public int tamanhoNo(){
        Item<O> ponteiro = lista;
        int tamanhoNo = 0;
        while(ponteiro!=null){
            tamanhoNo++;
            ponteiro = ponteiro.proximo;
        }
        return tamanhoNo;
    }
    //EXC 3 Remover nó
    public Item<O> removerNo(int index){
        Item ponteiro = lista;
        Item anteriorPonteiro = lista;
        if(index<=tamanhoNo()&index!=0){
            int contador = 1;
            while(contador!=index){
                anteriorPonteiro = ponteiro;
                ponteiro = ponteiro.proximo;
                contador++;
            }
            anteriorPonteiro.proximo = ponteiro.proximo;
        }
        return anteriorPonteiro;
    }
    
    public boolean vazio(){
        return (tamanho==0);
    }
    
    public void addFim(O elemento){
        if(vazio()){
            lista = new Item<O>(elemento,null);
        }else{
            Item<O> ponteiro = lista;
            while(ponteiro.proximo!=null){
                ponteiro = ponteiro.proximo;
            }
            ponteiro.proximo = new Item<>(elemento,null);
        }
        tamanho++;
    }
    public void listar(){
        Item<O> ponteiro = lista;
        while(ponteiro!=null){
            System.out.print(ponteiro.elemento+" ");
            ponteiro = ponteiro.proximo;
        }
    }
}
 