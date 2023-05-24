package aula_1;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaNotas;
		
		System.out.println("Digite as notas: ");
		nota1 = leia.nextFloat();
		nota2 = leia.nextFloat();
		nota3 = leia.nextFloat();
		nota4 = leia.nextFloat();
		
		mediaNotas = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média final é: " + mediaNotas);
	}
}