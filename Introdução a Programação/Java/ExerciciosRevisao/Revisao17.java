import java.util.Scanner;

public class Revisao17 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char gabarito[] = new char[10];
        int numAluno=0;
        char respAluno[] = new char[10];
        int notaAluno=0 ;
        int contador=0,quantidadeAluno=0,quantidadeAlunoAprovado=0;
        //a b c d e
        for (int i = 0; i < 10; i++) {
            gabarito[i] = scan.next().charAt(0);
        }
        numAluno=scan.nextInt();
        while(numAluno>0){
            
            
            for (int i = 0; i < 10; i++) {
                respAluno[i] = scan.next().charAt(0);
                if(respAluno[i]==(gabarito[i])){
                    notaAluno+=1;
                }
            }
            if(notaAluno>=5){
                quantidadeAlunoAprovado++;
            }
            quantidadeAluno++;
            contador++;
            numAluno=scan.nextInt();
        }
        float porcentagem=0;
        porcentagem = quantidadeAlunoAprovado/quantidadeAluno;
        System.out.println(porcentagem*100+"%");
   
    }

}
