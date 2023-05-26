
package salariobrutoeprestacao;
import java.util.Scanner;
import java.io.BufferedInputStream;

      
        
public class SalarioBrutoEPrestacao {

   
    public static void main(String[] args) {
       Scanner scan = new Scanner(new BufferedInputStream(System.in));
       float salario = scan.nextFloat();
       float parcela = scan.nextFloat();
       if(parcela<=(salario*0.3)){
           System.out.print("sim");
       } else{
           System.out.print("nao");
       }
        
    }
    
}
