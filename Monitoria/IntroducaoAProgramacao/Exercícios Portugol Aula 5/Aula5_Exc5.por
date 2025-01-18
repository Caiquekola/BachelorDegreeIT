programa
{
	
	funcao inicio()
	{
		//Faça um algoritmo que leia os valores A, B, C e diga se a soma de A + B é menor que C.
		inteiro A, B,C
		escreva("Informe o valor de A: ")
		leia(A)
		escreva("Informe o valor de B: ")
		leia(B)
		escreva("Informe o valor de C: ")
		leia(C)
		se(A + B < C){
			escreva("A soma de A + B ("+(A+B)+") é menor que C "+C)
		}senao {
			escreva("A soma de A + B ("+(A+B)+") NAO é menor que C "+C)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */