package ExerciciosPOO;

class Circulo{
    //A (receber o raio e o ponto do centro do círculo)
    double raio, x,y;
    public Circulo(double raio, double x, double y){
        this.raio = raio;
        this.x = x;
        this.y = y;
    }
    //B (recebe o raio e o meio do círculo é definido na origem)
    public Circulo(double raio){
        this.raio = raio;
        this.x = 0.0;
        this.y = 0.0;
    }
    //C (get;set do raio)
    public double getRaio(){
        return this.raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    //d 
    public void inflar(double qnt){
        if(qnt>0){
            this.raio+=qnt;
        }
    }
    //d
    public void desinflar(double qnt){
        if(qnt<raio){
            this.raio-=qnt;
        }
    }
    //E
    public void inflar(){
        this.raio+=1.0;
    }
    public void desinflar(){
        this.raio-=1.0;
    }
    //H (origem)
    public void mover(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public void mover(double a, double b){
        this.x = a;
        this.y = b;
    }
    //H???
    public void mover(Circulo obj){
        this.x = obj.x;
        this.y = obj.y;
    }
    //F Area do círculo
    public double area(){
        double area = Math.PI*Math.pow(this.raio,2);
        return area;
    }
    
}
public class EXC5Circulo {

    
    public static void main(String[] args) {
        
    }

}
