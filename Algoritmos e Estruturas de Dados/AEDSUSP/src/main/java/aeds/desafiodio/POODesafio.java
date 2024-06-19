package aeds.desafiodio;

import org.w3c.dom.ls.LSOutput;

public class POODesafio {
    public static void main(String[] args) {
        ReprodutorMusical ipod =

    }
}
class Iphone implements NavegadorInternet,ReprodutorMusical,AparelhoTelefonico{
    private String modelo;
    private String marca;
    private boolean ligado = false;

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: "+url);
    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
interface NavegadorInternet{
    //exibirPagina(String url), adicionarNovaAba(), atualizarPagina()
    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public void atualizarPagina();
}
interface AparelhoTelefonico{
    //ligar(String numero), atender(), iniciarCorreioVoz()
    public void ligar(String numero);
    public void atender();
    public void iniciarCorreioVoz();
}
interface ReprodutorMusical{
    public void tocar();
    public void pausar();
    public void selecionarMusica(String musica);

}
