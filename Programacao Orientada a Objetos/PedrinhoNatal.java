/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacaoorientadao;

/**
 *
 * @author 0056837
 */
import java.util.Scanner;
public class PedrinhoNatal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int mes=0,dia=0,diaNatal=360,diaAteNatal=0;
        while(mes!=12|dia!=25){
            mes = scan.nextInt();
            dia = scan.nextInt();
            if(mes==12&dia==24){
                System.out.println("E vespera de natal!");
            }else if(mes==12&dia>25){
                System.out.println("Ja passou!");
            }else if(mes==12&dia==25){
                System.out.println("E natal!");
            }else{
                    if(mes==1){
                        diaAteNatal=diaNatal-dia;
                    }else if(mes==2){
                        diaAteNatal=diaNatal-dia-31;
                    }else if(mes==3){
                        diaAteNatal=diaNatal-dia-60;
                    }else if(mes==4){
                        diaAteNatal=diaNatal-dia-91;
                    }else if(mes==5){
                        diaAteNatal=diaNatal-dia-121;
                    }else if(mes==6){
                        diaAteNatal=diaNatal-dia-151;
                    }else if(mes==7){
                        diaAteNatal=diaNatal-dia-182;
                    }else if(mes==8){
                        diaAteNatal=diaNatal-dia-212;
                    }else if(mes==9){
                        diaAteNatal=diaNatal-dia-243;
                    }else if(mes==10){
                        diaAteNatal=diaNatal-dia-273;
                    }else if(mes==11){
                        diaAteNatal=diaNatal-dia-304;
                    }else if(mes==12){
                        diaAteNatal=diaNatal-dia-304;
                    }
                    
                System.out.println("Faltam "+diaAteNatal+" dias para o natal!");
                    
            }
            
            
        }
        
        
    }
    
}
