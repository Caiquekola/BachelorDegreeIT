/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package canetapoo;

import java.util.Scanner;
public class CanetaPOO {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a cor da sua caneta: ");
        c1.cor = scan.nextLine();
        
        c1.marca = "bic";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
        
    }

}
