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
    public String maiorPais(){
        String maior;
        for (int i = 0; i < paises.size() ; i++) {
            
        }
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
        Country p1 = new Country("3232-4","Brasil",8000000);
        c1.paises.add(p1);
        System.out.println(c1.dimensao()+" km2");
    }

}
