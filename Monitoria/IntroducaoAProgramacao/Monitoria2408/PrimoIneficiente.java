import java.util.Scanner;

public class PrimoIneficiente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int primos = 0;

        int qntDivisores = 0;

        do{
            numero = scanner.nextInt();
            qntDivisores = 0;
            for(int i = 1; i <= numero; i++){
                if(numero % i == 0){


                    qntDivisores++;
                    if(qntDivisores == 3){
                        break;
                    }
                }
            }

            if(qntDivisores == 2){
                primos++;
            }


        }while(numero>0);

        System.out.println(primos);

    }
}
