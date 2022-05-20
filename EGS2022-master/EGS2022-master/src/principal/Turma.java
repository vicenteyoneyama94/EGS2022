package principal;

import java.util.Scanner;

public class Turma {

	String nome;
	int numeroMinimo;
	int anoIngresso;

	public void cadastraTurma() {
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite o nome da turma:");
		nome = tecla.nextLine();
		System.out.println("Digite o numero minimo:");
		numeroMinimo = tecla.nextInt();
		System.out.println("Digite o ano de ingresso:");
		anoIngresso = tecla.nextInt();
	}

}
