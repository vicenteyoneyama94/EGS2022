#include <stdio.h>

struct livro{
	char nome[50];
	char editora[50];
	int isbn;
	int ano;
	int paginas;
	float preco;
};

int main(){
	struct livro livros[5];
	int soma = 0;
	float media = 0;
	for (int x = 0; x < 5; x++){
		printf("Informe o nome: ");
			scanf("%s", livros[x].nome);
		printf("Informe a editora: ");
			scanf("%s", livros[x].editora);
		printf("Informe o isbn: ");
			scanf("%d", livros[x].isbn);
		printf("Informe o ano: ");
			scanf("%d", livros[x].ano);
		printf("Informe a paginas: ");
			scanf("%d", livros[x].paginas);
		printf("Informe a preco: ");
			scanf("%f", livros[x].preco);
			soma = soma + livros[x].paginas;
	}
	media = soma / 5.0;
	printf("A media das paginas e: %f", media);
	return 0;
}
