package oop.Polimorfismo.EXC1;
public class OOP {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.somAnimal());
        Animal b = new Cachorro();
        System.out.println(b.somAnimal());
        Cachorro c = new Cachorro();
        System.out.println(c.somAnimal());
    }
    
}
