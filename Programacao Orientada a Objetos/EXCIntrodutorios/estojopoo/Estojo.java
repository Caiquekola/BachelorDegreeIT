/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estojopoo;

/**
 *
 * @author ADMIN
 */
public class Estojo {
    String cor, desenho;
    int canetas, lapis;
    boolean aberta;
    
    void Status(){
        System.out.println(cor+"\n "+desenho+"\n "+canetas+"\n "+lapis+"\n "+aberta);
    }
    
    
    void abrir(){
        aberta = true;
    }
    void fechar(){
        aberta = false;
    }
    void rmCanetas(){
        if(canetas>0){
            canetas--;
        }else{
            System.out.println("Nao ha canetas");
        }
    }
    void adcCanetas(int x){
        canetas+=x;
    }
    void rmLapis(){
        if(lapis>0){
            lapis--;
        }else{
            System.out.println("Nao ha lapis");
        }
    }
    void adcLapis(){
        lapis++;
    }
}
