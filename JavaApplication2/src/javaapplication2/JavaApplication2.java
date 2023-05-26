
package javaapplication2;
import java.util.Scanner;


import java.io.BufferedInputStream;
public class JavaApplication2 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(new BufferedInputStream(System.in));
       int contador=0, numeroAtleta=0, alturaAtleta=0, maiorAlturaAtleta=0, maiorAtleta=0;
       numeroAtleta = scan.nextInt();
       alturaAtleta= scan.nextInt();
              
       while(contador<4){
            if(alturaAtleta>maiorAlturaAtleta){
               maiorAlturaAtleta=alturaAtleta;
               maiorAtleta=numeroAtleta;
           }
           numeroAtleta = scan.nextInt();
           alturaAtleta = scan.nextInt();

           contador++;
       }
       System.out.print(maiorAlturaAtleta+ " ");
       System.out.print(maiorAtleta);
       
    }
    
}
