#include<stdio.h>

int main(){
	float salario[20];
	for (int x=0; x<20; x++){
		printf("Informe o %do. salario: ",x+1);
		scanf("%f", &salario[x]);
		}
	for (int x=0; x<20; x++){
		salario[x] = salario[x] * 1.08;
		printf("o novo salario %d e: %f", x, salario[x]);
		}
		return 0;
	}
