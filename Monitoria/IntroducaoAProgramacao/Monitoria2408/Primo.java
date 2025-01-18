import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int primos = 0;

        boolean ehPrimo = true;


        while(numero > 0){
            ehPrimo = true;

            if(numero == 1){
                ehPrimo = false;
            }else{
                for(int i = 2; i * i < numero; i++){
                    // 1 % 2 == 0?
                    if(numero % i == 0){
                        ehPrimo = false;
                        break;

                    }
                    //...
                }
            }


            if(ehPrimo==true){
                primos++;
            }

            numero = teclado.nextInt();
        }

        System.out.println(numero);

    }


}
