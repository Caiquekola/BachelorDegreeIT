public class Exercicio5 {
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

        ABB.exibirOrdemSimetrica(ABB.getRaiz());

        ArvoreBinaria ABB2 = new ArvoreBinaria();;
        ABB2.inserir(new Item(51));
        ABB2.inserir(new Item(99));
        System.out.println();
        ABB2.exibirOrdemSimetrica(ABB2.getRaiz());
        System.out.println("\n ABB1 E ABB2 são iguais?");
        System.out.println(ABB.equals(ABB2));

        ArvoreBinaria ABB3 = new ArvoreBinaria();

        ABB3.inserir(new Item(51));
        ABB3.inserir(new Item(99));

        System.out.println("\n ABB2 e ABB3 são iguais?");
        System.out.println(ABB2.igual(ABB3));

        System.out.println("\n ABB e ABB são iguais?");
        System.out.println(ABB.igual(ABB));

    }
}
