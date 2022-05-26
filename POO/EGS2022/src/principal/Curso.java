package principal;

import java.util.Scanner;

public class Curso {

	String nome;
	String dataCriacao;
	String periodo;
	
	public void cadastraCurso() {
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite o nome do curso:");
		nome = tecla.nextLine();
		System.out.println("Digite a data de criação do curso:");
		dataCriacao = tecla.nextLine();
		System.out.println("Digite o periodo do curso:");
		periodo = tecla.nextLine();
	}
}
