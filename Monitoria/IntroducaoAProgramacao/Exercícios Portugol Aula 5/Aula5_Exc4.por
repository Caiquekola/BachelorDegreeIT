programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*
		 Dado as seguintes informações de um funcionário: Nome, idade cargo e 
		 o seu salário bruto
		considere:
			a) O salário bruto teve um reajuste de 38%.
			a) O funcionário receberá uma gratificação de 20% do salário bruto.
			a) O Salário total é descontado em 15%
			Faça um algoritmo para imprimir o Nome, idade, cargo, salário bruto 
			e salário líquido.
		*/
		cadeia nome, cargo
		inteiro idade
		real salarioBruto, salarioTotal = 0

		caracter opcao

		
		escreva("Informe o nome do funcionário: ")
		leia(nome)
		escreva("Informe o cargo do funcionário: ")
		leia(cargo)
		escreva("Informe a idade do funcionário: ")
		leia(idade)
		escreva("Informe o salário bruto do funcionário: ")
		leia(salarioBruto)
		escreva("Escolha uma opção (a,b,c): \n")
		escreva("a) O salário bruto teve um reajuste de 38%.\n")
		escreva("b) O funcionário receberá uma gratificação de 20% do salário bruto.\n")
		escreva("c) O Salário total é descontado em 15%\n")
		leia(opcao)
		escolha(opcao){
			caso 'a':
				salarioTotal = salarioBruto * 1.38
			pare
			caso 'b':
				salarioTotal = salarioBruto * 1.20
			pare
			caso 'c':
				salarioTotal = salarioBruto * 0.85
			pare
		}
		escreva("\nO salário total do funcionário '"+nome+"' é de : R$"+Matematica.arredondar(salarioTotal, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */