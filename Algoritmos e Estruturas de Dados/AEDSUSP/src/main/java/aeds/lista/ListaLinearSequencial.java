package aeds.lista;

public class ListaLinearSequencial {
    public final static int tamanho = 5;

    private static Lista lista;

    ListaLinearSequencial() {
        lista = new Lista();
    }

    ListaLinearSequencial(int item) {
        lista = new Lista(item);
    }

    public static boolean add(int item) {
        if (Lista.getNElementos() == tamanho()) {
            return false;
        }
        Lista.getNumeros()[tamanho()] = item;
        return true;
    }


    public static int tamanho() {
        return Lista.getNElementos();
    }

    public static void exibir() {
        int[] num = Lista.getNumeros();
        for (int i = 0; i < num.length; i++) {
            System.out.print("[" + num[i] + "]");
        }
    }


}

class Lista {
    private static final int[] numeros = new int[ListaLinearSequencial.tamanho];
    private static int nElementos = 0;

    public Lista() {
        nElementos = 0;
    }

    public Lista(int item) {
        numeros[0] = item;
        nElementos = 1;
    }

    public static int[] getNumeros() {
        return numeros;
    }

    public static int getNElementos() {
        return nElementos;
    }
}