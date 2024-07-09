public class ArvoreBinaria {
    private Item raiz;
    public ArvoreBinaria() {
        this.raiz = null;
    }
    public Item getRaiz() {
        return raiz;
    }
    public void inserir(Item no) {
        if(this.raiz==null){
            this.raiz = no;
            System.out.println("Primeira raiz: "+no.chave);
            return;
        }
        Item ponteiro = this.raiz;
        while(true){
            if(no.chave<ponteiro.chave){
                if(ponteiro.esquerda == null){
                    System.out.println("Nó "+no.chave+" adicionada a esquerda de:" +ponteiro.chave);
                    ponteiro.esquerda = no;
                    break;
                }else{
                    System.out.println("Fui para a esquerda de : " +ponteiro.chave);
                    ponteiro = ponteiro.esquerda;
                }
            }else{
                if(ponteiro.direita == null){
                    System.out.println("Nó "+no.chave+" adicionada a direita de: " +ponteiro.chave);
                    ponteiro.direita = no;
                    break;
                }else{
                    System.out.println("Fui para a direita de : " +ponteiro.chave);
                    ponteiro = ponteiro.direita;
                }
            }
        }

    }


    //Exercício 1 - Pré Ordem
    public void exibirPreOrdem(Item raiz){
        if(raiz!=null){
            System.out.print(raiz.chave+"(");
            exibirPreOrdem(raiz.esquerda);
            exibirPreOrdem(raiz.direita);
            System.out.print(")");
        }

    }
    //Exercício 2 - Simétrica ( Crescente )
    public void exibirOrdemSimetrica(Item raiz){
        if(raiz!=null){

            exibirOrdemSimetrica(raiz.esquerda);
            System.out.print(raiz.chave+" ");
            exibirOrdemSimetrica(raiz.direita);
        }
    }
    //Exercício 3 - Pós ordem ( decrescente )
    public void exibirPosOrdem(Item raiz){
        if(raiz!=null){
            exibirPosOrdem(raiz.direita);
            System.out.print(raiz.chave+" ");
            exibirPosOrdem(raiz.esquerda);
        }
    }
    //Exercício 5 - Essa função chama a identica() que é recursiva
    public boolean igual(ArvoreBinaria raizE) {
        if(raizE.getRaiz() == null|this.raiz == null){
            return false;
        }
        return identica(this.raiz, raizE.getRaiz());
    }
    //Exercício 5 - é recursiva
    private boolean identica(Item raiz, Item raizComp){
        if(raiz == null|raizComp == null){
            return false;
        }
        if (raiz != null&&raizComp != null) {
            identica(raiz.esquerda, raizComp.esquerda);
            if(raiz.chave != raizComp.chave){
                return false;
            }
            identica(raiz.direita, raizComp.direita);
        }
        return true;
    }
    //Exercício 6 - Maior elemento da árvore binária
    public int maiorElemento(Item raiz){
        Item ponteiro = raiz;
        while(ponteiro.direita!=null){
            ponteiro = ponteiro.direita;
        }
        return ponteiro.chave;
    }
    /*Exercício 7 - Sucessor de uma chave {Faço a busca da chave, se tiver elemento a
    direita da chave, e se possuir elemento a esquerda da direita da chave buscada, retorno a chave mais a
    esquerda. Senão retorno o elemento da direita da chave. Se a chave não possuir elemento a direita então retorno o seu pai.
    Senão tiver pai retorno ele ou nulo*/
    public int sucessor(int chave){
        Item ponteiro = this.raiz;
        return buscaSucessor(chave, ponteiro, ponteiro);
    }
    public int buscaSucessor(int chave, Item raiz, Item pai){
        if (raiz.chave == chave){
            //Achei a chave (Nó)
            if(raiz.direita==null){
                if(pai.chave>chave){
                    return pai.chave;
                }else{
                    //Buscar vô
                    Item ponteiro = this.raiz;
                    while(true){
                        if(pai.chave<ponteiro.chave){
                            if(ponteiro.esquerda==pai&&ponteiro.chave>raiz.chave){
                                return ponteiro.chave;
                            }
                            ponteiro = ponteiro.esquerda;
                        }else{
                            if(ponteiro.direita==pai){
                                if(ponteiro.chave>raiz.chave){
                                    return ponteiro.chave;
                                }else{
                                    throw new RuntimeException("Não existe um sucessor");
                                }
                            } else if (pai.chave > ponteiro.chave){
                                ponteiro = ponteiro.direita;
                            }
                        }


                    }
                }
            }else if(raiz.direita.esquerda!=null){
                raiz = raiz.direita;
                while(raiz.esquerda!=null){
                    raiz = raiz.esquerda;
                }
                return raiz.chave;
            }
            return raiz.direita.chave;
        }

        if(chave<raiz.chave&raiz.esquerda!=null){
            return buscaSucessor(chave, raiz.esquerda, raiz);
        }else if(raiz.direita!=null){
            return buscaSucessor(chave, raiz.direita, raiz);
        }

        throw new RuntimeException("Não existe um sucessor");
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

