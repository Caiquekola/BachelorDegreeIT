package TrabalhoFinalRecursivo;




public class EXC1_InteiroPBinarioRecursivo {
    
    public static void main(String[] args) {
        int nBits = 20;
        gerarNumBinario(nBits);
    }
    
    
    static void gerarNumBinario(int x){
        
        int comeco = 0;
        numBinario(x,comeco);
        
    }
    
    static void numBinario(int num,int comeco){
        if(comeco>num){
            return;
        }
        
        String vetor = "";
        if(num == 0||comeco==0){
            vetor ="0";
        }
        
        int aux = comeco;
        int aux2 = comeco;
        
        int vezes = 0;
        
        
        while(aux!=0){
            aux /= 2;
            vezes ++;
        }
        
        int intVetor[] = new int[vezes];
        
        for (int i = vezes-1; i >= 0; i--) {
            intVetor[i] = aux2%2;
            aux2 /= 2;
            
        }
        for (int i = 0; i < vezes; i++) {
            vetor += String.valueOf(intVetor[i]);
        }
        System.out.println(comeco+": "+vetor);
        comeco++;
        numBinario(num,comeco);
    }
    
    

}