public class ArvoreBinaria {
    private Item raiz;
    public ArvoreBinaria() {
        this.raiz = null;
    }

    public boolean igual(ArvoreBinaria raizE) {
        if(raizE.getRaiz() == null|this.raiz == null){
            return false;
        }
        return identica(this.raiz, raizE.getRaiz());
    }
    private boolean identica(Item raiz, Item raizComp){
        if (raiz != null&&raizComp != null) {
            identica(raiz.esquerda, raizComp.esquerda);
            if(raiz.chave != raizComp.chave){
                return false;
            }
            identica(raiz.direita, raizComp.direita);
        }
        return true;
    }
    //    public int busca(int chave, Item raiz){
//    }

    public Item inserir(Item raiz, Item no) {
//        if(this.raiz==null){
//            this.raiz = no;
//            return no;
//        }
        if (raiz == null) {
            System.out.println("Adicionei o elemento "+no.chave);
            raiz = no;
            return no;
        }
        if(no.chave < raiz.chave){
            System.out.println("Elemento a esquerda de "+raiz.chave);
            raiz.esquerda = inserir(raiz.esquerda, no);
        }else{
            System.out.println("Elemento a direita de "+raiz.chave);
            raiz.direita = inserir(raiz.direita, no);
        }
        return raiz;
    }

    public void exibirPreOrdem(Item raiz){
        if(raiz!=null){
            System.out.print(raiz.chave+"(");
            exibirPreOrdem(raiz.esquerda);
            exibirPreOrdem(raiz.direita);
            System.out.print(")");
        }

    }

    public void exibirOrdemSimetrica(Item raiz){
        if(raiz!=null){

            exibirOrdemSimetrica(raiz.esquerda);
            System.out.print(raiz.chave+"<");
            exibirOrdemSimetrica(raiz.direita);
        }
    }
    public void exibirPosOrdem(Item raiz){
        if(raiz!=null){
            exibirPosOrdem(raiz.direita);
            System.out.print(raiz.chave+">");
            exibirPosOrdem(raiz.esquerda);
        }
    }

    public int maiorElemento(Item raiz){
        Item ponteiro = this.raiz;
        while(ponteiro.direita!=null){
            ponteiro = ponteiro.direita;
        }
        return ponteiro.chave;
    }
    public Item getRaiz() {
        return raiz;
    }
}

class Item{
    int chave;
    Item direita;
    Item esquerda;

    public Item(int chave, Item direita, Item esquerda) {
        this.chave = chave;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    public Item(int chave) {
        this.chave = chave;
        this.direita = null;
        this.esquerda = null;
    }
}

