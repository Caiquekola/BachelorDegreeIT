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
public class insertSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int posicaoAnterior, posicaoAtual,menorPosicaoAtual ,contExibirPosicao = 1;
        int insertSort[] = new int[5];
        
        for(posicaoAtual = 0; posicaoAtual < insertSort.length; posicaoAtual++){
            System.out.print("Informe o "+ contExibirPosicao++ +"° elemento: ");
            insertSort[posicaoAtual] = Teclado.nextInt();
        }
        for(posicaoAtual = 1; posicaoAtual < insertSort.length; posicaoAtual++){
            menorPosicaoAtual = insertSort[posicaoAtual];
            posicaoAnterior = posicaoAtual - 1;
            
            while(posicaoAnterior >= 0 && insertSort[posicaoAnterior] > menorPosicaoAtual){
                    insertSort[posicaoAnterior + 1] = insertSort[posicaoAnterior];    
                    posicaoAnterior--;
            }
            insertSort[posicaoAnterior + 1] = menorPosicaoAtual;
        }
        
        contExibirPosicao = 1;
         for(posicaoAtual = 0; posicaoAtual < insertSort.length; posicaoAtual++){
             System.out.println(contExibirPosicao++ + "°: "+ insertSort[posicaoAtual]);
             System.out.println(insertSort[posicaoAtual]);
         }
    }   
}
