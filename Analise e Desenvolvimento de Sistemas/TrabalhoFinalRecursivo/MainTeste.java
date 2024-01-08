package TrabalhoFinalRecursivo;

public class MainTeste {

    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.addFim(1);
        lista.addFim(3);
        lista.addFim(4);
        lista.addFim(8);
        lista.listar();
        System.out.println("");
        System.out.println("Tamanho: " + lista.tamanhoNo());
        lista.removerNo(2);
        lista.listar();

        System.out.println("\nListaDupla");
        ListaDuplamenteEncadeada<Integer> lista2 = new ListaDuplamenteEncadeada<>();
        lista2.addFim(1);
        lista2.addFim(3);
        lista2.addFim(5);
        lista2.addFim(7);
        lista2.listar();
        lista2.exibirNo(3);
        lista2.removerNo(2);
        System.out.println("");
        lista2.listar();

        System.out.println("\nLista Dupla Circular");
        ListaDuplamenteEncadeadaCircular<Integer> lista3 = new ListaDuplamenteEncadeadaCircular<>();
        lista3.addFim(1);
        lista3.addFim(2);
        lista3.addFim(3);
        lista3.addFim(4);
        lista3.listar();
        
    }

}
