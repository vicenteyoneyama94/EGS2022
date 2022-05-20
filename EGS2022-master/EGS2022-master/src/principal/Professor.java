package principal;

import java.util.Scanner;

public class Professor {

	String nome;
	
	public void cadastraProfessor() {
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite o nome do Professor:");
		nome = tecla.nextLine();
	}
}
