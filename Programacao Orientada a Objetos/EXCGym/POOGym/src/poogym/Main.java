package poogym;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static Scanner scan = new Scanner(System.in);
    static String resposta="null";
    public static void main(String[] args) {
        
        do{
            System.out.println("----------------------");
            System.out.println("    FITNESS CLUB");
            
            
            
            resposta = scan.nextLine().trim().toUpperCase();
        }while(!resposta.startsWith("S"));
        
    }

    
}
