package aula_3;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		numero2= leia.nextInt();
		
		
		if (numero1 < numero2) {
			System.out.println("\nNo Intervalo entre " + numero1 + " e " + numero2 + ":\n");
			for (int i = numero1; i < numero2; i++) {
				if (i %3 == 0 && i %5 == 0) {
						System.out.println(i + " é multiplo de 3 e 5");
				}
			}
		} else {
			 System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo número.");
		}
	}
}
