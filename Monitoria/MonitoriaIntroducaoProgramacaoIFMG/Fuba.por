
programa
{
inclua biblioteca Util --> random 

    funcao inicio()

    {
        // Solicita os dados iniciais ao usuário
        real distanciaInicial, velocidadeA, velocidadeB, percorreA = 0, percorreB = 0
        escreva("Informe a distância inicial entre os automóveis (em km): ")
        leia(distanciaInicial)
        escreva("Informe a velocidade do veículo A (em km/s): ")
        leia(velocidadeA)
        escreva("Informe a velocidade do veículo B (em km/s): ")
        leia(velocidadeB)
        

        // Inicializa as variáveis
        real posicaoA = 0
        real posicaoB = distanciaInicial
        real tempo = 0
        real velocidadeFuba = 3 // Fubá pode voar até 3 km/s
        real posicaoFuba = distanciaInicial / 2 // Fubá começa no meio da distância

        // Simula a busca segundo a segundo
        enquanto (posicaoA < posicaoB)
        {
		  para(inteiro i = 0; i < distanciaInicial; i++){
		  	se(posicaoA==i){
		  		escreva("S")
		  	}senao se(posicaoB==i){
		  		escreva("D")
		  	}senao se(i<posicaoA ou i>posicaoB){
		  		escreva("-")
		  	}
		  	se(i!=posicaoFuba){
		  		escreva(".")
		  	}senao{
		  		escreva("F")
		  	}
		  }
		  escreva("\n")
            // Atualiza as posições dos veículos e de Fubá
            posicaoA = posicaoA + velocidadeA
            posicaoB = posicaoB - velocidadeB
            posicaoFuba = posicaoFuba + (random.sorteia(-3, 3)) // Fubá pode voar para qualquer direção
			
            // Incrementa o tempo
            tempo = tempo + 1

            // Exibe as posições atuais
            escreva("Tempo: ", tempo, "s\n")
            escreva("Posição de Seu José (S): ", posicaoA, " km\n")
            escreva("Posição de Dona Maria (D): ", posicaoB, " km\n")
            escreva("Posição de Fubá (F): ", posicaoFuba, " km\n")
            escreva("Distância percorrida por Seu José: ", posicaoA, " km\n")
            escreva("Distância percorrida por Dona Maria: ", distanciaInicial - posicaoB, " km\n")
            escreva("Distância restante para encontro: ", posicaoB - posicaoA, " km\n\n")
			

            // Verifica se Fubá foi encontrado
            se (posicaoA >= posicaoFuba ou posicaoB <= posicaoFuba)
            {
                escreva("Fubá foi encontrado!\n")
                se (posicaoA >= posicaoFuba)
                {
                    escreva("Seu José encontrou Fubá primeiro.\n")
                }
                senao
                {
                    escreva("Dona Maria encontrou Fubá primeiro.\n")
                }
                escreva("Tempo total de busca: ", tempo, " segundos\n")
                pare
            }
        }
        
    }
}



  
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 611; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */