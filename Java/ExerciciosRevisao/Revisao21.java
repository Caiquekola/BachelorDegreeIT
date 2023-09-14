import java.util.Scanner;
 
public class Revisao21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome[] = new String[5];
        float notas[][] = new float[4][5];
        float maiorNota[] = new float[5];
        int contadorLinha=0;
        for (int i = 0; i < 5; i++) {
            nome[i] = scan.nextLine(); 
        }
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                notas[i][j] = scan.nextFloat();
            }
             
        }
        for (int i = 0; i < 4; i++) 
        {
            
            for (int j = 0; j < 5; j++) 
            {
                if(notas[i][j]>maiorNota[contadorLinha]){
                    maiorNota[contadorLinha]=notas[i][j];
                }
                contadorLinha++; 
            }
            contadorLinha=0;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(nome[i]+" "+maiorNota[i]+"\n");
        }
 
    }

}
