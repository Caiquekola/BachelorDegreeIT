
/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{

    public static void main(String[] strgs){
        ControleRemoto tv1 = new TvQueFicaMuda(new TV(1,100));
        ControleRemoto tv2 = new TvQuePausa(new TV(1,200));
    
        System.out.println("Testando a TV que fica muda:");
        tv1.botaoCinco();
        tv1.botaoSeis();
        tv1.botaoNove();
        
        System.out.println("Testando a TV que pausa:");
        tv2.botaoCinco();
        tv2.botaoSeis();
        tv2.botaoNove();

        ControleRemoto bluray1 = new BluRay();
        bluray1.botaoCinco();
        bluray1.botaoSeis();
        bluray1.botaoNove();

        ControleRemoto radio = new BluRay();
        bluray1.botaoCinco();
        bluray1.botaoSeis();
        bluray1.botaoNove();
        
    }

}
