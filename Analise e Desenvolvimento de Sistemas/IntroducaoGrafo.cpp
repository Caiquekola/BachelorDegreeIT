

#include <stdio.h>


#define true 1;
#define false 0;
typedef int TipoChave;
typedef enum{esquerdo,direito}LADO;

typedef struct no{
    TipoChave chave;
    struct NO *esq, *dir;
}NO;

typedef PONT NO*; 

PONT criarRaiz(TipoChave chave){
    NO novoNo = (PONT)malloc(sizeof(NO));
	novoNo->chave = chave;
	novoNo->esq = NULL;
	novoNo->dir = NULL;
	return novoNo;
}



int main()
{
    

    return 0;
}
