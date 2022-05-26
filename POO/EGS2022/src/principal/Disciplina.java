package principal;

import java.util.Scanner;

public class Disciplina {

	String nome;
	int cargaHoraria;
	int anodisc;
	
	public void cadastraDisciplina() {
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite o nome da Disciplina:");
		nome = tecla.nextLine();
		System.out.println("Digite a carga horaria:");
		cargaHoraria = tecla.nextInt();
		System.out.println("Digite o ano:");
		anodisc = tecla.nextInt();
	}
}
