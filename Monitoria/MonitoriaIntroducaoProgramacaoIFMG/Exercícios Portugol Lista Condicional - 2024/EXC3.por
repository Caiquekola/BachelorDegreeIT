programa
{
	//Lista Condicional EXC 3
	funcao inicio()
	{
		/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após,
		calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo
		atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a
		mensagem 'Saldo Negativo'.
		*/

		inteiro numConta
		real saldo, debito, credito, saldoAtual
		escreva("Número da conta: ")
		leia(numConta)
		escreva("Saldo: R$")
		leia(saldo)
		escreva("Débito: R$")
		leia(debito)
		escreva("Crédito: R$")
		leia(credito)

		saldoAtual = saldo - debito + credito

		se(saldoAtual>=0){
			escreva("Saldo positivo: R$"+saldoAtual)
		}senao{
			escreva("Saldo negativo: R$"+saldoAtual)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */