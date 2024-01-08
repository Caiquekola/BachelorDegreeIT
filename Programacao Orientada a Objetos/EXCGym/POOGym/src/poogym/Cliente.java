package poogym;
import java.util.ArrayList;
public class Cliente {
    
    public Cliente(String Nome, String Cpf, String Telefone, String endereco){
        this.nome = Nome;
        this.cpf = Cpf;
        this.telefone = Telefone;
        this.endereco = endereco;
    }
    public Cliente(){
        
    }
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private CorpoCliente corpoCliente;
    private ArrayList<Ficha> ficha=new ArrayList<Ficha>();
    private int qntFichas=0;

    public CorpoCliente getCorpoCliente() {
        return corpoCliente;
    }

    public void setCorpoCliente(CorpoCliente corpoCliente) {
        this.corpoCliente = corpoCliente;
    }

    public int getQntFichas() {
        return qntFichas;
    }

    public void setQntFichas(int qntFichas) {
        this.qntFichas = qntFichas;
    }
    
    public ArrayList<Ficha> getFicha() {
        return ficha;
    }

    public void setFicha(ArrayList<Ficha> ficha) {
        this.ficha = ficha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void adcFicha(Ficha fichas){
        this.ficha.add(fichas);
    }
    
    public String toString(){
        String result = String.format("Nome: %s\nCpf: %s\n"
                + "Endereço: %s\nTelefone: %s",this.nome,this.cpf,
                this.endereco,this.telefone);
        return result;
    }
    
}
