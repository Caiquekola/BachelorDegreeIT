
/**
 * Escreva uma descrição da classe ControleRemoto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class ControleRemoto
{
    private Dispositivo disp;
    
    public ControleRemoto(Dispositivo novo_){disp=novo_;}
    
    public void botaoCinco(){disp.botaoCinco();}
    public void botaoSeis(){disp.botaoSeis();}
    
    public void feedbackDispositivo(){disp.feedbackDispositivo();}
    
    public abstract void botaoNove();

}
