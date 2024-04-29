package LinkedList;
class LinkedListManipulation {

  public static LinkedList<Integer> mergeLists(LinkedList<Integer> listaA, LinkedList<Integer> listaB) {
    LinkedList<Integer> merge = new LinkedList<Integer>();
    LinkedList.Item<Integer> ponteiro = listaA.getLista();

    while (ponteiro != null) {
      merge.addTail(ponteiro.elemento);
      ponteiro = ponteiro.proximo;
    }
    ponteiro = listaB.getLista();
    while (ponteiro != null) {
      merge.addTail(ponteiro.elemento);
      ponteiro = ponteiro.proximo;
    }
    return merge;
  }
}