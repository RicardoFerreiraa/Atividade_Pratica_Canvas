package atividadejava;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		float salario;
		float abono;
		float novosalario;

		System.out.println("Digite seu Salario: ");
		Scanner scan = new Scanner(System.in);
		salario = scan.nextFloat();
		
		
		System.out.println("Digite o Abono: ");
		Scanner none = new Scanner(System.in);
		abono = none.nextFloat();
		
		novosalario = salario + abono ;
		
		System.out.println("Salario Atualizado: "+ novosalario);
	}
	

}
