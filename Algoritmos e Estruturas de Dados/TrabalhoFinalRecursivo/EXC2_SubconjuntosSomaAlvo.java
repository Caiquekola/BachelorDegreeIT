package TrabalhoFinalRecursivo;

import java.util.*;

public class EXC2_SubconjuntosSomaAlvo {
    
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5};
        int nAlvo = 5;
        encontrarSubconjuntos(vetor,nAlvo);
    }
    
    public static void encontrarSubconjuntos(int[] vetor, int alvo) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        buscarSubconjuntos(vetor, 0, alvo, new ArrayList<>(), subconjuntos);
        
        for (List<Integer> subconjunto : subconjuntos) {
            System.out.println(subconjunto);
        }
    }

    private static boolean buscarSubconjuntos(int[] vetor, int index, int alvo, List<Integer> atual, List<List<Integer>> subconjuntos) {
        if (alvo == 0) {
            subconjuntos.add(new ArrayList<>(atual));
            return true;
        }

        for (int i = index; i < vetor.length; i++) {
            if (alvo - vetor[i] >= 0) {
                atual.add(vetor[i]);
                buscarSubconjuntos(vetor, i + 1, alvo - vetor[i], atual, subconjuntos);
                atual.remove(atual.size() - 1);
            }
        }
        return false;
    }

    
}
