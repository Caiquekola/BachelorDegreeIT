import java.net.ProtocolException;

class Main{
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


public class ArquivosABB {
    Arquivo arquivo;

    ArquivosABB(String nome, int dataUltimoAcesso){
        arquivo = new Arquivo(nome, dataUltimoAcesso);
    }

    public ArquivosABB(Arquivo arquivo) {
        this.arquivo = arquivo;
    }



    public boolean adicionarArquivo(Arquivo arquivo){
        Arquivo ponteiro = this.arquivo;
        return add(arquivo, ponteiro);
    }
    public boolean add(Arquivo arquivo, Arquivo ponteiro){
        if(ponteiro.getNome().compareToIgnoreCase(arquivo.getNome()) < 0){
            if(ponteiro.dir == null){
                ponteiro.dir = arquivo;
                return true;
            }
            return add(arquivo, ponteiro.dir);
        }else{
            if(ponteiro.esq == null){
                ponteiro.esq = arquivo;
                return true;
            }
            return add(arquivo, ponteiro.esq);
        }
    }


    public Arquivo menorArquivo(Arquivo arquivo){
        if(arquivo.esq!=null){
            return menorArquivo(arquivo.esq);
        }
        return arquivo;
    }
    //Excluir anteriores a essa data
    public Arquivo excluir(int data){
        Arquivo ponteiro = this.arquivo;
        return pop(data,ponteiro);
    }

    public Arquivo pop(int data, Arquivo arquivo){
        //Fim da recursividade e/ou tratamento p raiz nula
        if(arquivo == null){
            return null;
        }
        //Chamada recursiva para todos os filhos possíveis
        arquivo.esq = pop(data,arquivo.esq);
        arquivo.dir = pop(data,arquivo.dir);

        if(arquivo.dataUltAcesso < data){
            //Teste para ver se a exclusão tem um filho somente
            //Se tiver substitua por este
            if(arquivo.esq == null){
                return arquivo.dir;
            } else if(arquivo.dir == null){
                return arquivo.esq;
            }

            //Caso o nó tenha dois filhos, encontra o próximo valor ( em ordem )

            Arquivo paiArqSubst = arquivo;
            Arquivo arqSubst = arquivo.dir;

            while(arqSubst.esq != null){
                paiArqSubst = arqSubst;
                arqSubst = arqSubst.esq;
            }

            //Achado o substituo, altero os valores do nó atual para o nó EmOrdem
            arquivo = arqSubst;


            //Remoção do sucessor
            if(paiArqSubst != arquivo){
                paiArqSubst.esq = arqSubst.dir;
            }else{
                arquivo.dir = arqSubst.dir;
            }

            return arquivo;


        }



        return arquivo;


    }


    public Arquivo teste(Arquivo arqraiz, Arquivo pai){
        pai = new Arquivo("novo",5);
        return arqraiz;

    }
    private Arquivo buscarArquivoComPai(String nome, Arquivo arquivo, Arquivo pai){
        if(arquivo != null){ return null;}
        if(arquivo.getNome().equalsIgnoreCase(nome)){ return arquivo;}
        if(arquivo.getNome().compareTo(nome) < 0){

            return buscarArquivo(nome, arquivo.dir);
        }
        return buscarArquivo(nome, arquivo.esq);
    }


    private Arquivo buscarArquivo(String nome, Arquivo arquivo){
        if(arquivo != null){ return null;}
        if(arquivo.getNome().equalsIgnoreCase(nome)){ return arquivo;}
        if(arquivo.getNome().compareTo(nome) < 0){
            return buscarArquivo(nome, arquivo.dir);
        }
        return buscarArquivo(nome, arquivo.esq);
    }

    public int numeroArquivos(){
        return nArq(this.arquivo);
    }

    private int nArq(Arquivo arquivo){
        if(arquivo == null){return 0;}
        return 1 + nArq(arquivo.esq) + nArq(arquivo.dir);
    }

    void exibirArquivos(){
        exibirArquivosEmOrdem(this.arquivo);
    }
    void exibirArquivosEmOrdem(Arquivo arquivo){
        //Esquerda Raiz Direita
        if(arquivo == null){return;}
        exibirArquivosEmOrdem(arquivo.esq);
        System.out.println(arquivo);
        exibirArquivosEmOrdem(arquivo.dir);
    }
}

class Arquivo {
    //Chave será o nome.
    private String nome;
    int dataUltAcesso;
    Arquivo esq, dir;

    public Arquivo(String nome, int dataUltAcesso) {
        this.nome = nome;
        this.dataUltAcesso = dataUltAcesso;
    }

    public String getNome() {
        return nome;
    }

    public int getDataUltAcesso() {
        return dataUltAcesso;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", dataUltAcesso=" + dataUltAcesso +
                '}';
    }
}
