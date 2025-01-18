import java.util.Scanner;

public class alturaTurma {
    public static void main(String[] args) {

        int codigo = 0;
        double altura = 0;

        Scanner teclado = new Scanner(System.in);

        // short byte int long  float double

        double maiorAltura = 0, menorAltura = 3, somaAlturas = 0,
                somaAlturasMulheres = 0;
        int qntMulheres = 0;

        for (int i = 0; i < 50; i++) {
            altura = teclado.nextDouble();
            codigo = teclado.nextInt();

            somaAlturas += altura;

            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            if(altura < menorAltura){
                menorAltura = altura;
            }
            if(codigo == 2){
                somaAlturasMulheres += altura;
                qntMulheres ++;
            }


        }

        //Saida, Exibição, Impressão
        double mediaAlturas = somaAlturas / 50;
        double mediaAlturasMulheres = somaAlturasMulheres / qntMulheres;

        System.out.printf("%.2f\n",maiorAltura);
        System.out.printf("%.2f\n",menorAltura);
        System.out.printf("%.2f\n",mediaAlturasMulheres);
        System.out.printf("%.2f\n",mediaAlturas);

        
        
    }
}
