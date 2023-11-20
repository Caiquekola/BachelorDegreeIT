package oop.Polimorfismo;
public class Preguica extends Animal{
    @Override
    public String somAnimal(){
        String som = "zZzzZz";
        return som;
    }
    @Override
    public String acao(){
        String acao = "Subir em árvore";
        return acao;
    }
}
