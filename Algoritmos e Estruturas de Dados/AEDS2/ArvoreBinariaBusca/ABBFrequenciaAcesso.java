class Teste{
    public static void main(String[] args) {
        ArquivosABB lista = new ArquivosABB(new Arquivo("Arq1",5));
        lista.exibirArquivos();
        System.out.println();
        lista.adicionarArquivo(new Arquivo("Arq2",7));
        lista.adicionarArquivo(new Arquivo("Arq",9));
        lista.adicionarArquivo(new Arquivo("Arq4",5));
        lista.adicionarArquivo(new Arquivo("Arq3",3));
        lista.exibirArquivos();

        lista.excluir(4);

        System.out.println();
        lista.exibirArquivos();

    }
}


class No {
    public int valor, qntAcesso;
    public No esq, dir;

    public No(int valor, int qntAcesso){
        this.valor = valor;
        this.qntAcesso = qntAcesso;
    }

    @Override
    public String toString() {
        return "{" +
                "valor=" + valor +
                ", qntAcesso=" + qntAcesso +
                '}';
    }
}

public class ABBFrequenciaAcesso {
    private No raiz;

    public ABBFrequenciaAcesso(){
        this.raiz = null;
    }
    public ABBFrequenciaAcesso(No raiz){
        this.raiz = raiz;
    }

    //Adição ✅
    //Busca ❌
    //"Reogarnizar" conforme os valores de acesso ❌


    public No busca(int valor){

    }

    public boolean adicionar(No no){
        if(this.raiz==null){
            this.raiz = no;
            return true;
        }
        return adicionar(no, this.raiz);
    }

    //Recursivo
    private boolean adicionar(No no, No raiz){
        if(no.valor<raiz.valor){
            if(raiz.esq==null){
                raiz.esq = no;
                return true;
            }
            adicionar(no, raiz.esq);
        }else{
            if(raiz.dir==null){
                raiz.dir = no;
                return true;
            }
            adicionar(no, raiz.dir);
        }
        return true;
    }


    public void exibir(){
        exibir(this.raiz);
    }
    private void exibir(No no){
        if(no==null){
            return;
        }
        exibir(no.esq);
        System.out.println(no);
        exibir(no.dir);

    }
}

class TesteABBFA{
    public static void main(String[] args) {
        ABBFrequenciaAcesso arvore = new ABBFrequenciaAcesso();
        arvore.adicionar(new No(3,0));
        arvore.adicionar(new No(1,0));
        arvore.adicionar(new No(2,0));
        arvore.adicionar(new No(4,0));
        arvore.adicionar(new No(5,0));

        arvore.exibir();


    }
}


