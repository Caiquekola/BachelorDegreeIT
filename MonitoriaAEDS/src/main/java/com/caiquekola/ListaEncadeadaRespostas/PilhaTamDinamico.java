package com.caiquekola.ListaEncadeadaRespostas;

public class PilhaTamDinamico {
    private int tamanhoPilha;
    private int[] pilha;
    private int topo = 0;
    //Construtor com tamanho varíavel de pilha
    public PilhaTamDinamico(int tamanhoPilha) {
        this.tamanhoPilha = tamanhoPilha;
        this.pilha = new int[tamanhoPilha];
    }
    //Construtor padrão com tamanho fixo de 100
    public PilhaTamDinamico() {
        this.tamanhoPilha = 100;
        this.pilha = new int[tamanhoPilha];
    }

    //Push, Pop, Print

    public void push(int item){
        if(topo!=tamanhoPilha-1){
            pilha[topo] = item;
            topo++;
        }
    }

    public void pop(){
        if(topo!=0){
            topo--;
        }
    }

    public int getTopo() {
        return topo;
    }

    public int getTamanhoPilha() {
        return tamanhoPilha;
    }

    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }

    public int[] getPilha() {
        return pilha;
    }
}

class PilhaTamDinamicoManipulacao{
    public static int testaMaisElementos(PilhaTamDinamico pilha, PilhaTamDinamico pilha2){
        if(pilha.getTopo()>pilha2.getTopo()){
            return 1;
        }else{
            return 0;
        }
    }

    public static int transferirElementos(PilhaTamDinamico p1, PilhaTamDinamico p2) {
        // Certifique-se de que p2 tenha capacidade suficiente para armazenar os elementos de p1
        if (p2.getTamanhoPilha() < p1.getTopo()) {
            System.out.println("Erro: A pilha destino não tem espaço suficiente.");
            return 0;
        }

        // Limpa a pilha destino antes de transferir
        while (p2.getTopo() > 0) {
            p2.pop();
        }

        // Transfere os elementos da pilha p1 para p2
        for (int i = 0; i < p1.getTopo(); i++) {
            p2.push(p1.getPilha()[i]);
        }

        // Exibe os elementos transferidos para p2
        for (int i = 0; i < p2.getTopo(); i++) {
            System.out.print(p2.getPilha()[i] + " ");
        }
        System.out.println();
        return 1;
    }

    public static void inverter(PilhaTamDinamico p1) {
        PilhaTamDinamico aux = new PilhaTamDinamico(p1.getTamanhoPilha());
        PilhaTamDinamico aux2 = new PilhaTamDinamico(p1.getTamanhoPilha());

        // Transfere todos os elementos de p1 para a pilha auxiliar aux
        while (p1.getTopo() > 0) {
            aux.push(p1.getPilha()[p1.getTopo() - 1]);
            p1.pop();
        }

        // Transfere os elementos de aux para aux2 (revertendo a ordem original)
        while (aux.getTopo() > 0) {
            aux2.push(aux.getPilha()[aux.getTopo() - 1]);
            aux.pop();
        }

        // Transfere os elementos de aux2 de volta para p1 (ordem invertida)
        while (aux2.getTopo() > 0) {
            p1.push(aux2.getPilha()[aux2.getTopo() - 1]);
            aux2.pop();
        }
    }


    public static int iguais(PilhaTamDinamico P1, PilhaTamDinamico P2) {
        if (P1.getTopo() != P2.getTopo()) {
            return 0; // Pilhas com tamanhos diferentes não são iguais
        }

        PilhaTamDinamico aux1 = new PilhaTamDinamico(P1.getTamanhoPilha());
        PilhaTamDinamico aux2 = new PilhaTamDinamico(P2.getTamanhoPilha());

        boolean saoIguais = true;

        // Compara os elementos das pilhas enquanto preserva os valores
        while (P1.getTopo() > 0 && saoIguais) {
            int elemento1 = P1.getPilha()[P1.getTopo() - 1];
            int elemento2 = P2.getPilha()[P2.getTopo() - 1];

            if (elemento1 != elemento2) {
                saoIguais = false; // Elementos diferentes
            }

            // Transfere os elementos para pilhas auxiliares
            aux1.push(elemento1);
            aux2.push(elemento2);

            P1.pop();
            P2.pop();
        }

        // Restaura os elementos originais para P1 e P2
        while (aux1.getTopo() > 0) {
            P1.push(aux1.getPilha()[aux1.getTopo() - 1]);
            aux1.pop();
        }

        while (aux2.getTopo() > 0) {
            P2.push(aux2.getPilha()[aux2.getTopo() - 1]);
            aux2.pop();
        }
        //1 para vdd e 0 para falso
        return saoIguais ? 1 : 0;
    }

}

class MainPilha{
    public static void main(String[] args) {
        PilhaTamDinamico p1 = new PilhaTamDinamico();
        PilhaTamDinamico p2 = new PilhaTamDinamico();

        p1.push(1);
        p1.push(2);
        p1.push(3);

        PilhaTamDinamicoManipulacao.transferirElementos(p1, p2);

        System.out.println("Antes de inverter:");
        for (int i = 0; i < p1.getTopo(); i++) {
            System.out.print(p1.getPilha()[i] + " ");
        }
        System.out.println();

        PilhaTamDinamicoManipulacao.inverter(p1);

        System.out.println("Depois de inverter:");
        for (int i = 0; i < p1.getTopo(); i++) {
            System.out.print(p1.getPilha()[i] + " ");
        }
        System.out.println();
    }
}