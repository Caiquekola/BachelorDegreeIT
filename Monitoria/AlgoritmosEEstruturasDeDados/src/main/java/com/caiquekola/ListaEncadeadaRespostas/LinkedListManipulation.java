package com.caiquekola.ListaEncadeadaRespostas;

public class LinkedListManipulation {

    public static boolean isEqual(LinkedList listaA, LinkedList listaB) {
        // Verificar se as duas listas são iguais
        if(listaA.getSize() != listaB.getSize()){
            return false;
        }
        LinkedList.Item ponteiroA = listaA.getLista();
        LinkedList.Item ponteiroB = listaB.getLista();
        while(ponteiroA != null&&ponteiroB!=null){
            if(!ponteiroA.elemento.equals(ponteiroB.elemento)){
                return false;
            }
            //Avanço de nó
            ponteiroA = ponteiroA.proximo;
            ponteiroB = ponteiroB.proximo;
        }
        return true;
    }



    public static LinkedList mergeLists(LinkedList listaA, LinkedList listaB) {
        // Sejam duas listas A e B. Implemente o método para fazer o merge entre as duas listas, que B seja adicionado no final de A.
        LinkedList listaC = listaA;
        LinkedList.Item ponteiroB = listaB.getLista();
        LinkedList.Item ponteiroC = listaC.getLista();
        while(ponteiroC.proximo!=null){
            ponteiroC = ponteiroC.proximo;
        }
        ponteiroC.proximo = ponteiroB;
        return listaC;
    }

}
