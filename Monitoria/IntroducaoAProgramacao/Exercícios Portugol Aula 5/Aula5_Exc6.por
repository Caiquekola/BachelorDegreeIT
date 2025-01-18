programa
{
	
	funcao inicio()
	{
		/*Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
		somar os dois, caso contrário multiplique A por B ao final do cálculo atribuir o valor para uma
		variável C.
		*/

		inteiro A, B, C
		escreva("Informe o valor de A: ")
		leia(A)
		escreva("Informe o valor de B: ")
		leia(B)
		se(A==B){
			C = A+B
			escreva("A + B foram somados: " + C)
		}senao{
			C = A * B
			escreva("A + B foram multiplicados: " + C)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */