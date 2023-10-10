package ExerciciosPOO;

import java.util.ArrayList;

class Continente{
    String nome;
    //A
    public Continente(String nome){
        this.nome = nome;
    }
    //B
    ArrayList<Country> paises = new ArrayList<Country>();
    public void adcPaises(Country pais){
        paises.add(pais);
    }
    public void remPaises(Country pais){
        paises.remove(pais);
    }
    //C
    public double dimensao(){
        double total=0;
        for (int i = 0; i < paises.size(); i++) {
            total+=paises.get(i).getArea();
        }
        return total;
    }
    //D
    public int populacao(){
        int pop =0;
        for (int i = 0; i < paises.size(); i++) {
            pop+=paises.get(i).getPopulacao();
        }
        return pop;
    }
    //E
    public double densidade(){
        double densidade=0;
        for (int i = 0; i < paises.size(); i++) {
            densidade += paises.get(i).densidadePop();
        }
        return densidade;
    }
    //F
    public Country maiorPop(){
        int index=0;
        int maiorPop=0;
        for (int i = 0; i < paises.size() ; i++) {
            if(this.paises.get(i).getPopulacao()>maiorPop){
                maiorPop = this.paises.get(i).getPopulacao();
                index = i;
            }
        }
        return this.paises.get(index);
    }
    //G
    public Country menorPop(){
        int menorPop=2000000;
        int index=0;
        for (int i = 0; i < paises.size(); i++) {
            if(this.paises.get(i).getPopulacao()<menorPop){
                menorPop=this.paises.get(i).getPopulacao();
                index = i;
            }
        }
        return this.paises.get(index);
    }
    //H
    public Country maiorDimensao(){
        int index=0;
        double maiorDimensao=0;
        for (int i = 0; i < paises.size(); i++) {
            if(this.paises.get(i).getArea()>maiorDimensao){
                index=i;
                maiorDimensao = this.paises.get(i).getArea();
            }
        }
        return this.paises.get(index);
    }
    //I
    public Country menorDimensao(){
        int index=0;
        double maiorDimensao=999999999;
        for (int i = 0; i < paises.size(); i++) {
            if(this.paises.get(i).getArea()>maiorDimensao){
                index=i;
                maiorDimensao = this.paises.get(i).getArea();
            }
        }
        return this.paises.get(index);
    }
    //J
    public double razaoMaiorMenor(){
        double razao = this.maiorDimensao().getArea()/this.menorDimensao().getArea();
        return razao;
    }
}
class Country{
    private String codigoISO;
    private int populacao;
    private String nome;
    private double area;
    ArrayList<Country> fronteiras = new ArrayList<Country>();
    //A Construtor
    public Country(String ISO, String name, double dimensao){
        this.codigoISO = ISO;
        this.nome = name;
        this.area = dimensao;
    }
    
    //B getters
    public String getCodigoISO(){
        return this.codigoISO;
    }
    public int getPopulacao(){
        return this.populacao;
    }
    public String getNome(){
        return this.nome;
    }
    public double getArea(){
        return this.area;
    }
    //B setters
    public void setCodigoISO(String iso){
        this.codigoISO = iso;
    }
    public void setPopulacao(int pop){
        this.populacao = pop;
    }
    public void setNome(String name){
        this.nome = name;
    }
    public void setArea(double area){
        this.area = area;
    }
    //C mesmo país, isto é, mesmo valor semântico (mesmo codigo iso)
    public boolean equals(Country pais){
        if(this.codigoISO.equals(pais.codigoISO)){
            return true;
        }
        else{
            return false;
        }
    }
    
        
    //D adicionar pais a fronteira
    public void adcFronteira(Country pais){
        if(fronteiras.size()<40)
        {
            fronteiras.add(pais);
        }
    }
   //D limitrofe
    public boolean limitofe(Country pais){
        if(fronteiras.contains(pais)){
            return true;
        }else{
            return false;
        }
        
    }
    //E Densidade populacional
    public double densidadePop(){
        double densidade = this.populacao/this.area;
        return densidade;
    }
    //F 
//   Um método que receba um país como parâmetro e retorne a lista 
//   de vizinhos comuns aos dois países.
    public String vizinhos(Country pais){
        ArrayList<String> nomes = new ArrayList<String>();
        for (int i = 0; i < fronteiras.size(); i++) {
            for (int j = 0; j < pais.fronteiras.size(); j++) {
                if(this.fronteiras.get(i).getNome().equals(pais.fronteiras.get(j).getNome())){
                    nomes.add(pais.fronteiras.get(j).getNome());
                }
            }
        }
        String nomesLinha = nomes.toString();
        return nomesLinha;
    }
    
}
public class EXC7Continente {

    
    public static void main(String[] args) {
        Continente c1 = new Continente("South America");
        Country p1 = new Country("3232-4","Brasil",7000000); 
        Country p2 = new Country("3232-4","Italia",8000000);
        p1.setPopulacao(200000000);
        p2.setPopulacao(100);
        c1.paises.add(p1);
        c1.paises.add(p2);
        System.out.println(c1.dimensao()/1000+" mil km2");
        System.out.println(c1.maiorPop().getNome());
        System.out.println(c1.menorPop().getNome());
        System.out.println(String.format("%.2f",c1.razaoMaiorMenor()));
    }

}
