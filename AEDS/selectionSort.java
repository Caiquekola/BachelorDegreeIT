/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrdenarDados;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class selectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    int selectionSort[] = new int [4];
    int menorPosicaoDoIntervalo, aux, contExibirPosicao = 1;
    
    for(int posicaoAtual = 0; posicaoAtual < selectionSort.length;posicaoAtual++){
        System.out.print("Informe o "+ contExibirPosicao++ + "� elemento: ");
        selectionSort[posicaoAtual] = Teclado.nextInt();
    }
    
    /*Esse for estipula o inicio do intervalo de compara��o!
    A medida que as trocas v�o ocorrendo esse intervalo de compara��o vai diminuindo, visto que as menores
    posi��es v�o sendo encontradas!
    */  
    for(int posicaoAtual = 0; posicaoAtual < (selectionSort.length - 1);posicaoAtual++){
            menorPosicaoDoIntervalo = posicaoAtual;

            for(int posicaoAFrente = (posicaoAtual + 1); posicaoAFrente < selectionSort.length;posicaoAFrente++){
                //Esse if compara o menor valor encontrado dentro de um intervalo no vetor!
                if(selectionSort[posicaoAFrente] < selectionSort[menorPosicaoDoIntervalo]){
                    menorPosicaoDoIntervalo = posicaoAFrente;
                }
                
                //Esse if compara se o menor valor encontrado � diferente do que est� na posi��o atual.
                if(selectionSort[posicaoAtual] != selectionSort[menorPosicaoDoIntervalo]){
                    aux = selectionSort[posicaoAtual];
                    selectionSort[posicaoAtual] = selectionSort[menorPosicaoDoIntervalo];
                    selectionSort[menorPosicaoDoIntervalo] = aux;
                }
            }
        }
        contExibirPosicao = 1;
        for(int posicaoAtual = 0; posicaoAtual < selectionSort.length;posicaoAtual++){
            System.out.println(contExibirPosicao++ + "�: "+ selectionSort[posicaoAtual]);
        }
    }
}
