programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//Variáveis
		real altura, pesoIdeal
		caracter sexo
		//Processamento
		escreva("Informe a altura (ex: 1.56): ")
		leia(altura)
		escreva("Informe o sexo (M/F): ")
		leia(sexo)
		se(sexo=='M'){
			pesoIdeal = (72.7*altura)-58
		}senao{
			pesoIdeal = (62.1*altura)-44.7
		}
		escreva("O seu peso ideal é: "+mat.arredondar(pesoIdeal, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */