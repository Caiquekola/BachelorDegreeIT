
/**
 * Escreva uma descrição da classe TvQuePausa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BluRay extends ControleRemoto
{
    public BluRay(){
        super(new Dispositivo() {
            @Override
            public void botaoCinco() {
                System.out.println("Play!");

            }

            @Override
            public void botaoSeis() {
                System.out.println("Stop!");

            }
        });
    }
    private boolean discoIn=false;
    public void eject(){discoIn=false;}

    public void botaoNove(){
        System.out.println("Disco inserido!");
        discoIn=true;
    }

   



    
}
