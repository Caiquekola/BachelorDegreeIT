/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package poo;

class Pessoa{
    int idade, dia, mes, ano;
    String nome;
    void ajustaDataDeNascimento(int d, int m, int a){
        //dia do nascimento
        dia = d;
        mes = m;
        ano = a;
    }
    void calculaIdade(int m, int a){
        //recebe a data atual e atribuie a idade
        if(mes>m){
            idade = a -ano;
        }else{
            idade = a-ano-1;
            
        }
    }
    void informaIdade(){
        System.out.printf("%s tem %d anos!\n",nome,idade);
    }
    void informaNome(){
        System.out.printf("Seu nome eh %s\n",nome);
    }
}

public class Pessoas {

    public static void main(String[] args) {
        /*Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascidoem14/3/1879) 
        e o outro representando Isaac Newton (nascido em 4/1/1643)*/
        Pessoa a1;
        a1 = new Pessoa();
        a1.nome = "Albert Einsten";
        a1.ajustaDataDeNascimento(14, 3, 1879);
        a1.calculaIdade(9, 2023);
        a1.informaIdade();
        a1.informaNome();
        Pessoa a2;
        a2 = new Pessoa();
        a2.nome = "Isaac Newton";
        a2.ajustaDataDeNascimento(4, 1, 1643);
        a2.calculaIdade(9, 2023);
        a2.informaIdade();
        a2.informaNome();
    }
    

}

