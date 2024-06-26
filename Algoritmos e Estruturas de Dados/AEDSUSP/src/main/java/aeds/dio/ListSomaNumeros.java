package aeds.dio;

import java.util.ArrayList;
import java.util.List;

public class ListSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros lista = new SomaNumeros();
        lista.adicionarNumero(5);
        lista.adicionarNumero(7);
        lista.adicionarNumero(3);
        lista.adicionarNumero(9);
        System.out.println("Maior n: "+lista.encontrarMaiorNumero());
        System.out.println("Menor n: "+lista.encontrarMenorNumero());
        lista.calcularSoma();
        lista.exibirNumeros();
    }
}

class SomaNumeros{
    private List<Integer> integerList;

    public SomaNumeros(){
        integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    public int calcularSoma(){
        int somatorio = 0;
        for(Integer i:integerList){
            somatorio += i;
        }
        System.out.println(somatorio);
        return somatorio;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!integerList.isEmpty()) {
            for (Integer i : integerList) {
                if (i > maior) {
                    maior = i;
                }
            }
            return maior;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }
    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!integerList.isEmpty()) {
            for (Integer i : integerList) {
                if (i < menor) {
                    menor = i;
                }
            }
            return menor;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }

    }
    public void exibirNumeros(){
        System.out.println(integerList);
    }


}