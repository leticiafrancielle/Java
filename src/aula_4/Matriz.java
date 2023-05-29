package aula_4;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		int matrizNumeros[][] = { { 7, 2, 3 }, { 4, 2, 1 }, { 7, 8, 2 } };

		int somatorioPrincipal = 0, somatorioSecundario = 0;

		System.out.println("Elementos da Diagonal Principal: ");

		for (int linha = 0; linha < matrizNumeros.length; linha++) {
			System.out.print(matrizNumeros[linha][linha] + " ");

		}

		System.out.println("\nElementos da Diagonal Secundária: ");

		for (int linha = 0; linha < matrizNumeros.length; linha++) {
			System.out.print(matrizNumeros[linha][matrizNumeros.length - 1 - linha] + " ");
		}

		System.out.println("\nSomatório Diagonal Principal: ");

		for (int linha = 0; linha < matrizNumeros.length; linha++) {
			somatorioPrincipal = somatorioPrincipal + matrizNumeros[linha][linha];
		}
		System.out.println(somatorioPrincipal);

		System.out.println("Somatório Diagonal Secundária: ");

		for (int linha = 0; linha < matrizNumeros.length; linha++) {
			somatorioSecundario = somatorioSecundario + matrizNumeros[linha][linha];
		}
		System.out.println(somatorioSecundario);
	}
}
