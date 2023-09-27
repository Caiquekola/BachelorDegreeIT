public class EXC3Aeds {
    private static boolean primo(int N, int Cont,boolean logico){
        if(Cont>=N){return logico;}
        else{
            if(N%Cont==0){
            logico=false;
        }
        return primo(N,Cont+1,logico);}
    }
    public static void main(String[] args) {
        //Objetivo criar uma função recursiva que 
        //Verifica se o número é primo ou não
        int numero = 7;
        int contador = 2;
        boolean primim = true;
        System.out.println(primo(numero,contador,primim));
    }

}
