public class Exercicio1 {
    public static void main(String[] args) {

        //Pré Ordem (Raiz,Esquerda,Direita) Árvore Binária

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        Item item4 = new Item(2,null,null);
        Item item5 = new Item(80,null,null);
        Item item6 = new Item(101,null,null);
        Item item7 = new Item(51,null,null);
        Item item8 = new Item(99,null,null);
        Item item9 = new Item(213,null,null);
        arvoreBinaria.inserir(new Item(20,null,null));
        arvoreBinaria.inserir(new Item(15,null,null));
        arvoreBinaria.inserir(new Item(16,null,null));
        arvoreBinaria.inserir(item4);
        arvoreBinaria.inserir(item5);
        arvoreBinaria.inserir(item6);
        arvoreBinaria.inserir(item8);
        arvoreBinaria.inserir(item9);
        arvoreBinaria.inserir(item7);


        System.out.println("\n \n Pré Ordem");
        arvoreBinaria.exibirPreOrdem(arvoreBinaria.getRaiz());
    }

}
