
/**
 * Escreva uma descrição da classe Dispositivo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Dispositivo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public int estado, volume, maximo;
    
    public abstract void botaoCinco();
    public abstract void botaoSeis();
    public void botaoSete(){ volume++;
        System.out.println("Volume em: "+volume);
    }
    public void botaoOito(){ volume--;
        System.out.println("Volume em: "+volume);
    }
    public void feedbackDispositivo(){
        if(estado>maximo || estado <0)estado=0;
        System.out.println("Atualmente em: "+estado);
    }
    


}
