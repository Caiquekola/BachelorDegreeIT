/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package estojopoo;


public class EstojoPOO {

    
    public static void main(String[] args) {
        Estojo estojo = new Estojo();
        estojo.cor = "Vermelho";
        estojo.desenho = "Angry Birds";
        estojo.canetas =5;
        estojo.lapis=0;
        estojo.Status();
        estojo.rmCanetas();
        estojo.adcCanetas(5);
        estojo.Status();
    }

}
