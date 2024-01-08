/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author 0056837
 */
public class Queue<T> {
    
    private final int MAX = 5;
    protected int nItems = -1;
    private int cabeca = 0;
    private int cauda = 0;
    private Object list[];
    
    public Queue(){
        this.list = new Object[MAX];
    }
    
    public boolean vazia(){
        if(nItems==-1){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean cheia(){
        if(nItems==(MAX-1)){
            return true;
        }else{
            return false;
        }
    }
    
    public void adicionarElemento(Object obj){
        if(!cheia()){
            nItems++;
            list[cauda] = obj;
            if(cauda<MAX-1){
                cauda++;
            }else{
                cauda=0;
            }
            cauda++;
        }else{
            System.out.println("ERRO, CHEIA!");
        }
    }
    public Object removerElemento(){
        if(!vazia()){
            nItems--;
            Object objt = list[cabeca];
            if(cabeca<MAX-1){
                cabeca++;
            }else{
                cabeca=0;
            }
            return objt;
        }else{
            return false;
        }
    }
    public void listar(){
        if(list.length!=-1){
            int x = cabeca;
            while(x!=cauda-1){
                if(x==MAX){
                    x=0;
                }
                System.out.println(list[x]);
                x++;
            }
        }
        
    }
}
