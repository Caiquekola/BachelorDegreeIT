package progcompetition;

import java.util.ArrayList;

class LinkedList {

    Item list;
    int length;

    public LinkedList() {
        this.list = new Item(0,null);
        this.length = 0;
    }

    public int get(int index) {
        if(index<0|index>=length|length==0){
            return -1;
        }
        int counter = 0;
        Item pointer = this.list;
        while(counter!=index){
            pointer = pointer.next;
            counter++;
        }
        return pointer.item;
    }

    public void insertHead(int val) {
        if(length==0){
            this.list = new Item(val,null);
            length++;
        }else{
            Item newItem = new Item(val,this.list);
            this.list = newItem;
            length++;
        }
    }

    public void insertTail(int val) {
        if(length==0){
            this.list = new Item(val,null);
            length++;
        }else{
            Item pointer = list;
            while(pointer.next!=null){
                pointer = pointer.next;
            }
            pointer.next = new Item(val,null);
            length++;
        }
    }

    public boolean remove(int index) {
        if(index>=length|index<0|length==0){
            return false;
        }else if(index==0){
            this.list = list.next;
            length--;
        }
        else{
            Item pointer = this.list;
            Item pointerBack = this.list;
            int counter = 0;
            while(counter!=index){
                pointerBack = pointer;
                pointer = pointer.next;
                counter++;
            }
            pointerBack.next = pointer.next;
            length--;
            
            
        }
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        int counter = 0;
        Item pointer = this.list;
        while(counter!=length){
            values.add(pointer.item);
            pointer = pointer.next;
            counter++;
        }
        return values;
    }
}

class Item{
    int item;
    Item next;
    Item(int item, Item next){
        this.item = item;
        this.next = next;
    }
}
