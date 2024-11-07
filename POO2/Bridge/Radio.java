
/**
 * Escreva uma descrição da classe TvQuePausa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Radio extends ControleRemoto
{
    public Radio(){
        super(new Dispositivo() {
            @Override
            public void botaoCinco() {
                System.out.println("Próxima faixa!");

            }

            @Override
            public void botaoSeis() {
                System.out.println("Faixa anterior!");

            }
        });
    }
    private boolean tocando=false;
    public void eject(){tocando=false;}

    public void botaoNove(){
        if (tocando){
            System.out.println("Música interrompida!");
        }
        else{
            tocando=true;

        }
    }





    
}
