programa
{
	
	funcao inicio()
	{
		/*Construa um algoritmo que seja capaz de ler o preço de 3 produtos comprados. Calcular o
		preço total da compra. Sabendo-se que sobre o preço total da compra, o cliente terá um
		desconto de 15%. Seu algoritmo deverá calcular e escrever o preço final desta compra após ser
		o desconto.
		*/
		real prod1, prod2, prod3, precoTotal, precoTotalDesconto
		escreva("Informe o preço do produto 1: R$")
		leia(prod1)
		escreva("Informe o preço do produto 2: R$")
		leia(prod2)
		escreva("Informe o preço do produto 3: R$")
		leia(prod3)
		precoTotal = prod1+prod2+prod3
		precoTotalDesconto = precoTotal * 0.85
		escreva("\nPreço total: R$"+precoTotal)
		escreva("\nPreço total com desconto de 15%: R$"+precoTotalDesconto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */