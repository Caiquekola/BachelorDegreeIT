public class Exercicio7 {
    //O elemento mais a esquerda da sub arvore da direita
    public static void main(String[] args) {
        ArvoreBinaria ABB = new ArvoreBinaria();

        ABB.inserir(new Item(20));
        ABB.inserir(new Item(15));
        ABB.inserir(new Item(16));
        ABB.inserir(new Item(2));
        ABB.inserir(new Item(80));
        ABB.inserir(new Item(101));
        ABB.inserir(new Item(51));
        ABB.inserir(new Item(99));
        ABB.inserir(new Item(213));
        System.out.println("\n\n\n");
        ABB.exibirPreOrdem(ABB.getRaiz());
        System.out.println("\nSUCESSOR");
        //Senão tiver elementos lançar um RunTimeExcepption
        int elemento = 16;
        System.out.println(ABB.sucessor(elemento));


    }
}
