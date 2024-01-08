package queue;
public class Stack<T> {
    private static final int MAX = 5;
    
    protected static int nElementos = -1;
    
    private Object list[];

    public Stack(){
        this.list = new Object[MAX];
    }
    public int tamanho(){
        return this.nElementos;
    }
    public void adicionar(Object obj){
        if(!(list.length==(MAX - 1))){
            list[nElementos+1] = obj;
            nElementos++;
        }
    }
    public void remover(){
        if(list.length!=-1){
            list[nElementos]=null;
            nElementos--;
        }
    }
    public void listar(){
        if(list.length!=-1){
            int x = 0;
            while(x<MAX){
                System.out.println(list[x]);
                x++;
            }
        }
        
    }
}
