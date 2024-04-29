package aeds;

public class Lista {

  private static final int MAX = 3;

  protected static int nAtualAlunos=0;

  private static Aluno[] lista;

  //Aluno é uma classe e "lista" é um objeto (variável) do tipo Aluno
  //

  public Lista() {

    lista = new Aluno[MAX];

  }



  /*Retorna true  se lista vazia, false caso contrário*/

  public static boolean vazia(){
    if(nAtualAlunos==0){
        return true;
    }else{
        return false;
    }
  }



  public static boolean cheia(){
      if(nAtualAlunos==100){
         return true; 
      }
      else{
          return false;
      }
}



  public static void apagarLista(){
        lista = new Aluno[MAX];
}



  /* Insere novo elemento, x, na posição p da Lista. 

  Se L = a1, a2,... an então temos a1, a2,...ap-1 x ap+1 ... an. 

  Devolve true se sucesso, false c.c. (L não tem nenhuma posição p 

  ou Lista cheia). Operação para LISTA NÃO ORDENADA! */

  public static boolean insereAlunoIndice(Aluno aluno, int indice){
    nAtualAlunos++;
    lista[indice] = aluno;
    return true;

  }





    public static class Aluno {

      private String nome;

      private int cpf;

      

    Aluno(String _nome, int _cpf) {

      nome = _nome;

      cpf = _cpf;
      
    }
    

  }
    
    public static void main(String[] args){
        cheia();
    }
}