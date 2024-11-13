
/**
 * Escreva uma descrição da classe TV aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TV extends Dispositivo
{
    public TV(int estado_, int maximo_){estado=estado_;maximo=maximo_;}
    
    public void botaoCinco(){
        System.out.println("Canal Down");
        estado--;
    }
    
    public void botaoSeis(){
        System.out.println("Canal UP"); estado++;
    }

}
