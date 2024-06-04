package atividadejava;

import java.util.Locale;
import java.util.Scanner;


public class Atividade4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, resultado;
		  
		
		System.out.println("Digite o Numero1: ");
		n1 = sc.nextFloat();
		
		
		System.out.println("Digite o Numero 2: ");
		n2 = sc.nextFloat();		
		
		
		System.out.println("Digite Numero 3: ");
		n3 = sc.nextFloat();
		
		System.out.println("Digite Numero 4: ");
		n4 = sc.nextFloat();
		
		resultado = (n1*n2) - (n3*n4);
		
		System.out.printf("A diferença:%.2f %n ", resultado);
		
		sc.close();

	}

}
