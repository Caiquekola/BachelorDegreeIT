programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//Solicitar ao usuário 03 números. Informar o maior entre eles.
		inteiro num1, num2, num3

		
		escreva("Informe o 1° numero: ")
		leia(num1)
		escreva("Informe o 2° numero: ")
		leia(num2)
		escreva("Informe o 3° numero: ")
		leia(num3)
		// Se o primeiro número for maior ou igual o segundo então verifico
		// se ele também é maior que o terceiro número 
		se(num1>=num2 e num1>=num3){
			escreva("O maior número é o '"+num1+"'")
		}senao se(num2>=num1 e num2>=num3){
			escreva("O maior número é o '"+num2+"'")
		}senao se(num3>=num1 e num3>=num2){
			escreva("O maior número é o '"+num3+"'")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */