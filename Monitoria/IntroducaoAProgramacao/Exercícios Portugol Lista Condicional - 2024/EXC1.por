programa
{
	//Lista Condicional EXC 1 
	funcao inicio()
	{
		/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras,
		sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de
		duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.*/

		inteiro horasIni, horasFim, horasTotais = 0
		escreva("Informe a hora de início: ")
		leia(horasIni)
		escreva("Informa a hora de fim de jogo: ")
		leia(horasFim)


		
		se(horasIni<horasFim){
			//Exemplo começou às 12h do dia 1 e terminou 15h do dia 1
			horasTotais = horasFim-horasIni
			escreva("Horas totais de jogo: "+horasTotais+" horas")
		}senao{
			//Exemplo começou às 20h terminou às 2h do dia 2
			horasTotais = (24-horasIni)+horasFim
			escreva("Horas totais de jogo: "+horasTotais+" horas")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */