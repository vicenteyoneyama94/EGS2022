#include <stdio.h>

int main(){
	float vet[30];
	for (int x = 0; x < 30; x++){
		printf("Digite o %d valores: ", x+1);
		scanf("%d", &vet[x]);
	}
	for (int x = 29; x >= 0; x--){
		printf("Os valores digitados são: %d\n", vet[x]);
	}
	return 0;
	
}
