package atividadejava;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		float salbruto, adinoturno, horaex, desconto, salarioliquido;
		
		System.out.println("Digite seu salario: ");
		Scanner none= new Scanner(System.in);
		salbruto = none.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		Scanner nine= new Scanner(System.in);
		adinoturno = nine.nextFloat();
		
		System.out.println("Digite a hora extra: ");
		Scanner sc= new Scanner(System.in);
		horaex = sc.nextFloat();
		
		System.out.println("Digite o desconto: ");
		Scanner sa= new Scanner(System.in);
		desconto = sa.nextFloat();

		salarioliquido = salbruto + adinoturno + (horaex *5) - desconto;
		System.out.printf("Salario Liquido:%.2f %n " ,salarioliquido);
	}

}
