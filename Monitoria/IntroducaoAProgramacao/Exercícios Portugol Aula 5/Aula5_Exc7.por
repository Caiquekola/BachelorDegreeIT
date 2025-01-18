programa
{
	
	funcao inicio()
	{
		/*Construa um algoritmo que leia o nome, a idade, número de dependentes, o salário e o sexo de
		um funcionário de uma empresa. Analise cada questão abaixo. Seu algoritmo deverá dar uma
		solução a cada uma delas, calculando e escrevendo o salário obtido:
		● Quando o funcionário for homem e possuir número de dependentes acima de 7 seu
		salário deverá ter um aumento de 25%.
		● Quando o funcionário for um homem com idade superior a 55 anos seu salário deverá ter
		um aumento de 15%.
		11
		● Quando o funcionário for uma mulher, com idade superior a 40 anos ou número de
		dependente acima de 5, deverá ter um aumento de 30%.
		● Os demais funcionários deverão ter um aumento de 5%;
		● Se o usuário informar um sexo inválido seu algoritmo deverá detectar e informar ao
		usuário.
		*/
		cadeia nome
		inteiro idade, numeroDependentes
		real salario
		caracter sexo

		escreva("Informe o nome: ")
		leia(nome)
		escreva("Informe o sexo (m/f): ")
		leia(sexo)
		escreva("Informe a idade: ")
		leia(idade)
		escreva("Informe o salário: ")
		leia(salario)
		escreva("Informe número de Dependentes: ")
		leia(numeroDependentes)
		
		
		se(sexo=='m'){
			/*Quando o funcionário for homem e possuir número de dependentes acima de 7 seu
			salário deverá ter um aumento de 25%*/
			se(numeroDependentes>7){
				salario = salario * 1.25
			}

			/*Quando o funcionário for um homem com idade superior a 55 anos seu salário deverá ter
			um aumento de 15%.*/
			senao se(idade>55){
				salario = salario * 1.15
			} senao{
				/*Os demais funcionários deverão ter um aumento de 5%;*/
				salario = salario * 1.05
			}
		}senao se(sexo=='f'){
			/*Quando o funcionário for uma mulher, com idade superior a 40 anos ou número de
			dependente acima de 5, deverá ter um aumento de 30%.*/
			se(idade>40 ou numeroDependentes>5){
				salario = salario * 1.30
			}senao{
				/*Os demais funcionários deverão ter um aumento de 5%;*/
				salario = salario * 1.05
			}
			
		}senao {
			escreva("ERRO: Sexo inválido!")
		}
		escreva("Salário total final: R$"+salario)
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1678; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */