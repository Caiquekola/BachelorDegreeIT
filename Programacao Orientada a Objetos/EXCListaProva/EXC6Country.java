package exerciciospoo;
import java.util.ArrayList;

class Country{
    private String codigoISO;
    private int populacao;
    private String nome;
    private double area;
    private ArrayList<Country> fronteiras = new ArrayList<Country>();
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
        fronteiras.add(pais);
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
    //Um método que receba um país como parâmetro e retorne a lista 
    //de vizinhos comuns aos dois países.
    public String vizinhos(Country pais){
        ArrayList<String> comum = new ArrayList<String>();
        for (Country i: fronteiras) {
            if(fronteiras.contains(pais.fronteiras)){
                comum.add(pais.fronteiras.nome);
            }
        }
    }
}
public class EXC6Country {

    
    public static void main(String[] args) {
        Country brasil = new Country("3166-1","Brasil",8515767.049);
        Country anonimo = new Country("3166-1","Brasil",8515767.049);
        Country anonimo2 = new Country("3161-1","Brasil",8515767.049);
        System.out.println(brasil.equals(anonimo));
        System.out.println(brasil.equals(anonimo2));
        brasil.adcFronteira(anonimo);
        System.out.println(brasil.limitofe(anonimo));
        brasil.setPopulacao(200000000);
        System.out.printf("Densidade: %.2f hab/km2",brasil.densidadePop());
        
    }

}
