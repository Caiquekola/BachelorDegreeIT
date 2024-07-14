
package poker_paralelo_arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Trabalhador extends Thread{

    private static Vector<File> arquivosProcessar = new Vector<>();
    
    private static final int royalFlush[][] = {{39,48,49,50,51},
                                                {26,35,36,37,38},
                                                {13,22,23,24,25},
                                                {0,9,10,11,12}};

    
    
    public void iniciaCartasComunitarias(Integer comunitarias[]){
        for(int i = 0; i < comunitarias.length;i++){
            comunitarias[i] = -1;
        }
    }
    
    public int normalizaNumero(String numeroLog){
        return Integer.parseInt(
            numeroLog.replaceAll("[ \"]",""));
    }
    
    public boolean ocorreuRoyalFlush(Integer comunitarias[], 
                                                Integer cartasUsuario[]){
        
        Vector<Integer> cartasJogo = new Vector<>();
        cartasJogo.addAll(Arrays.asList(comunitarias));
        cartasJogo.addAll(Arrays.asList(cartasUsuario));
        
        Collections.sort(cartasJogo);
        
        if(cartasJogo.size() >= 5){
        
            //vamos interar por cada possibilidade de flush
            for(int flush_i = 0; flush_i < royalFlush.length;flush_i++){
                //verificando as cartas do royalflush
                int indiceRoyal = 0;
                for(int i = 0; i < cartasJogo.size();i++){
                    if(indiceRoyal < 5 && cartasJogo.get(i) == royalFlush[flush_i][indiceRoyal]){
                        indiceRoyal++;
                    }
                }

                if(indiceRoyal == 5){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    public static void addArquivo(File arquivo){
        arquivosProcessar.add(arquivo);
    }
    
    public static void addArquivos(File arquivos[]){
        arquivosProcessar.addAll(Arrays.asList(arquivos));
    }
    
    private File retiraArquivoProcessar(){
        synchronized(arquivosProcessar){
            if(arquivosProcessar.isEmpty()){
                return null;
            }else{
                //estou removendo o ult. do vetor dinamico
                return arquivosProcessar.remove(arquivosProcessar.size()-1);
            }
        }
    }

    @Override
    public void run() {
        //caminho dos arquivos log - seu jose
        
        //executamos enquanto houver arquivos compartilhados a processar
        while(!arquivosProcessar.isEmpty()) {
            File arquivoAtual = retiraArquivoProcessar();

            try {

                if (arquivoAtual.isFile() && arquivoAtual.canRead()) {
                    FileReader marcaArquivoLeitura
                            = new FileReader(arquivoAtual);

                    BufferedReader bufLeitura
                            = new BufferedReader(marcaArquivoLeitura);

                    String linha = null;

                    Integer cartasComunitarias[] = {-1,-1,-1,-1,-1};
                    //aqui temos acesso a cada uma das linhas de UM arquivo
                    do {
                        linha = bufLeitura.readLine();

                        //se for a ULTIMA linha do documento PARA
                        if (linha == null) {
                            break;
                        }

                        String informacoesLinha[] = linha.split(",");

                        if (informacoesLinha.length >= 8) {
                            
                            if(informacoesLinha[6].equals("\"Community Cards\"")){
                                
                                iniciaCartasComunitarias(cartasComunitarias);
                                
                                //acessando as cartas comunitarias da RODADA
                                for(int carta = 9; carta <= 13;carta++){
                                    if(!informacoesLinha[carta].equals("\"\"")){
                                        //System.out.println(informacoesLinha[carta]);
                                        try{
                                        cartasComunitarias[carta-9] = 
                                                    normalizaNumero(informacoesLinha[carta]);
                                        }catch(NumberFormatException ex){
                                            //aqui tratamos o erro no log de valor None
                                            cartasComunitarias[carta-9] = -1;
                                        }

                                    }
                                }
                                
                            }else if(informacoesLinha[7].equals("\"W\"")){
                                
                                //System.out.println(informacoesLinha[3]);
                                
                                Integer cartasJogador[] = {
                                    normalizaNumero(informacoesLinha[9]),
                                    normalizaNumero(informacoesLinha[10])
                                };
                                
                                
                                //if(ocorreuDoisPares()){
                                if(linha.contains("Two Pairs")){
                                    //System.out.println("Venceu com dois pares");
                                    
                                }else{
                                    if(ocorreuRoyalFlush(cartasComunitarias, cartasJogador)){
                                        //System.out.println("Encontramos");
                                    }
                                } 
                            }
                        }

                    } while (true);

                }
            } catch (FileNotFoundException ex) {
                System.err.println("Arquivo não existe");
            } catch (IOException ex) {
                System.err.println("Arquivo corrompido em uso por outro processo.");
            }

        }
    }
    
    
    
}
