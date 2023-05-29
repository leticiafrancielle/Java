package aula_4;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeroDigitado;
		
		int vetorNumeros[] = {10, 5, 3, 7, 1, 4, 8, 9, 2, 6};
		
		
		System.out.println("Digite o número que deseja encontrar: ");
		numeroDigitado = leia.nextInt();
		
		for (int i = 0; i < vetorNumeros.length; i++) {
			if(numeroDigitado == vetorNumeros[i]) {
				System.out.println("O número " + numeroDigitado + "está localizado na posição: " + i); 
				return;
			}
		}
		System.out.println("O número " + numeroDigitado + " não foi encontrado!");
	}
}
