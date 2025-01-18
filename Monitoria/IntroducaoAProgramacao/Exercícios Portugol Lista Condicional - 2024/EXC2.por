programa
{
	//Lista Condicional EXC 2
	funcao inicio()
	{
		/*- A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
		mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
		de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário
		por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras,
		caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/
		inteiro numHorasTrabalhadas = 0
		real salarioHora, salarioTotal

		escreva("Informe o número de horas trabalhadas na semana: ")
		leia(numHorasTrabalhadas)
		escreva("Informe o salário por hora: ")
		leia(salarioHora)
		
		se(numHorasTrabalhadas>40)
		{
			salarioTotal = (40 * salarioHora * 4) + (numHorasTrabalhadas-40) * (salarioHora*1.5) 
			// 40 * 4 = 160
			escreva("O salário total mensal é de: R$"+salarioTotal)
		}
		senao
		{
			salarioTotal = numHorasTrabalhadas * salarioHora * 4
			escreva("O salário total mensal é de: R$"+salarioTotal)
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 746; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */