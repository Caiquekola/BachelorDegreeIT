package LinkedList;
class DoublyLinkedListManipulation {
    public static DoublyLinkedList<Integer> mergeLists(DoublyLinkedList<Integer> listaA, DoublyLinkedList<Integer> listaB) {
        DoublyLinkedList<Integer> merge = new DoublyLinkedList<Integer>();
        DoublyLinkedList.Item<Integer> ponteiro = listaA.getLista();

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