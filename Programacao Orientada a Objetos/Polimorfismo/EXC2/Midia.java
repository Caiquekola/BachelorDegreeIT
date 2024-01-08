package oop.Polimorfismo.EXC2;
public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    
    public Midia(){
        
    }
    public Midia(int c, double p, String n){
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }
    public String getTipo(){
        return "Midia";
    }
    public String getDetalhes(){
        return this.codigo+" - "+this.nome+" - R$"+this.preco;
    }
    public void printDados(){
        System.out.println(getTipo()+" "+getDetalhes());
    }
    public void inserirDados(int c, double p, String n){
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
