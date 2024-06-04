package atividadejava;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	 float nota1, nota2, nota3, nota4, media;
	 
	 System.out.println("Digite a primeira nota: ");
	 Scanner none = new Scanner(System.in);
	 nota1 = none.nextFloat();
	 
	 System.out.println("Digite a segunda nota: ");
	 Scanner sc = new Scanner(System.in);
	 nota2 = sc.nextFloat();
	 
	 System.out.println("Digite a terceira nota: ");
	 Scanner sa = new Scanner(System.in);
	 nota3 = sa.nextFloat();
	 
	 System.out.println("Digite a quarta nota: ");
	 Scanner ss = new Scanner(System.in);
	 nota4 = ss.nextFloat();
	 
	 media = (nota1 + nota2 + nota3 + nota4)/4;
	 
	 System.out.println("A média Final é: "+ media);
	}

}
