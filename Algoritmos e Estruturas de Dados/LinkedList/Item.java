package LinkedList;  
public class Item<T> {
    T elemento;
    Item<T> proximo;

    Item(T item, Item<T> prox) {
      elemento = item;
      proximo = prox;
    }
  }