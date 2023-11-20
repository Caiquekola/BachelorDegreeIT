package oop.Polimorfismo;
public class Cachorro extends Animal{
    @Override
    public String somAnimal(){
        String som = "Auauau";
        return som;
    }
    @Override
    public String acao(){
        String acao = "Correr";
        return acao;
    }
}
