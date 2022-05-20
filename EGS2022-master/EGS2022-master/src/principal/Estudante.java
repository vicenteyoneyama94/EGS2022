package principal;

import java.util.Scanner;

public class Estudante {

	String nome;
	String cpf;
	
	public void cadastraEstudante() {
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite o nome do estudante:");
		nome = tecla.nextLine();
		System.out.println("Digite o numero do CPF:");
		cpf = tecla.nextLine();
	}
}
