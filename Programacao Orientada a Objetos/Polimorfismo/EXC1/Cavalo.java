package oop.Polimorfismo.EXC1;
public class Cavalo extends Animal{
    @Override
    public String somAnimal(){
        String som = "iiirrrrí";
        return som;
    }
    @Override
    public String acao(){
        String acao ="Correr";
        return acao;
    }
}
