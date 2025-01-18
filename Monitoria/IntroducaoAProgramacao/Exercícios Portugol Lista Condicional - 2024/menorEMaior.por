programa
{
	
	funcao inicio()
	{
		//Ler 10 valores, exibir maior número e o menor número 
		inteiro qntValores = 5, valor, maior = 0, menor = 9999999
		
		para(inteiro indice = 0; indice < qntValores; indice++){
			leia(valor)
			// 1 3 2
			se(valor>maior){
				maior = valor
			}
			se(valor<menor){
				menor = valor
			}
		}
		escreva(maior+"\n")
		escreva(menor)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */