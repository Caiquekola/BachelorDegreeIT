package poo;

/**
 *
 * @author 0056837
 */
public class Gerente extends Funcionario {
    private int senha;
    private int nFuncGerenciados;
    public Gerente (String nome, String cpf, int senha){
        super(nome,cpf);
        this.senha = senha;
    }
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getnFuncGerenciados() {
        return nFuncGerenciados;
    }

    public void setnFuncGerenciados(int nFuncGerenciados) {
        this.nFuncGerenciados = nFuncGerenciados;
    }
}
