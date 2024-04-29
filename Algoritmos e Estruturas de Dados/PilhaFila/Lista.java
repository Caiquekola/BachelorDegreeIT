package PilhaFila;

public class Lista {

  private final int MAX = 100;

  private int nAtualAlunos=0;

  private Aluno[] lista;



  public Lista() {

    lista = new Aluno[MAX];

  }

  public boolean vazia(){
     if(nAtualAlunos==0){
       return true;   
     }
     else{
         return false;
    }
}

  public boolean cheia(){
        if(nAtualAlunos==100){
            return true;
        }
        else{
            return false;
        }
}



  public void apagarLista(){
    lista = new Aluno[0];
}



  /* Insere novo elemento, x, na posição p da Lista. 

  Se L = a1, a2,... an então temos a1, a2,...ap-1 x ap+1 ... an. 

  Devolve true se sucesso, false c.c. (L não tem nenhuma posição p 

  ou Lista cheia). Operação para LISTA NÃO ORDENADA! */

  public boolean insereAlunoIndice(Aluno aluno, int indice){
      lista[indice] = new Aluno();
     if (indice > nAtualAlunos || nAtualAlunos >= MAX) {
        return false; // Posição inválida ou lista cheia
        }
     nAtualAlunos++;
    return true;

  }





    public static class Aluno {

      private String nome;

      private int cpf;



    Aluno(String _nome, int _cpf) {

      nome = _nome;

      cpf = _cpf;

    }
    Aluno(){
        
    }
  }

}