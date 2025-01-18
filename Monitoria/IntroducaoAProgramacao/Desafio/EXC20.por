programa {
  funcao inicio() {
    
    //Refeição
    inteiro prato, sobremesa, bebida, refeicao = 0
    //Prato
    inteiro vegetariano, peixe, frango, carne 
    //Sobremesa
    inteiro abacaxi, sorvete, mouse, mouse_c
    //Bebida
    inteiro cha, suco_L, suco_M, refri


   	//Calorias dos pratos
    vegetariano =  180
    peixe = 230
    frango = 250
    carne = 350
    //Calorias das sobremesas 
    abacaxi = 75
    sorvete = 110
    mouse = 170 
    mouse_c = 200
    //Calorias das bebidas
    cha = 20
    suco_L = 70
    suco_M = 100
    refri = 65


    escreva("Informe o prato desejado: \n 1 - Vegetariano\n 2 – Peixe\n 3 – Frango\n 4 – Carne\n ")
      leia(prato)
      escolha(prato){
      	caso 1:
			refeicao = vegetariano
      	pare
      	caso 2: 
      		refeicao = peixe
      	pare
      	caso 3:
			refeicao = frango
      	pare
      	caso 4: 
      		refeicao = carne
      	pare
      	caso contrario:
			escreva("Opção inválida\n")
      	pare
      }
      se(prato==1){
      	refeicao = vegetariano
      }senao se(prato==2){
      	refeicao = peixe
      }senao se(prato==3){
      	refeicao = frango
      }senao se(prato==4){
      	refeicao = carne
      }senao{
      	escreva("Opção inválida\n")
      }
      
    escreva("Informe a sobremesa desejada: \n 1 – Abacaxi\n 2 – Sorvete diet\n 3 – Mouse diet\n 4 – Mouse chocolate\n")
      leia(sobremesa)
	escolha(prato){
      	caso 1:
			refeicao += abacaxi
      	pare
      	caso 2: 
      		refeicao =  refeicao + sorvete
      	pare
      	caso 3:
			refeicao += mouse
      	pare
      	caso 4: 
      		refeicao += mouse_c
      	pare
      	caso contrario:
			escreva("Opção inválida\n")
      	pare
      }
      
      
       
    escreva("Informe a bebida desejada: \n 1 – Chá\n 2 - Suco de laranja\n 3 – Suco de melão\n 4 – Refrigerante diet\n")
      leia(bebida)
	escolha(prato){
      	caso 1:
			refeicao += cha
      	pare
      	caso 2: 
      		refeicao =  refeicao + suco_L
      	pare
      	caso 3:
			refeicao += suco_M
      	pare
      	caso 4: 
      		refeicao += refri
      	pare
      	caso contrario:
			escreva("Opção inválida\n")
      	pare
      }
      
     

   escreva("A quantidade total de calorias da sua refeição será: "+ refeicao +" Calorias!")
    
    
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2006; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */