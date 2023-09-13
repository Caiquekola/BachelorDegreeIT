/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 0056837
 */
public class Empregado {
    private String nome, sobrenome;
    private double salarioMensal;
    
    public void setNome(String Nome){
        nome = Nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String Sobrenome){
        sobrenome = Sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSalarioMensal(double x){
        salarioMensal = x;
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }
    public void aumentoSalarial(double x){
        salarioMensal = ((x/100)+1)*salarioMensal;
    }
    public void dadosUsuario(){
        System.out.println(nome+" "+sobrenome);
        System.out.printf("Seu salario eh R$%.2f\n",salarioMensal);
    }
}
