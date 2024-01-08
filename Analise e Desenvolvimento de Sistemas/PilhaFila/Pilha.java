/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PilhaFila;


public class Pilha<Item> {
    private Item[] list;
    private int nElements;
    private int MAX = 5;
    public Pilha(){
        this.list = (Item[])new Object[5];
        this.nElements = 0;
    }
    
    public boolean isEmpty(){
        if(nElements==0){
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull(){
        if(nElements==list.length){
            return true;
        }else{
            return false;
        }
    }
    public boolean push(Item item){
        if(nElements==list.length){
            return false;
        }else{
            list[nElements] = item;
            nElements++;
            return true;
        }
    }
    public boolean pop(){
        if(nElements==0){
            return false;
        }else{
            list[nElements] = null;
            nElements--;
            return true;
            
        }
    }
    public int size(){
        return nElements;
    }
    public String toString(){
        String str = "";
        for (int i = 0; i < nElements; i++) {
            str += String.valueOf(list[i])+" ";
        }
        return str;
    }
}
