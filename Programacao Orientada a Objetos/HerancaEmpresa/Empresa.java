package poo;

public class Empresa {
 public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Gerente g = new Gerente("Pedro","17173932788",1234);
        Diretor d = new Diretor("Cleitin","17171717171",1234,12);
        
        System.out.println("Eu sou o(a) "+g.getNome());
        System.out.println("");
        
    }
    
}
