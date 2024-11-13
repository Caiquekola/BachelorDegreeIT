
/**
 * Escreva uma descrição da classe TvQuePausa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TvQuePausa extends ControleRemoto
{
    private boolean pausada=false;
    public void unPause(){pausada=false;}
    
    public TvQuePausa(Dispositivo _disp){super(_disp);}
    
    public void botaoNove(){
        System.out.println("TV Pausada!");
        pausada=true;
    }
    
}
