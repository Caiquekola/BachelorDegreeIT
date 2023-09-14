package Loja;
import java.util.Scanner;

class Fatorial{
        int fatorial(int n){
        if(n==0) return 1;
        else
        return n*fatorial(n-1);
        }
    }
public class RecursividadeFatorial {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Fatorial r = new Fatorial();
        
        System.out.print("Digite o num de fatorial: ");
        int numFatorial = scan.nextInt();
        int fatorial = 1;
        int i = 2;
        while(i<=numFatorial){
            fatorial *= i;
            i++;
        }
        System.out.println(fatorial);
        int total = r.fatorial(numFatorial);
        System.out.println(total);
    }
    
}
