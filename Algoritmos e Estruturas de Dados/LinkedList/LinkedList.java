package LinkedList;
class LinkedList<E> {
  private Item<E> lista;
  private int size;

  public LinkedList() {
    lista = null;
  }

  public Item<E> getLista() {
    return lista;
  }

  public int getSize() {
    return size;
  }

  public void addHead(E item) {
    if (lista == null) {
      lista = new Item<E>(item, null);
    } else {
      Item<E> novoItem = new Item<E>(item, lista);
      lista = novoItem;
    }
    size++;
  }

  public void addTail(E item) {
    if (lista == null) {
      lista = new Item<E>(item, null);
    } else {
      Item<E> ponteiro = lista;
      for (; ponteiro.proximo != null; ponteiro = ponteiro.proximo) {
      }
      ponteiro.proximo = new Item<E>(item, null);
    }
    size++;
  }

  public boolean elementExist(E item) {
    if (lista == null)
      return false;
    Item<E> ponteiro = lista;
    do {
      if (ponteiro.elemento == item)
        return true;
      ponteiro = ponteiro.proximo;
    } while (ponteiro != null);
    return false;
  }

  public void printLinkedList() {
    Item<E> ponteiro = lista;
    System.out.println("Imprimindo a Lista encadeada");
    for (; ponteiro != null; ponteiro = ponteiro.proximo) {
      System.out.println(ponteiro.elemento);
    }
  }

  public static class Item<T> {
    T elemento;
    Item<T> proximo;

    Item(T item, Item<T> prox) {
      elemento = item;
      proximo = prox;
    }
  }

}