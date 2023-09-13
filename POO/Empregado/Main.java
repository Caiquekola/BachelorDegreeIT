/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Main {

   
    public static void main(String[] args) {
        Empregado a1 = new Empregado();
        Empregado a2 = new Empregado();
        a1.setNome("Caique");
        a1.setSobrenome("Augusto");
        a1.setSalarioMensal(3000);
        a2.setNome("Guilherme");
        a2.setSobrenome("Nascimento");
        a2.setSalarioMensal(1313);
        a1.dadosUsuario();
        a2.dadosUsuario();
        a1.aumentoSalarial(10);
        a2.aumentoSalarial(10);
        a1.dadosUsuario();
        a2.dadosUsuario();
    }

}
