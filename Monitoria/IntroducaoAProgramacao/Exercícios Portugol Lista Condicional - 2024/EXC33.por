programa
{
	//EXC 33 
	funcao inicio()
	{
		/*Faça um programa que leia o nome (nome1 e nome2) e a idade de duas pessoas (idade1 e
		idade2), informando quem é maior e quem é menor de idade, quem é a pessoa mais velha e
		quem é a mais nova, bem como a diferença de idade entre elas.
		*/
		cadeia nome1, nome2
		inteiro idade1, idade2, diferencaIdades = 0
		escreva("Informe o nome da primeira pessoa: ")
		leia(nome1)
		escreva("Informe a idade da primeira pessoa: ")
		leia(idade1)
		
		escreva("Informe o nome da primeira pessoa: ")
		leia(nome2)
		escreva("Informe a idade da primeira pessoa: ")
		leia(idade2)


		se(idade1>idade2){
			diferencaIdades = idade1 - idade2
			escreva("A pessoa mais velha é a '"+nome1+"' com '"+diferencaIdades+"' anos de diferença")
		}senao se(idade2>idade1){
			diferencaIdades = idade2 - idade1
			escreva("A pessoa mais velha é a '"+nome2+"' com '"+diferencaIdades+"' anos de diferença")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 622; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */