package LinkedList;
class Ursinho{
    private String nome;
    private int id;
    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public Ursinho(String nome,int id){
        this.nome = nome;
        this.id = id;
    }
}
class Lista{
    private int nAtualUrsinho=0;
    private Ursinho[] lista;
    private final int MAX = 100;

    public int getnAtualUrsinho() {
        return nAtualUrsinho;
    }

    public void setnAtualUrsinho(int nAtualUrsinho) {
        this.nAtualUrsinho = nAtualUrsinho;
    }
    public Lista(){
        lista = new Ursinho[MAX];
    }
    
    public boolean vazia(){
        for(Ursinho i:lista){
            if(i.getId()!=0&i.getNome()!=null){
                return false;
            }
        }
        return true;
    }
    public boolean cheia(){
        for(Ursinho i: lista){
            if(i.getId()==0&i.getNome()==null){
                return false;
            }
        }
        return true;
    }
    
    public boolean insereUrsinho(Ursinho ursinho, int Indice){
        if(this.lista[Indice].getNome()==null&&this.lista[Indice].getId()==0){
            lista[Indice] = new Ursinho(ursinho.getNome(),ursinho.getId());
            setnAtualUrsinho(getnAtualUrsinho()+1);
            return true;
            
        }else{
            return false;
        }
    }
    public void apagarLista(){
        lista = new Ursinho[MAX];
    }
}
public class ListaLinearEstatica {

    
    public static void main(String[] args) {
        Lista lista = new Lista();
        Ursinho kayle = new Ursinho("Kayle",1);
        lista.insereUrsinho(kayle,5);
        System.out.println(lista.cheia());
    }

}
