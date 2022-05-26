package principal;

import java.util.Scanner;

public class Matricula {

	String ra;
	String data;
	
	public void cadastraMatricula() {
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite o Registro Academico:");
		ra = tecla.nextLine();
		System.out.println("Digite a data do Registro:");
		data = tecla.nextLine();
	}
}
