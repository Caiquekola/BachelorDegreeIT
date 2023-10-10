

class Pessoa{
    String nome;
    Pessoa mae;
    Pessoa pai;
    //A I
    Pessoa(String name,Pessoa mae,Pessoa pai){
        this.nome=name;
        this.mae=mae;
        this.pai=pai;
    }
    //A II
    Pessoa(String name){
        this.nome=name;
        this.mae=null;
        this.pai=null;
    }
    //B
    public boolean equals(Pessoa obj){
        if(this.nome==obj.nome&this.pai==obj.pai){
            return true;
        }
        else{
            return false;
        }
    }
    //C
    public boolean irmao(Pessoa obj){
        if(this.mae==obj.mae&this.pai==obj.pai|this.mae==obj.mae){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean antecessor(Pessoa obj){
        boolean verdade;
        if(obj.nome==this.mae.nome|obj.nome==this.pai.nome|this.mae.mae.nome==obj.nome|this.pai.pai.nome==obj.nome){
            return true;
        }
        else{
            return false;
        }
    }
}

public class EXC8Pessoa {

    
    public static void main(String[] args) {
        
    }

}
