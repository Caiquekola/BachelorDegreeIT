/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author 0056837
 */
public class Diretor extends Gerente {
    public Diretor(String nome,String cpf,int senha,int codigo){
        super(nome,cpf,senha);
        this.codigo = codigo;
    }
    int codigo;
    String selo;
}
