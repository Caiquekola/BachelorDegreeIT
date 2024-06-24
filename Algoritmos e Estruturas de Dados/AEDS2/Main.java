/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Item{
    private String nome;
    private double preco;
    private int quantidade;
    
    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

class CarrinhoDeCompras{
    private List<Item> lista;
    public CarrinhoDeCompras(){
        lista = new ArrayList<>();
    }
    public adicionarItem(String nome, double preco, int quantidade){
        lista.add(new Item(nome,preco,quantidade));
    }
    public removerItem(String nome){
        List<Item> listaRemover = new ArrayList<>();
        for(List l: lista){
            l.
        }
    }
}