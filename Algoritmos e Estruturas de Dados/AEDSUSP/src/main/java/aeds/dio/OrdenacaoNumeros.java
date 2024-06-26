package aeds.dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> integerList;
    public OrdenacaoNumeros(){
        integerList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        integerList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        if(!integerList.isEmpty()){
            List<Integer> numerosAscendente = new ArrayList<>(integerList);
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        if(!integerList.isEmpty()){
            List<Integer> numerosDescendente = new ArrayList<>(integerList);
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return integerList.toString();
    }

    public static void main(String[] args) {
        //Criando uma instância da classe OrdanacaoNumeros;
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        //Atribuindo valores a lista de numeros
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        numeros.adicionarNumero(3);

        //Exibindo a lista de números
        System.out.println(numeros);

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordenarDescendente());
    }
}
