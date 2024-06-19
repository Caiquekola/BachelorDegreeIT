package aeds.EstadosBrasileirosAprendizado;

public enum EstadosBrasileiros{
    SAO_PAULO("SP","São Paulo"),
    MINAS_GERAIS("MG","Minas Gerais"),
    Teste_GITHUB("GT","GIt");

    private String sigla;
    private String nome;

    EstadosBrasileiros(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Teste{
    public static void main(String[] args) {
        for(EstadosBrasileiros e: EstadosBrasileiros.values()){
            System.out.println(e.getSigla());
        }

        EstadosBrasileiros eb =  EstadosBrasileiros.MINAS_GERAIS;
        System.out.println(eb.getNome());
    }
}