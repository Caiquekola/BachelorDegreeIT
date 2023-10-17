package PooGym;
public class Corpo {
    int idade;
    double altura;
    double peso;
    double cintura;
    double braco;
    double panturrilha;
    
    public Corpo(){
    }
    
    public Corpo(double height, double weight){
        this.altura = height;
        this.peso = weight;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0 && altura < 3) this.altura = altura;
        else System.out.println("Altura invalida!");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso > 0) this.peso = peso;
        else System.out.println("Peso invalido!");
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        if(cintura > 0) this.cintura = cintura;
    }

    public double getBraco() {
        return braco;
    }

    public void setBraco(double braco) {
        if(braco > 0) this.braco = braco;
    }

    public double getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(double panturrilha) {
        if(panturrilha > 0) this.panturrilha = panturrilha;
    }
    
    public double imc(){
        double result = this.peso / Math.pow(this.altura, 2);
        return result;
    }
    
    public void analisaImc(double imc){
        if(imc < 17) System.out.println("Muito abaixo do peso");
        else if(imc < 18.5) System.out.println("Abaixo do peso");
        else if(imc < 25) System.out.println("Peso normal");
        else if(imc < 30) System.out.println("Acima do peso");
        else if(imc < 35) System.out.println("Obesidade grau I");
        else if(imc < 40) System.out.println("Obesidade grau II");
        else System.out.println("Obesidade grau III");
    }
    
    //Para os homens = 66 + (13,8 x peso em kg) + (5 x altura em cm) – (6,8 x idade em anos)
    //Para as mulheres = 655 + (9,6 x peso em kg) + (1,8 x altura em cm) – (4,7 x idade em anos)
    
    public double tmb(){
        double tmb;
        //se homem{
        tmb = 66 + (13.8 * this.peso) + (5 * this.altura * 100) - (6.8 * this.idade);
        //se mulher{
        tmb = 655 + (9.6 * this.peso) + (1.8 * this.altura * 100) - (4.7 * this.idade);
        return tmb;
    }
}
