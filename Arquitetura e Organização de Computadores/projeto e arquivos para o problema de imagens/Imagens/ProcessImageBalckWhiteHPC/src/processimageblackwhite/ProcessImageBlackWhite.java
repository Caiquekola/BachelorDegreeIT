package processimagebalckwhite;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


class ProcessImageBlackWhite extends Thread{

    public static int[][] lerPixels(String caminho) {

        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(caminho));
            int largura = bufferedImage.getWidth(null);
            int altura = bufferedImage.getHeight(null);

            int[][] pixels = new int[largura][altura];
            for (int i = 0; i < largura; i++) {
                for (int j = 0; j < altura; j++) {
                    //normalizando de forma simplificada para imagem escala de cinza (é esperado ocorrer "clareamento")
                    float vermelho = new Color(bufferedImage.getRGB(i, j)).getRed();
                    float verde = new Color(bufferedImage.getRGB(i, j)).getGreen();
                    float azul = new Color(bufferedImage.getRGB(i, j)).getBlue();
                    int escalaCinza = (int) (vermelho + verde + azul) / 3;

                    pixels[i][j] = escalaCinza;
                }
            }

            return pixels;
        } catch (IOException ex) {
            System.err.println("Erro no caminho indicado pela imagem");
        }

        return null;
    }

    public static void gravarPixels(String caminhoGravar, int pixels[][]) {

        caminhoGravar = caminhoGravar
                .replace(".png", "_modificado.png")
                .replace(".jpg", "_modificado.jpg");

        int largura = pixels.length;
        int altura = pixels[0].length;

        BufferedImage imagem = new BufferedImage(largura, altura, BufferedImage.TYPE_BYTE_GRAY);

        //transformando a mat. em um vetor de bytes
        byte bytesPixels[] = new byte[largura * altura];
        for (int x = 0; x < largura; x++) {
            for (int y = 0; y < altura; y++) {
                bytesPixels[y * (largura) + x] = (byte) pixels[x][y];
            }
        }

        //copaindo todos os bytes para a nova imagem
        imagem.getRaster().setDataElements(0, 0, largura, altura, bytesPixels);

        //criamos o arquivo e gravamos os bytes da imagem nele
        File ImageFile = new File(caminhoGravar);
        try {
            ImageIO.write(imagem, "png", ImageFile);
            System.out.println("Nova Imagem dispon. em: " + caminhoGravar);
        } catch (IOException e) {
            System.err.println("Erro no caminho indicado pela imagem");
        }
    }

    /**
     * Varre toda a matriz de pixels à procura de pontos pretos (0)
     * ou brancos (255) [do efeito salt and pepper] e substitui pelos pixels ao redor.
     * Usa a técnica de média dos valores em uma máscara 3x3.
     *
     * @return Retorna uma matriz de pixels com os pontos corrigidos.
     */
    public int[][] corrigirImagem(int imgMat[][]){
        int limLinha = imgMat.length - 1;
        int limColuna = imgMat[0].length - 1;
        
        if(linhaF >= limLinha) linhaF = limLinha;
        
        for (int linha = linhaI; linha <= linhaF; linha++) { //percorre as linhas
            for (int coluna = 0; coluna <= limColuna; coluna++) { //percorre as colunas
                
                int pixel = imgMat[linha][coluna];
                if (pixel == 0 || pixel == 255) { //testa se é preto ou branco
                    int soma = 0;
                    int div = 0;
                    for (int l = -1; l <= 1; l++) { //roda a mini matriz 3x3 (máscara)
                        for (int c = -1; c <= 1; c++) {
                            int lin = linha + l;
                            int col = coluna + c;
                            if ( !(lin < 0 || col < 0) &&
                                    (lin <= limLinha && col <= limColuna)) { //se a posição for válida
                                int pix = imgMat[lin][col];
                                if (!(pix == 0 || pix == 255)) { //se n for preto/branco
                                    div++;
                                    soma += pix;
                                }
                            }
                        }
                        if (div != 0) {
                            int novaCor = soma / div;
                            imgMat[linha][coluna] = novaCor;
                        }
                    }
                }
            }
        }
        return imgMat;
    }
    @Override
    public void run(){
        corrigirImagem(imgMat);
    }

    private static int imgMat[][];
    private int linhaI;
    private int linhaF;

    public ProcessImageBlackWhite(int imgMat[][], int linhaI, int linhaF) {
        this.imgMat = imgMat;
        this.linhaI = linhaI;
        this.linhaF = linhaF;
    }
}

class Main{
    public static void main(String args[]){

        File directory = new File("C:\\Users\\Caio Rievers\\Desktop\\Imagens\\modificadas");
        File imagesFile[] = directory.listFiles();

        int numeroThreads = Runtime.getRuntime().availableProcessors();
        int linhaIni = 0;
        int qntPorLinha=0;
        ProcessImageBlackWhite[] processadores = new ProcessImageBlackWhite[numeroThreads];

        for(File img : imagesFile){
            int imgMat[][] = ProcessImageBlackWhite.lerPixels(img.getAbsolutePath());

            qntPorLinha = imgMat.length/numeroThreads;
            linhaIni = 0;

            for (int i = 0; i < numeroThreads; i++) {

                processadores[i] = new ProcessImageBlackWhite(imgMat,linhaIni,linhaIni+qntPorLinha);
                processadores[i].start();

                if(i!=numeroThreads-1){
                    linhaIni += qntPorLinha+1;
                }else{
                    linhaIni = imgMat.length-linhaIni-1;
                }

            }
            //grava nova imagem com as correções
            for (ProcessImageBlackWhite p: processadores){
                try {
                    p.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(imgMat != null){
                ProcessImageBlackWhite.gravarPixels(img.getAbsolutePath(), imgMat);
            }
        }

    }
}
