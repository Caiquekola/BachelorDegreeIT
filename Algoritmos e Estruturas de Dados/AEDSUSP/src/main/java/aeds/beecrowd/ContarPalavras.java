package aeds.beecrowd;

public class ContarPalavras {
    public static void main(String[] args) {
        String string = "oi como vai voce";
        int contadorDePalavras = string.split("\\s").length;
        String string1[] = string.split("\s");
        System.out.println(contadorDePalavras);
        for(String st : string1){
            System.out.println(st);
        }
    }
}
