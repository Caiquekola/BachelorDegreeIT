package exerciciospoo;
import java.util.ArrayList;

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
public class EXC6Country {

    
    public static void main(String[] args) {
        Country brasil = new Country("3166-1","Brasil",8515767.049);
        Country anonimo = new Country("3166-1","China",8515767.049);
        Country anonimo2 = new Country("3161-1","Italia",8515767.049);
        Country anonimo3 = new Country("3161-1","Russia",8515767.049);
        System.out.println(brasil.equals(anonimo));
        System.out.println(brasil.equals(anonimo2));
        brasil.adcFronteira(anonimo);
        brasil.adcFronteira(anonimo3);
        brasil.adcFronteira(anonimo2);
        anonimo.adcFronteira(anonimo2);
        anonimo.adcFronteira(anonimo3);
        System.out.println(brasil.limitofe(anonimo));
        brasil.setPopulacao(200000000);
        System.out.printf("Densidade: %.2f hab/km2\n",brasil.densidadePop());
        System.out.println(brasil.vizinhos(anonimo));
        System.out.println(brasil.fronteiras.get(0).getNome());
        System.out.println(brasil.fronteiras.get(1).getNome());
        System.out.println(brasil.fronteiras.get(2).getNome());
        
        
     
        
    }

}
