package poogym;
public class CorpoCliente {
    private int idade;
    private char sexo;
    private double altura;
    private double peso;
    private double cintura;
    private double braco;
    private double panturrilha;
    
    public CorpoCliente(){
    }
    
    public CorpoCliente(double height, double weight){
        this.altura = height;
        this.peso = weight;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) this.idade = idade;
        else System.out.println("Idade invalida!");
    }
    
    public void setSexo(String sexoT){
        char sexo = sexoT.toLowerCase().charAt(0);
        if(sexo == 'm' ||sexo =='f') this.sexo = sexo;
        else System.out.println("Sexo invalido! Inserir 'm' ou 'f'.");
    }

    public char getSexo(){
        return this.sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0 && altura < 2.5) this.altura = altura;
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
    public String mascOuFem(){
        if(this.sexo == 'm') return("masculino");
        else return("feminino");
    }
    public double imc(){ //indice de massa corporea
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
    
    public double tmb(){ // taxa metabolica basal aproximada
        double tmb;
        if(this.sexo == 'm'){
            tmb = 66 + (13.8 * this.peso) + (5.0 * this.altura * 100.0) - (6.8 * this.idade);
        }
        else{
            tmb = 655 + (9.6 * this.peso) + (1.8 * this.altura * 100) - (4.7 * this.idade);
        }
        return tmb;
    }
    
    public void infoGeral(){
        System.out.println("Idade......: " + this.idade + " anos");
        System.out.println("Sexo.......: "+mascOuFem());
        System.out.println("Altura.....: " + this.altura + "m");
        System.out.println("Peso.......: " + this.peso + "kg");
        System.out.println("Cintura....: " + this.cintura + "cm");
        System.out.println("Braco......: " + this.braco + "cm");
        System.out.println("Panturrilha: " + this.panturrilha + "cm");
    }
    
    public double agua(){ //resultado em mL
        double result;
        result = 35 * this.peso;
        return result;
    }
}
