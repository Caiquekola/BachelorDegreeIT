
import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();

        //7

        //Tipos primitivos das variáveis
        //inteiro real      caracter cadeia logico
        //int     double    char     String boolean

        //Estruturas de repetição
        //enquanto  faca_enquanto para
        //while     do_while      for

        //Estruturas condicionais
        //Se, Senao Se, Senao, Escolha
        //if, else  if, else , Switch


        //leia(num)
        //num = new Scanner(System.in).nextInt()

        //escreva()
        //System.out.print()



        String losango= "%";

        String quatroP = "%%%%";
        //0          %
        //1       %% % %%
        //2    %% %% % %% %%
        //3 %% %% %% % %% %% %%
        //4    %% %% % %% %%
        //5       %% % %%
        //6          %


        //Opção 1: Looping para todas as linhas
        //Opção 2: Looping até o meio e looping após o meio

        for (int i = 0; i < N; i++) {
            System.out.println(losango);

            if(i < N/2){
                losango += quatroP;
                //losango += "%%%%";
            }else{
                //Nome completo
                losango += "\b\b\b\b";
            }

        }
    }
}
