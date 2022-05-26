#include <stdio.h>

int main(){
	int mat [3][3];
	for (int x = 0; x < 3; x++){
		for (int y = 0; y < 3; y++){
				printf("Digite o %d valores: ", x+1);
				scanf("%d", &mat[x][y]);
		}
	}
	for (int x = 0; x >= 3; x++){
		for (int y = 0; y < 3; y++){
			if(x == y){
				printf("Os valores digitados são: %d\n", mat[x][y]);
			}
		}
	}
	return 0;
}
