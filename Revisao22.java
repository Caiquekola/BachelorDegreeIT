/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Random;
public class Revisao22 {

    
    public static void main(String[] args) {
        Random random = new Random();
        int funcionariosEVendas[][] = new int[7][7];
        int vendas[] = new int[7];
        int mediaVendas[] = new int[7];
        int maiorVendedor=0, codigoMaiorVendedor=0, menorVendedor=999, codigoMenorVendedor=999;
        for (int i = 0; i < funcionariosEVendas.length; i++) {
                funcionariosEVendas[i][0]= random.nextInt(100,999);
                System.out.print(funcionariosEVendas[i][0]+" ");
            for (int j = 1; j < funcionariosEVendas[0].length; j++) {
                funcionariosEVendas[i][j]= random.nextInt(0,20);
                vendas[i] += funcionariosEVendas[i][j];
                System.out.print(funcionariosEVendas[i][j]+" ");
            }
                if(vendas[i]>maiorVendedor){
                    maiorVendedor=vendas[i];
                    codigoMaiorVendedor=funcionariosEVendas[i][0];
                }else if(vendas[i]<menorVendedor){
                    menorVendedor=vendas[i];
                    codigoMenorVendedor=funcionariosEVendas[i][0];
                }
                mediaVendas[i] = vendas[i]/6;
                System.out.println("");
        }
        System.out.println("");
        //media de vendas de cada vendedor
        for (int i = 0; i < mediaVendas.length; i++) {
            System.out.print(mediaVendas[i]+" ");
        }
        System.out.println("");
        //vendas totais de cada
        for (int i = 0; i < mediaVendas.length; i++) {
            System.out.print(vendas[i]+" ");
        }
        System.out.println("\n"+codigoMaiorVendedor);
        System.out.println(codigoMenorVendedor);
        
        
        
        
    }

}
