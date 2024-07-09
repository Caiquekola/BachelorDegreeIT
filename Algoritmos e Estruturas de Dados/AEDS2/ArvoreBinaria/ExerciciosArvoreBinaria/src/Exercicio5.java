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

        ArvoreBinaria ABB2 = new ArvoreBinaria();;
        ABB2.inserir(new Item(51));
        ABB2.inserir(new Item(99));

        ArvoreBinaria ABB3 = new ArvoreBinaria();
        ABB3.inserir(new Item(51));
        ABB3.inserir(new Item(99));


        System.out.println("\n\nABB1");
        ABB.exibirOrdemSimetrica(ABB.getRaiz());
        System.out.println("\nABB2");
        ABB2.exibirOrdemSimetrica(ABB2.getRaiz());
        System.out.println("\nABB3");
        ABB3.exibirOrdemSimetrica(ABB3.getRaiz());

        System.out.println("\nABB1 E ABB2 são iguais? "+(ABB.igual(ABB2)?"Sim":"Nao"));
        System.out.println("ABB2 e ABB3 são iguais? " +(ABB2.igual(ABB3)?"Sim":"Nao"));
        System.out.println("ABB1 e ABB3 são iguais? "+(ABB.igual(ABB3)?"Sim":"Nao"));
        System.out.print("ABB e ABB são iguais? "+(ABB.igual(ABB)?"Sim":"Nao"));

    }
}
