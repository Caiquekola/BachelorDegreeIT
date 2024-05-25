package aeds.listalinearsequencial;

import java.util.Locale;

public class listaLinear{
    private final int MAX = 5;
    private int nElementos;
    private Aluno[] lista;

    public listaLinear(){
        lista = new Aluno[MAX];
        nElementos = 0;
    }

    public boolean vazia(){
        return nElementos == 0;
    }

    public boolean cheia(){
        return nElementos == MAX;
    }

    public int tamanho(){
        return nElementos;
    }

    public boolean busca(Aluno aluno){
        for(int i = 0; i < nElementos; i++){
            if(lista[i]==aluno){
                return true;
            }
        }
        return false;
    }

    public void add(Aluno aluno){
        if(cheia()){
            System.out.println("ERRO! Lista cheia");
        }else{
            lista[nElementos] = aluno;
            nElementos++;
        }

    }

    public void add(String nome, int RA){
        if(cheia()){
            System.out.println("ERRO! Lista cheia");
        }else{
            Aluno aluno = new Aluno(nome,RA);
            add(aluno);
        }
    }
    public void excluir(Aluno aluno){
        
    }
    public void exibir(){
        for(int i = 0; i < nElementos; i++){
            System.out.print(lista[i]+" ");
        }
    }
}

class Aluno{
    private String nome;
    private int RA;

    public Aluno(String nome, int RA){
        this.nome = nome;
        this.RA = RA;
    }
    @Override
    public String toString(){
        String str = nome + " "+ RA;
        return str;
    }
}
